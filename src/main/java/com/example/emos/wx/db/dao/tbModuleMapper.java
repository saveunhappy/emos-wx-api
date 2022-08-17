package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.tbModule;
import com.example.emos.wx.db.pojo.tbModuleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface tbModuleMapper {
    long countByExample(tbModuleExample example);

    int deleteByExample(tbModuleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(tbModule record);

    int insertSelective(tbModule record);

    List<tbModule> selectByExample(tbModuleExample example);

    tbModule selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") tbModule record, @Param("example") tbModuleExample example);

    int updateByExample(@Param("record") tbModule record, @Param("example") tbModuleExample example);

    int updateByPrimaryKeySelective(tbModule record);

    int updateByPrimaryKey(tbModule record);
}