package com.smart.web.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ResponseBodyExampleController {
    @RequestMapping("/responsebody")
    @ResponseBody
    public String responsebody(){
        return "this is a response body.";
    }


}
