package br.com.frwk.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
/**
 * @author CleberLeão
 */
@CrossOrigin(origins = "http://localhost:4200")
@Controller
public class HomeController {
	public HomeController() {
	}

	@RequestMapping(
			path = {"/teste"}
	)
	@ResponseBody
	public String hello() {
		return "Pagina inicial do Blog Framework";
	}
}
