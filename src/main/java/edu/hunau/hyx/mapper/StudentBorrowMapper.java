package edu.hunau.hyx.mapper;

import edu.hunau.hyx.bean.StudentBorrow;
import edu.hunau.hyx.bean.StudentBorrowExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentBorrowMapper {
    long countByExample(StudentBorrowExample example);

    int deleteByExample(StudentBorrowExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(StudentBorrow record);

    int insertSelective(StudentBorrow record);

    List<StudentBorrow> selectByExampleWithBLOBs(StudentBorrowExample example);

    List<StudentBorrow> selectByExample(StudentBorrowExample example);

    StudentBorrow selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") StudentBorrow record, @Param("example") StudentBorrowExample example);

    int updateByExampleWithBLOBs(@Param("record") StudentBorrow record, @Param("example") StudentBorrowExample example);

    int updateByExample(@Param("record") StudentBorrow record, @Param("example") StudentBorrowExample example);

    int updateByPrimaryKeySelective(StudentBorrow record);

    int updateByPrimaryKeyWithBLOBs(StudentBorrow record);

    int updateByPrimaryKey(StudentBorrow record);
}