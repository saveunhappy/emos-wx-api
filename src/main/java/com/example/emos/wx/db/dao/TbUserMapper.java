package com.example.emos.wx.db.dao;


import java.util.HashMap;
import java.util.Set;

public interface TbUserMapper {
    boolean haveRootUser();
    int insert(HashMap param);
    Integer searchIdByOpenId(String openId);
    Set<String> searchUserPermissions(int userId);
}