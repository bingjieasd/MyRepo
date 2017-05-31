package controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
@Controller
public class UserController   {
	@RequestMapping(value="/user.do")
	public String login(String name,Model model)  {
		
		System.out.println(name);
		model.addAttribute("name", name);
		return "show";
	}

}
