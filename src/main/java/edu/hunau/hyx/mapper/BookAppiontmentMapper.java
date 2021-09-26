package edu.hunau.hyx.mapper;

import edu.hunau.hyx.bean.BookAppiontment;
import edu.hunau.hyx.bean.BookAppiontmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookAppiontmentMapper {
    long countByExample(BookAppiontmentExample example);

    int deleteByExample(BookAppiontmentExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(BookAppiontment record);

    int insertSelective(BookAppiontment record);

    List<BookAppiontment> selectByExample(BookAppiontmentExample example);

    BookAppiontment selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") BookAppiontment record, @Param("example") BookAppiontmentExample example);

    int updateByExample(@Param("record") BookAppiontment record, @Param("example") BookAppiontmentExample example);

    int updateByPrimaryKeySelective(BookAppiontment record);

    int updateByPrimaryKey(BookAppiontment record);
}