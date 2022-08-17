package com.example.emos.wx.service;

import java.util.Set;

public interface UserService {
    int registerUser(String registerCode,String code,String nickName,String photo);
    Set<String> searchUserPermissions(int userId);

}
