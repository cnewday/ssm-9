package cn.spring.ssm.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class UserComtroller {
	@RequestMapping("index")
	public String index() {
		return "WEB-INF/errorpage/500.jsp";
	}

}
