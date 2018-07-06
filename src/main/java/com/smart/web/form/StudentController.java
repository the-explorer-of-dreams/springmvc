package com.smart.web.form;

import com.smart.domain.form.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/formHandle")
public class StudentController {

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student(){
        ModelAndView mav =  new ModelAndView();
        mav.setViewName("student");
        mav.addObject("command",new Student());
        return mav;
    }

    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute("command") Student student){
        ModelAndView mav =  new ModelAndView();

        mav.setViewName("studentAddResult");

        mav.addObject("name",student.getName());
        mav.addObject("age",student.getAge());
        mav.addObject("id",student.getId());

        return mav;
    }




}
