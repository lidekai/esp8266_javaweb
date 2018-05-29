package net.person.controller;

import net.person.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;


/**
 * 测试springMVC映射
 * Created by admin on 2018/1/31.
 */
@Controller
@RequestMapping("/home")
public class TestController {
    public TestService testServiceImpl;
    @Autowired
    public void setTestService(TestService testServiceImpl) {
        this.testServiceImpl = testServiceImpl;
    }

    /**
     * 跳转页面
     * @return
     * @throws Exception
     */
    @RequestMapping(value="/toTest")
    public String toTest() throws Exception{
        return "test";
    }

    /**
     * 获取json数据
     * @param response
     * @throws Exception
     */
    @RequestMapping(value="/getTest",method= RequestMethod.GET)
    public void getTest(HttpServletResponse response) throws Exception{
        testServiceImpl.getAllTest(response);
    }
}
