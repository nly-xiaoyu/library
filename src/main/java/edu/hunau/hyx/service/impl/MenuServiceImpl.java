package edu.hunau.hyx.service.impl;

import edu.hunau.hyx.bean.Menu;
import edu.hunau.hyx.mapper.MenuMapper;
import edu.hunau.hyx.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 五香加孜然
 * @creat2021--10--02--21:16
 */
@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    MenuMapper menuMapper;
    @Override
    public List<Map<String, Object>> selectMenuByPre(Integer premission) {
        List<Map<String, Object>> list = menuMapper.selectAllMenu();
        List<Map<String, Object>> allMenu=new ArrayList<Map<String, Object>>();
        String s = premission.toString();
        for (Map<String, Object> map: list) {
            if(map.get("permission").toString().indexOf(s)==-1){
                continue;
            }
            int spread = Integer.parseInt(map.get("spread").toString());
            if (spread==1){
                map.put("spread",true);
            }else {
                map.put("spread",false);
            }
            allMenu.add(map);
        }
        List<Map<String, Object>> rootMenu = new ArrayList<Map<String, Object>>();
        for (Map<String, Object> nav : allMenu) {
            String parentId = String.valueOf(nav.get("pid"));
            if(parentId.equals("0")){//父节点是0的，为根节点。
                rootMenu.add(nav);
            }
        }
        //为根菜单设置子菜单，getClild是递归调用的
        for (Map<String, Object> nav : rootMenu) {
            /* 获取根节点下的所有子节点 使用getChild方法*/
            String id = String.valueOf(nav.get("id"));
            List<Map<String, Object>> childList = getChild(id, allMenu);
            nav.put("child", childList);
        }
        return rootMenu;
    }
    private List<Map<String, Object>> getChild(String id,List<Map<String, Object>> allMenu){
        //子菜单
        List<Map<String, Object>> childList = new ArrayList<Map<String, Object>>();
        for (Map<String, Object> nav : allMenu) {
            // 遍历所有节点，将所有菜单的父id与传过来的根节点的id比较
            //相等说明：为该根节点的子节点。
            String parentId = String.valueOf(nav.get("pid"));
            if(id.equals(parentId)){
                childList.add(nav);
            }
        }
        //递归
        for (Map<String, Object> nav : childList) {
            String tempId = String.valueOf(nav.get("id"));
            //nav.setChildren(,getChild(tempId, allMenu));
            nav.put("child", getChild(tempId, allMenu));
        }
        //Collections.sort(childList,order());//排序
        //如果节点下没有子节点，返回一个空List（递归退出）
        if(childList.size() == 0){
            return new ArrayList<Map<String, Object>>();
        }
        return childList;
    }
}
