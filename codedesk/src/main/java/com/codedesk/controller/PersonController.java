package com.codedesk.controller;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.LocaleResolver;

import com.codedesk.entities.Person;
import com.codedesk.services.IPersonService;

@RestController
@RequestMapping("/data")
public class PersonController {
	@Autowired
	private IPersonService personService;
	
	@Autowired
	private MessageSource messageSource;
	
	@Autowired
	private LocaleResolver localeResolver;
	
	@RequestMapping("/person")
	public Person getPersonDetail(@RequestParam(value = "id",required = false,
                                                    defaultValue = "0") Integer id) {
		Person p = personService.getPersonById(id);
		return p;
	}
	
	@RequestMapping(value="/addPerson", method = RequestMethod.POST)
	@ResponseBody
	public String addPerson(@RequestBody Person person, BindingResult result, 
			ModelMap model, HttpServletRequest request) {
	    if(!result.hasErrors()) {
	    	boolean flag = personService.addPerson(person);
	    	if (flag) {
				model.addAttribute(new Person());
				model.addAttribute("msg", getMsg("person.added", request));
	    	} else {
	    		        model.addAttribute("msg", getMsg("person.duplicate", request));
	    	}
	    }
	    setPageData(model);
	    return "personform";
	}
	
	private void setPageData(ModelMap model) {
		model.addAttribute("allData", personService.getAllPersons());
		model.addAttribute("genderOptions", Person.getGenderOptions());
		model.addAttribute("cityMap", Person.getPersonMap());	
	}
	
	private String getMsg(String key, HttpServletRequest request) {
		return messageSource.getMessage(key, null, localeResolver.resolveLocale(request));
	}
} 
