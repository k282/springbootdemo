package com.spring.demo.rest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spring.demo.bean.StudentRegistration;
import com.spring.demo.bean.Welcome;

@Controller
public class WelcomeController {
	private static final String welcomemsg = "Welcome Mr. %s!";
    
	@GetMapping("/welcome/user")
    @ResponseBody
    public Welcome welcomeUser(@RequestParam(name="name", required=false, defaultValue="Java Fan") String name) {
        return new Welcome(String.format(welcomemsg, name));
    }
	
	@RequestMapping(method = RequestMethod.POST, value="/welcome/student")
	@ResponseBody
	int registerStudent(@RequestBody StudentRegistration studentregd) {
	//StudentRegistrationReply stdregreply = new StudentRegistrationReply();
	
	return studentregd.getAge();
	}
}
