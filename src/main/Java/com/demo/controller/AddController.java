package com.demo.controller;

import com.demo.service.AddService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AddController {

    @RequestMapping("/add")
    public ModelAndView add(@RequestParam("num1") int i, @RequestParam("num2") int j, HttpServletRequest request, HttpServletResponse response)
    {
       // int i = Integer.parseInt(request.getParameter("num1"));
       // int j = Integer.parseInt(request.getParameter("num2"));

        AddService as = new AddService();
        int k = as.add(i,j);

        ModelAndView mv = new ModelAndView();
        mv.setViewName("/WEB-INF/views/display");
        mv.addObject("result",k);
        return mv;
    }
}
