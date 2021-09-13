package com.company.model;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Contact {
    private String numberPhone;
    private String contactGroup;
    private String name;
    private String gender;
    private String address;
    private String birthday;
    private String email;

    private static final String NUMBER_REGEX = "^[_a-z0-9]{6,}$";
    private static final String EMAIL_REGEX = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

    public Contact() {

    }

    public boolean validateNumber(String regex) {
        Pattern pattern = Pattern.compile(NUMBER_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public boolean validateEmail(String regex) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }

    public Contact(String numberPhone, String contactGroup, String name, String gender, String address, String birthday, String email) {
        this.numberPhone = numberPhone;
        this.contactGroup = contactGroup;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.birthday = birthday;
        this.email = email;
    }

    public String getNumberPhone() {
        return numberPhone;
    }

    public void setNumberPhone(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    public String getContactGroup() {
        return contactGroup;
    }

    public void setContactGroup(String contactGroup) {
        this.contactGroup = contactGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "numberPhone= " + numberPhone +
                ", contactGroup= " + contactGroup +
                ", name= " + name +
                ", gender= " + gender +
                ", address= " + address +
                ", birthday= " + birthday +
                ", email= " + email;
    }
}