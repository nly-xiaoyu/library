package edu.hunau.hyx.mapper;

import edu.hunau.hyx.bean.PremenuExample;
import edu.hunau.hyx.bean.PremenuKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PremenuMapper {
    long countByExample(PremenuExample example);

    int deleteByExample(PremenuExample example);

    int deleteByPrimaryKey(PremenuKey key);

    int insert(PremenuKey record);

    int insertSelective(PremenuKey record);

    List<PremenuKey> selectByExample(PremenuExample example);

    int updateByExampleSelective(@Param("record") PremenuKey record, @Param("example") PremenuExample example);

    int updateByExample(@Param("record") PremenuKey record, @Param("example") PremenuExample example);
}