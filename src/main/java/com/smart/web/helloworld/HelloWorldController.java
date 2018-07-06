package com.smart.web.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class HelloWorldController {
    @RequestMapping("/hello")
    public String helloWorld(HttpServletRequest request, Model model){
        model.addAttribute("greeting","Hello Spring MVC");
        request.setAttribute("requestAttr","requestAttrTest");
//        String directMessage = (String)request.getAttribute("redirecMessage");
//        System.out.println("directMessage:"+directMessage);
//        model.addAttribute("redirecMessage",directMessage);

        return "helloworld";
    }


}
