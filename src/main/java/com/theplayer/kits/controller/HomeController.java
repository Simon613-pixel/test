package com.theplayer.kits.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.servlet.ModelAndView;

import com.theplayer.kits.entity.HomeEntity;
import com.theplayer.kits.repository.HomeRepository;
import com.theplayer.kits.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	HomeService homeService;

	@Autowired
	HomeRepository homeRepository;
	
	@RequestMapping("/")
	public String homeGetAll(Model model) {	
		List<HomeEntity> users = homeService.getAllUser();  
	    model.addAttribute("homeGetAll", users);   
		return "index";
	}
	
	@RequestMapping("/homeSave")
	public String homeSave(Model model,@ModelAttribute HomeEntity homeEntity) {	
		homeService.saveUser(homeEntity);
		List<HomeEntity> users = homeService.getAllUser();  
	    model.addAttribute("homeGetAll", users);   
		return "index";
	}
	
	@RequestMapping("/homeDeleteAll")
	public String homeDeleteAll() {
		@SuppressWarnings("unused")
		List<HomeEntity> users = homeService.deleteAll();  
		return "index";
	}
	
	@RequestMapping("/homeDeleteById/{id}")
	public String homeDeleteById(Model model, @PathVariable(name = "id") int id) {
		homeService.deleteById(id);  
		List<HomeEntity> users = homeService.getAllUser();  
	    model.addAttribute("homeGetAll", users);
		return "index";
	}
	
	@RequestMapping("/homeEdit/{id}")
	public ModelAndView homeEdit(Model model, @PathVariable(name = "id") int id) {
	    ModelAndView mav = new ModelAndView("new");
        HomeEntity std = homeService.findUserById(id);
        mav.addObject("student", std);
        return mav;    
	}
	
}
