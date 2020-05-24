package br.com.jp.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.jp.demo.model.User;
import br.com.jp.demo.repository.UserRepository;


@Controller
public class ListController {
	
	@Autowired
	private UserRepository repository;
	
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
	@RequestMapping("list")
	public String myList(Model model) {
		
		Iterable<User> users = repository.findAll();	
		model.addAttribute("users", users);
		
		return "mylist";
	}
	
	@RequestMapping(value = "save", method = RequestMethod.POST)
	public String save(@RequestParam("name") String name, @RequestParam("email") String email, @RequestParam("phone") Integer phone, Model model) {
		
		User newUser = new User(name, email, phone);
		repository.save(newUser);
		
		Iterable<User> users = repository.findAll();
		model.addAttribute("users", users);
		
		return "mylist";
		
	}
	
}
