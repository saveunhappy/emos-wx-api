package com.example.emos.wx.db.dao;


import java.util.HashMap;

public interface TbUserMapper {
    boolean haveRootUser();
    int insert(HashMap param);
    Integer searchIdByOpenId(String openId);

}