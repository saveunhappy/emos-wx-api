package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbRole;
import com.example.emos.wx.db.pojo.TbRoleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbRoleMapper {
    long countByExample(TbRoleExample example);

    int deleteByExample(TbRoleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbRole record);

    int insertSelective(TbRole record);

    List<TbRole> selectByExampleWithBLOBs(TbRoleExample example);

    List<TbRole> selectByExample(TbRoleExample example);

    TbRole selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByExampleWithBLOBs(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByExample(@Param("record") TbRole record, @Param("example") TbRoleExample example);

    int updateByPrimaryKeySelective(TbRole record);

    int updateByPrimaryKeyWithBLOBs(TbRole record);

    int updateByPrimaryKey(TbRole record);
}