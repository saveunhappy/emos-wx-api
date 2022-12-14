package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbWorkday;
import com.example.emos.wx.db.pojo.TbWorkdayExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbWorkdayMapper {
    long countByExample(TbWorkdayExample example);

    int deleteByExample(TbWorkdayExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbWorkday record);

    int insertSelective(TbWorkday record);

    List<TbWorkday> selectByExample(TbWorkdayExample example);

    TbWorkday selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbWorkday record, @Param("example") TbWorkdayExample example);

    int updateByExample(@Param("record") TbWorkday record, @Param("example") TbWorkdayExample example);

    int updateByPrimaryKeySelective(TbWorkday record);

    int updateByPrimaryKey(TbWorkday record);
}