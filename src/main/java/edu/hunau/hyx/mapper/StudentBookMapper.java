package edu.hunau.hyx.mapper;

import edu.hunau.hyx.bean.StudentBook;
import edu.hunau.hyx.bean.StudentBookExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentBookMapper {
    long countByExample(StudentBookExample example);

    int deleteByExample(StudentBookExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentBook record);

    int insertSelective(StudentBook record);

    List<StudentBook> selectByExample(StudentBookExample example);

    StudentBook selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentBook record, @Param("example") StudentBookExample example);

    int updateByExample(@Param("record") StudentBook record, @Param("example") StudentBookExample example);

    int updateByPrimaryKeySelective(StudentBook record);

    int updateByPrimaryKey(StudentBook record);
}