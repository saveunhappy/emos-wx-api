package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbMeeting;
import com.example.emos.wx.db.pojo.TbMeetingExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbMeetingMapper {
    long countByExample(TbMeetingExample example);

    int deleteByExample(TbMeetingExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbMeeting record);

    int insertSelective(TbMeeting record);

    List<TbMeeting> selectByExampleWithBLOBs(TbMeetingExample example);

    List<TbMeeting> selectByExample(TbMeetingExample example);

    TbMeeting selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbMeeting record, @Param("example") TbMeetingExample example);

    int updateByExampleWithBLOBs(@Param("record") TbMeeting record, @Param("example") TbMeetingExample example);

    int updateByExample(@Param("record") TbMeeting record, @Param("example") TbMeetingExample example);

    int updateByPrimaryKeySelective(TbMeeting record);

    int updateByPrimaryKeyWithBLOBs(TbMeeting record);

    int updateByPrimaryKey(TbMeeting record);
}