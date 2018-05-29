package net.person.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.Map;

/**
 * Created by DK on 2018/5/27.
 */
@Controller
@RequestMapping("/esp8266")
public class ESP8266Controller {

    @RequestMapping(value="/toESP8266")
    public String toESP8266() throws Exception{
        return "esp8266";
    }

    @RequestMapping(value="/getESP8266Data",method= RequestMethod.GET)
    @ResponseBody
    public void getESP8266Data(@RequestBody Map map) throws Exception{
        System.out.println(map.get("getESP8266Data"));
    }

    @RequestMapping(value="/getWiFiData",method= RequestMethod.GET)
    public void getWiFiData(HttpServletRequest request, HttpServletResponse response) throws Exception{
        request.setCharacterEncoding("utf-8");  //这里不设置编码会有乱码
        System.out.println("====================================");
        String sord = request.getParameter("request");//排序方式
        System.out.println(sord);
        System.out.println("====================================");
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.println("111111111111111111111");
        out.flush();
        out.close();
    }
}
