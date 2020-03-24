package br.com.frwk.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@CrossOrigin({"*"})
@Controller
public class HomeController {
	public HomeController() {
	}

	@RequestMapping(
			path = {"/home"}
	)
	@ResponseBody
	public String hello() {
		return "Pagina inicial do usuario";
	}
}
