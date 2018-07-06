package com.smart.web.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RequestParamExampleController {
    @RequestMapping("/user")
    public ModelAndView userInfo(@RequestParam(value = "name",defaultValue = "Guest") String name){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("helloworld");
        mav.addObject("name",name);

        if("admin".equalsIgnoreCase(name)){
            mav.addObject("email","hellospringmvc@126.com");
        }else{
            mav.addObject("email","Not set");
        }

        return mav;
    }
}
