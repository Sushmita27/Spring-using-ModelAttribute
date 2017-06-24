package com.sush.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.sush.controller.Student;;

@Controller
public class StudentAdmissionController {

	@RequestMapping(value="/admissionForm", method=RequestMethod.GET)
	public ModelAndView getAdmissionForm(){

		ModelAndView view=new ModelAndView("admissionForm");
		//view.addObject("msg","Welcome to the instituton!!!!!");
		return view;
	}
	public Model addCommonObjects(Model model){
		model.addAttribute("msg", "Welcome to the instituton!!!!!");
		return model;
		
	}
	
	@RequestMapping(value="/submitAdmission", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student1") Student student1, BindingResult result) {
		ModelAndView view= new ModelAndView("admissionSuccess");
		//view.addObject("msg","Welcome to the instituton!!!!!");
		return view;
		
	}

}
