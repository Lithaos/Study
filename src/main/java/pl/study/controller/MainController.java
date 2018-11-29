package pl.study.controller;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import pl.study.model.Question;
import pl.study.model.User;
import pl.study.repository.UserRepository;

@Controller
public class MainController {

	@Autowired
	UserRepository userRepository;

	@RequestMapping("/")
	public String main(Model model) {
		return "home";
	}

	@RequestMapping(value = "/survey", method = RequestMethod.GET)
	public String survey(Model model) {
		model.addAttribute("user", new User());
		return "survey";
	}

	@RequestMapping(value = "/survey", method = RequestMethod.POST)
	public String submit(@Valid @ModelAttribute("user") User user, BindingResult result, ModelMap model,
			RedirectAttributes redirectAttributes) {
		if (result.hasErrors()) {
			return "survey";
		} else {
			redirectAttributes.addFlashAttribute("user", user);
			userRepository.save(user);
			return "redirect:/article1";
		}
	}

	@RequestMapping("/article1")
	public String article1(@ModelAttribute("user") User user, ModelMap model) {
		model.addAttribute("user", user);
		return "line" + user.getLine() + "/article1";
	}

	@RequestMapping("/article2")
	public String article2(@SessionAttribute("user") User user, ModelMap model) {
		user.setArticle1(true);
		userRepository.save(user);
		return "line" + user.getLine() + "/article2";
	}

	@RequestMapping("/article3")
	public String article3(@SessionAttribute("user") User user, ModelMap model) {
		user.setArticle2(true);
		userRepository.save(user);
		return "line" + user.getLine() + "/article3";
	}

	@RequestMapping("/article4")
	public String article4(@SessionAttribute("user") User user, ModelMap model) {
		user.setArticle3(true);
		userRepository.save(user);
		return "line" + user.getLine() + "/article4";
	}

	@RequestMapping("/article5")
	public String article5(@SessionAttribute("user") User user, ModelMap model) {
		user.setArticle4(true);
		userRepository.save(user);
		return "line" + user.getLine() + "/article5";
	}

	@RequestMapping(value = "/questions")
	public String questions(@SessionAttribute("user") User user, ModelMap model) {
		List<Question> questions = new ArrayList<Question>();
		if (user.getLine() == 0) {
			questions.add(new Question("Q1", "A", "B", "C", "D"));
			questions.add(new Question("Q2", "A", "B", "C", "D"));
			questions.add(new Question("Q3", "A", "B", "C", "D"));
			questions.add(new Question("Q4", "A", "B", "C", "D"));
			questions.add(new Question("Q5", "A", "B", "C", "D"));

		} else {
			questions.add(new Question("Q1", "A", "B", "C", "D"));
			questions.add(new Question("Q2", "A", "B", "C", "D"));
			questions.add(new Question("Q3", "A", "B", "C", "D"));
			questions.add(new Question("Q4", "A", "B", "C", "D"));
			questions.add(new Question("Q5", "A", "B", "C", "D"));
		}
		model.addAttribute("questions", questions);
		user.setArticle5(true);
		userRepository.save(user);
		return "questions";
	}

	@RequestMapping(value = "/finish", method = RequestMethod.POST)
	public String finish(@SessionAttribute("user") User user, @ModelAttribute("question") User questions,
			ModelMap model) {
		user.setQ1(questions.getQ1());
		user.setQ2(questions.getQ2());
		user.setQ3(questions.getQ3());
		user.setQ4(questions.getQ4());
		user.setQ5(questions.getQ5());
		userRepository.save(user);
		return "finish";
	}
}
