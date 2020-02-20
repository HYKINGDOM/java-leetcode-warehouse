package com.java.leetcode.project.partten.adapterLogin;

public class SiginForThirdService extends SiginServie {

    public ResultMsg loginForQQ(String openId) {
        return loginForRegist(openId, null);
    }


    public ResultMsg loginForWeChat(String openId){
        return loginForRegist(openId, null);
    }

    public ResultMsg loginForToken(String openId){
        return loginForRegist(openId, null);
    }

    public ResultMsg loginForTelphone(String openId){
        return loginForRegist(openId, null);
    }

    public ResultMsg loginForRegist(String username, String password) {
        super.regist(username, password);
        return super.login(username, password);
    }
}
