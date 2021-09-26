package edu.hunau.hyx.mapper;

import edu.hunau.hyx.bean.Bookshelf;
import edu.hunau.hyx.bean.BookshelfExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface BookshelfMapper {
    long countByExample(BookshelfExample example);

    int deleteByExample(BookshelfExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Bookshelf record);

    int insertSelective(Bookshelf record);

    List<Bookshelf> selectByExample(BookshelfExample example);

    Bookshelf selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);

    int updateByExample(@Param("record") Bookshelf record, @Param("example") BookshelfExample example);

    int updateByPrimaryKeySelective(Bookshelf record);

    int updateByPrimaryKey(Bookshelf record);
}