package com.smart.web.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ForwardExampleController {
    @RequestMapping(value = "/forward",method = RequestMethod.GET)
    public ModelAndView forward(){
        ModelAndView mav = new ModelAndView();
        mav.addObject("forwardMessageModel","forwardMessageModel");
        mav.setViewName("forward:/hello");
        return mav;
    }
}
