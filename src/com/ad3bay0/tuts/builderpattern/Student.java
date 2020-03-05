package com.ad3bay0.tuts.builderpattern;

/**
 * Student
 */
public class Student {

    private int id;
    private String name;
    private String major;
    private String mobileNumber;
    private double salary;


    /**
     * @return the id
     */
    public int getId() {
        return id;
    }


    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @return the major
     */
    public String getMajor() {
        return major;
    }

    /**
     * @return the mobileNumber
     */
    public String getMobileNumber() {
        return mobileNumber;
    }

    /**
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }
    

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @param major the major to set
     */
    public void setMajor(String major) {
        this.major = major;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * @param mobileNumber the mobileNumber to set
     */
    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    
}