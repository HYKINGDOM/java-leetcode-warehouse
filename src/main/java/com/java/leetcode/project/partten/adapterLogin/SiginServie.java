package com.java.leetcode.project.partten.adapterLogin;

public class SiginServie {

    /**
     * register metho
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg regist(String username, String password) {
        ResultMsg resultMsg = new ResultMsg(200, "登陆成功", new Member());

        System.out.println(resultMsg.toString());
        return resultMsg;
    }

    /**
     * login method
     *
     * @param username
     * @param password
     * @return
     */
    public ResultMsg login(String username, String password) {
        System.out.println("用户:" + username + "登陆成功");
        return null;
    }
}
