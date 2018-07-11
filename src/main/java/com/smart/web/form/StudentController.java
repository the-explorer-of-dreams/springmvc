package com.smart.web.form;

import com.smart.domain.form.Country;
import com.smart.domain.form.Student;
import com.smart.domain.form.StudentVo;
import org.eclipse.jetty.util.ArrayQueue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Controller;
import org.springframework.util.FileCopyUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Validator;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.util.*;

@Controller
@RequestMapping("/formHandle")
public class StudentController {

    @Autowired
    ServletContext context;

    @Autowired
    @Qualifier("studentValidator")
    private Validator validator;

    @InitBinder
    private void initBinder(WebDataBinder binder){
        binder.setValidator(validator);
    }

    @RequestMapping(value = "/student",method = RequestMethod.GET)
    public ModelAndView student(){
        ModelAndView mav =  new ModelAndView();
        mav.setViewName("student");
        Student student = new Student();
        student.setMale(true);
        student.setGender("M");
//        String[] framworksArray = {"Spring Boot","Apache Hadoop"};
        Set<String> framworks = new HashSet<String>();
        framworks.add("Apache Hadoop");
        framworks.add("Spring MVC");
        student.setFaveriteFrameworks(framworks);
        student.setFavoriteNumber("3");
        student.setId(1);
//        Country SG = new Country(3,"Singapore","SG");
//        student.setCountry(SG);

//        List<Country> countries = new ArrayList<Country>();
//        Country SG = new Country(3,"Singapore","SG");
//        Country US = new Country(1,"United States","US");
//        countries.add(SG);
//        countries.add(US);
//
//        student.setCountries(countries);

        mav.addObject("command",student);
        return mav;
    }

    @RequestMapping(value="/addStudent",method = RequestMethod.POST)
    public ModelAndView addStudent(@ModelAttribute("command") @Validated Student student,BindingResult bindingResult) throws IOException {
        ModelAndView mav =  new ModelAndView();

        if(bindingResult.hasErrors()){
            mav.setViewName("student");
            return mav;
        }else{
            System.out.println("receiving file content......start");
            String uploadPath = context.getRealPath("")+ File.separator+"upload"+File.separator;
            String uploadFileName=uploadPath+student.getFile().getOriginalFilename();
            File uploadFile = new File(uploadFileName);

            FileCopyUtils.copy(student.getFile().getBytes(),uploadFile);
            mav.addObject("fileName",student.getFile().getOriginalFilename());
            System.out.println("receiving file content......end");
        }

        mav.setViewName("studentAddResult");

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

    @ModelAttribute("countriesMap")
    public Map<String,String> countriesMap(){
        Map<String,String> countriesMap = new HashMap<String, String>();
        countriesMap.put("US", "United States");
        countriesMap.put("CH", "China");
        countriesMap.put("SG", "Singapore");
        countriesMap.put("MY", "Malaysia");
        return countriesMap;
    }

    @ModelAttribute("countriesList")
    public List<String>  countriesList(){
        List<String> countriesList = new ArrayList<String>();
        countriesList.add("United States");
        countriesList.add("China");
        countriesList.add("Singapore");
        countriesList.add("Malaysia");
        return countriesList;
    }

    @ModelAttribute("countryEntitiesList")
    public List<Country>  countryEntitiesList(){
        List<Country> countryEntitiesList = new ArrayList<Country>();
        Country US = new Country(1,"United States","US");
        Country CH = new Country(2,"China","CH");
        Country SG = new Country(3,"Singapore","SG");
        Country MY = new Country(4,"Malaysia","MY");

        countryEntitiesList.add(US);
        countryEntitiesList.add(CH);
        countryEntitiesList.add(SG);
        countryEntitiesList.add(MY);
        return countryEntitiesList;
    }

    @ModelAttribute("skillsMap")
    public Map<String, String> getSkillsMap()
    {
        Map<String, String> skillsMap = new HashMap<String, String>();
        skillsMap.put("Hibernate", "Hibernate");
        skillsMap.put("Spring", "Spring");
        skillsMap.put("Apache Hadoop", "Apache Hadoop");
        skillsMap.put("Struts", "Struts");
        return skillsMap;
    }





}
