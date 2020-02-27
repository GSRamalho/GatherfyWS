package br.com.wises.getherfy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

	@RequestMapping("/")
	@ResponseBody
	public String hello() {
		return "<div align=center >"
				+ "<h1 style=color:blue> Getherfy WebService </h1>"
				+ "</div>";
	}
}