package pl.study.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import pl.study.model.User;

@Controller
public class MainController {

	@RequestMapping("/")
	public String main(Model model) {
		return "home";
	}
	
	@RequestMapping(value="/survey", method = RequestMethod.GET)
	public String survey(Model model) {
		model.addAttribute("user", new User()); 
		return "survey";
	}
	 @RequestMapping(value = "/survey", method = RequestMethod.POST)
	    public String submit(@Valid @ModelAttribute("user")User user, 
	      BindingResult result, ModelMap model) {
	        if (result.hasErrors()) {
	            return "error";
	        }
	        System.out.println(user.getAge());
	        System.out.println(user.getSex());
	        return "survey";
	    }
	
	
	

}
