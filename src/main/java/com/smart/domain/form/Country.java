package com.smart.domain.form;

public class Country {
    private Integer id;
    private String name;
    private String briefName;

    public Country() {
    }

    public Country(Integer id, String name, String briefName) {
        this.id = id;
        this.name = name;
        this.briefName = briefName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBriefName() {
        return briefName;
    }

    public void setBriefName(String briefName) {
        this.briefName = briefName;
    }

//    @Override
//    public String toString() {
//        return this.briefName;
//    }
}
