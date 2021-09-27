package edu.hunau.hyx.mapper;

import edu.hunau.hyx.bean.Premit;
import edu.hunau.hyx.bean.PremitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PremitMapper {
    long countByExample(PremitExample example);

    int deleteByExample(PremitExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Premit record);

    int insertSelective(Premit record);

    List<Premit> selectByExample(PremitExample example);

    Premit selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Premit record, @Param("example") PremitExample example);

    int updateByExample(@Param("record") Premit record, @Param("example") PremitExample example);

    int updateByPrimaryKeySelective(Premit record);

    int updateByPrimaryKey(Premit record);
}