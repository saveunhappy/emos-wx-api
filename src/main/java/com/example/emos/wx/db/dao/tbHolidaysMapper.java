package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.tbHolidays;
import com.example.emos.wx.db.pojo.tbHolidaysExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tbHolidaysMapper {
    long countByExample(tbHolidaysExample example);

    int deleteByExample(tbHolidaysExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tbHolidays record);

    int insertSelective(tbHolidays record);

    List<tbHolidays> selectByExample(tbHolidaysExample example);

    tbHolidays selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tbHolidays record, @Param("example") tbHolidaysExample example);

    int updateByExample(@Param("record") tbHolidays record, @Param("example") tbHolidaysExample example);

    int updateByPrimaryKeySelective(tbHolidays record);

    int updateByPrimaryKey(tbHolidays record);
}