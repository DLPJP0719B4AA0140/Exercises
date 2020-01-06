package com.cg.ctrl;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FirstController
{
	
	@GetMapping("/hello")
	public ModelAndView hello()
	{
		ModelAndView mv=new ModelAndView("hello");
		String str="</h1><u>Hello From Spring MVC</u></h1>";
		mv.addObject("name",str);
		return mv;
	}

}
