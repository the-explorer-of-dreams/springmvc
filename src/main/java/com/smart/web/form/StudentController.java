package com.smart.web.form;

import com.smart.domain.form.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/formHandle")
public class StudentController {

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student(){
        ModelAndView mav =  new ModelAndView();
        mav.setViewName("student");
        Student student = new Student();
        student.setMale(true);
        student.setGender("M");
        String[] framworks = {"Spring Boot","Apache Hadoop"};
        student.setFaveriteFrameworks(framworks);
        student.setFavoriteNumber("3");

        mav.addObject("command",student);
        return mav;
    }

    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute("springWeb") Student student){
        ModelAndView mav =  new ModelAndView();

        mav.setViewName("studentAddResult");

        mav.addObject("name",student.getName());
        mav.addObject("age",student.getAge());
        mav.addObject("password",student.getPassword());
        mav.addObject("address",student.getAddress());
        mav.addObject("male",student.isMale());
        mav.addObject("faveriteFrameworks",student.getFaveriteFrameworks());
        mav.addObject("gender",student.getGender());
        mav.addObject("faveriteNumber",student.getFavoriteNumber());
        mav.addObject("id",student.getId());



        System.out.println("student:"+student);

        return mav;
    }

    @ModelAttribute("webFrameworkList")
    public List<String> framworks(){
        ArrayList<String> webFrameworkList = new ArrayList<String>();
        webFrameworkList.add("Spring MVC");
        webFrameworkList.add("Spring Boot");
        webFrameworkList.add("Struts 2");
        webFrameworkList.add("Apache Hadoop");
        return webFrameworkList;
    }


    @ModelAttribute("numbersList")
    public List<String> favoriteNumbersList(){
        ArrayList<String> numbersList = new ArrayList<String>();
        numbersList.add("1");
        numbersList.add("2");
        numbersList.add("3");
        numbersList.add("4");
        return numbersList;
    }



}
