package com.company;

import java.util.ArrayList;

public class Car {
    private String manufacturer;
    private String number;
    private int year;
    private String owner;

    private ArrayList<String> ownerList = new ArrayList<String>();

    public Car(String manufacturer, String number, int year, String owner) {
        this.manufacturer = manufacturer;
        this.number = number;
        this.year = year;
        this.owner = owner;
        ownerList.add(owner);
    }

    public ArrayList<String> getOwnerList() {
        return ownerList;
    }


    public String getManufacturer() {
        return manufacturer;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getYear() {
        return year;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
        this.ownerList.add(owner);
    }

    private String testMethod(){
        return "abc";
    }

    private String testMethod(String str){
        return str;
    }

    public int testInt(int a){
        return a+4;
    }

    public void console(){
        System.out.println("hi");
    }
}
