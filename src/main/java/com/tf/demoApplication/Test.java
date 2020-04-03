package com.tf.demoApplication;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@RequestMapping("/test")
	public String test() {
		System.out.println("test----");
		return "weblogic-tomcat-均可启动--http://localhost:7001/weblogicApplication-0.0.1-SNAPSHOT/test";
	}
	
	@RequestMapping(value="/webtest",method = {RequestMethod.POST,RequestMethod.GET})
	public String posttest(String param) {
		System.out.println("----------------------这次的请求是："+param);
		return "测试："+param;
	}
	
	//postman http://localhost:8080/show?name=你好
	//使用RequestParam注解直接获取值
    @RequestMapping(value = "/show",method = RequestMethod.POST)
    public void showHello(@RequestParam(value = "name")String name, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("ShowHelloServlet...doPost...");
        //获取值，并设置编码
        System.out.println("name=" + name);
        //输出，解决浏览器乱码问题
        resp.setHeader("Content-type", "text/html;charset=UTF-8");
        resp.setCharacterEncoding("UTF-8");
        resp.getWriter().write("我很好，你呢？");
        System.out.println("输出...");
    }
}
