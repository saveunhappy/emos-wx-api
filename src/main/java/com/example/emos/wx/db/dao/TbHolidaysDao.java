package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbHolidays;

public interface TbHolidaysDao {
    int deleteByPrimaryKey(Integer id);

    int insert(TbHolidays record);

    int insertSelective(TbHolidays record);

    TbHolidays selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbHolidays record);

    int updateByPrimaryKey(TbHolidays record);
}