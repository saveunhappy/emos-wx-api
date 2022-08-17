package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbAction;
import com.example.emos.wx.db.pojo.TbActionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbActionMapper {
    long countByExample(TbActionExample example);

    int deleteByExample(TbActionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbAction record);

    int insertSelective(TbAction record);

    List<TbAction> selectByExample(TbActionExample example);

    TbAction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbAction record, @Param("example") TbActionExample example);

    int updateByExample(@Param("record") TbAction record, @Param("example") TbActionExample example);

    int updateByPrimaryKeySelective(TbAction record);

    int updateByPrimaryKey(TbAction record);
}