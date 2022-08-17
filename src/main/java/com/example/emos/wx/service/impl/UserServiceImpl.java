package com.example.emos.wx.service.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONObject;
import cn.hutool.json.JSONUtil;
import com.example.emos.wx.db.dao.TbUserMapper;
import com.example.emos.wx.exception.EmosException;
import com.example.emos.wx.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Date;
import java.util.HashMap;
import java.util.Set;

@Service
@Slf4j
@Scope("prototype")
public class UserServiceImpl implements UserService {
    @Value("${wx.app-id}")
    private String appId;
    @Value("${wx.app-secret}")
    private String secret;

    @Resource
    private TbUserMapper userDao;

    private String getOpenId(String code) {
        String url = "https://api.weixin.qq.com/sns/jscode2session";
        HashMap<String, Object> map = new HashMap<>();
        map.put("appid", appId);
        map.put("secret", secret);
        map.put("js_code", code);
        map.put("grant_type", "authorization_code");
        String response = HttpUtil.post(url, map);
        JSONObject json = JSONUtil.parseObj(response);
        String openId = json.getStr("openid");
        if (openId == null || openId.length() == 0) {
            throw new RuntimeException("临时登录凭证错误");
        }
        return openId;
    }

    @Override
    public int registerUser(String registerCode, String code, String nickName, String photo) {
        if(registerCode.equals("000000")){
            boolean haveRootUser = userDao.haveRootUser();
            if(!haveRootUser){
                String openId = getOpenId(code);
                HashMap<String,Object> param = new HashMap<>();
                param.put("openId",openId);
                param.put("nickname",nickName);
                param.put("photo",photo);
                param.put("role","[0]");
                param.put("status",1);
                param.put("createTime",new Date());
                param.put("root",true);
                userDao.insert(param);
                Integer id = userDao.searchIdByOpenId(openId);
                return id;
            }else{
                throw new EmosException("无法绑定超级管理员账号");
            }
        }else{
            //TODO 此处还有其他判断内容
        }
        return 0;
    }

    @Override
    public Set<String> searchUserPermissions(int userId) {
        return userDao.searchUserPermissions(userId);
    }
}
