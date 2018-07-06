package com.smart.web.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
public class RedirectExampleController {
//    @RequestMapping(value="/redirect",method = RequestMethod.GET)
//    public ModelAndView redirectPage(){
//        ModelAndView mav = new ModelAndView();
//        mav.setViewName("redirect:/hello");
//        mav.addObject("redirecMessage","request from RedirectExampleController");
//        return mav;
//    }

    @RequestMapping(value="/redirect",method = RequestMethod.GET)
    public String  redirectPage(HttpServletRequest request, Model model){


//        model.addAttribute("redirecMessage","request from RedirectExampleController");
        return "redirect:/hello";
    }

}
