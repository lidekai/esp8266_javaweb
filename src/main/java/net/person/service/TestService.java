package net.person.service;


import javax.servlet.http.HttpServletResponse;

/**
 * service的接口
 * Created by admin on 2018/1/31.
 */
public interface TestService {
    //获取test表所有数据
    public void getAllTest(HttpServletResponse response);
}
