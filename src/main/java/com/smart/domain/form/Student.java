package com.smart.domain.form;

import org.springframework.web.multipart.MultipartFile;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Student{
    private Integer id;
    private Integer age;
    private String name;
    private String password;
    private String address;
    private boolean male;
    private Set<String> faveriteFrameworks;
    private String gender;
    private String favoriteNumber;
    private Map<String,String> countries;
    private MultipartFile file;

    //single entity
//    private Country country;
//
//    public Country getCountry() {
//        return country;
//    }
//
//    public void setCountry(Country country) {
//        this.country = country;
//    }


    public MultipartFile getFile() {
        return file;
    }

    public void setFile(MultipartFile file) {
        this.file = file;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public boolean isMale() {
        return male;
    }

    public void setMale(boolean male) {
        this.male = male;
    }

    public Set<String> getFaveriteFrameworks() {
        return faveriteFrameworks;
    }

    public void setFaveriteFrameworks(Set<String> faveriteFrameworks) {
        this.faveriteFrameworks = faveriteFrameworks;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getFavoriteNumber() {
        return favoriteNumber;
    }

    public void setFavoriteNumber(String favoriteNumber) {
        this.favoriteNumber = favoriteNumber;
    }

    public Map<String, String> getCountries() {
        return countries;
    }

    public void setCountries(Map<String, String> countries) {
        this.countries = countries;
    }

    @Override
    public String toString() {
        return this.name+":"+this.password+":"+this.age+":"+this.address+":"+this.id;
    }


}
