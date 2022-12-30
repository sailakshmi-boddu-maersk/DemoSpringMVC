package com.slb;

import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.slb.service.AddService;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller
public class AddController {
	
	@Autowired
 	AddService as;
	
    @RequestMapping("/add")
	public ModelAndView add(@RequestParam("num1")int i,@RequestParam("num2")int j,HttpServletRequest req,HttpServletResponse res) throws IOException {
//    	int i=Integer.parseInt(req.getParameter("num1"));
//    	int j=Integer.parseInt(req.getParameter("num2"));
    	
    	int k=as.add(i, j);
    	ModelAndView mv=new ModelAndView();
    	mv.addObject("result",k);
		mv.setViewName("display.jsp");
		return mv;
		
	}
}
