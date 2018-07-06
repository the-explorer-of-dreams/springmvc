package com.smart.web.helloworld;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PathVariableExampleController {
    /**
     * PathVariable example
     */
    @RequestMapping("/pve/{userName}/{sex}/{age}")
    public ModelAndView pathVariableExample(
            @PathVariable("userName") String userName,
            @PathVariable("sex") String sex,
            @PathVariable("age") Integer age
    ){
        ModelAndView mav =  new ModelAndView();
        mav.setViewName("pathvariableexample");

        mav.addObject("userName",userName);
        mav.addObject("sex",sex);
        mav.addObject("age",age);

        return mav;
    }
}
