package com.tf.demoApplication;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	@RequestMapping("/test")
	public String test() {
		return "weblogic-tomcat-均可启动--http://localhost:7001/weblogicApplication-0.0.1-SNAPSHOT/test";
	}
}
