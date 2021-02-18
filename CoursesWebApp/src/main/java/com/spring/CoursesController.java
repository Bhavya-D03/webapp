package com.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CoursesController {
	
    @RequestMapping("course")
    public String course()
    {
	
		return "course";
	}
	
}
