package edu.hunau.hyx.service;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * @author 五香加孜然
 * @creat2021--10--02--21:13
 */
@Service
public interface MenuService {
    public List<Map<String,Object>> selectMenuByPre(Integer premission);

}
