package com.smart.web.form;

import com.smart.domain.form.Country;
import com.smart.domain.form.Student;
import com.smart.domain.form.StudentVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import java.util.*;

@Controller
@RequestMapping("/formHandle")
public class DirectBindingController {

    @RequestMapping(value = "/directBinding",method = RequestMethod.GET)
    public ModelAndView getDirectBinding(){
        ModelAndView mav =  new ModelAndView();
        mav.setViewName("directBinding");
        Student student = new Student();
        mav.addObject("command",student);
        return mav;
    }

    @RequestMapping(value="/doDirectBinding",method = RequestMethod.POST)
    public ModelAndView doDirectBinding(
           @ModelAttribute("name") String name,
         @RequestParam("age")  Integer accurateAge,
            String password,
            String address,
            Boolean male,
            String[] faveriteFrameworks,
           @ModelAttribute("student") Student student

    ){
        ModelAndView mav =  new ModelAndView();

        mav.setViewName("doDirectBinding");
//        mav.addObject("name",name);
        mav.addObject("accurateAge",accurateAge);
        mav.addObject("password",password);
        mav.addObject("address",address);
        mav.addObject("male",male);
        mav.addObject("faveriteFrameworks",faveriteFrameworks);
        return mav;
    }

//    @ModelAttribute("webFrameworkList")
//    public List<String> framworks(){
//        ArrayList<String> webFrameworkList = new ArrayList<String>();
//        webFrameworkList.add("Spring MVC");
//        webFrameworkList.add("Spring Boot");
//        webFrameworkList.add("Struts 2");
//        webFrameworkList.add("Apache Hadoop");
//        return webFrameworkList;
//    }
//
//
//    @ModelAttribute("numbersList")
//    public List<String> favoriteNumbersList(){
//        ArrayList<String> numbersList = new ArrayList<String>();
//        numbersList.add("1");
//        numbersList.add("2");
//        numbersList.add("3");
//        numbersList.add("4");
//        return numbersList;
//    }
//
//    @ModelAttribute("countriesMap")
//    public Map<String,String> countriesMap(){
//        Map<String,String> countriesMap = new HashMap<String, String>();
//        countriesMap.put("US", "United States");
//        countriesMap.put("CH", "China");
//        countriesMap.put("SG", "Singapore");
//        countriesMap.put("MY", "Malaysia");
//        return countriesMap;
//    }
//
//    @ModelAttribute("countriesList")
//    public List<String>  countriesList(){
//        List<String> countriesList = new ArrayList<String>();
//        countriesList.add("United States");
//        countriesList.add("China");
//        countriesList.add("Singapore");
//        countriesList.add("Malaysia");
//        return countriesList;
//    }
//
//    @ModelAttribute("countryEntitiesList")
//    public List<Country>  countryEntitiesList(){
//        List<Country> countryEntitiesList = new ArrayList<Country>();
//        Country US = new Country(1,"United States","US");
//        Country CH = new Country(2,"China","CH");
//        Country SG = new Country(3,"Singapore","SG");
//        Country MY = new Country(4,"Malaysia","MY");
//
//        countryEntitiesList.add(US);
//        countryEntitiesList.add(CH);
//        countryEntitiesList.add(SG);
//        countryEntitiesList.add(MY);
//        return countryEntitiesList;
//    }



}
