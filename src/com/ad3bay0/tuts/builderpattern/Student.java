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

    private Student(int id2, String name2, String major2, String mobileNumber2) {
        this.id = id2;
        this.name = name2;
        this.major = major2;
        this.mobileNumber = mobileNumber2;
    }

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

    public static class SimpleStudentBuilder {

        private int id;
        private String name;
        private String major;
        private String mobileNumber;
        private double salary;

        /**
         * default constructor
         */
        public SimpleStudentBuilder() {
        }

        /**
         * @param id the id to set
         */
        public SimpleStudentBuilder setId(int id) {
            this.id = id;
            return this;
        }

        /**
         * @param name the name to set
         */
        public SimpleStudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        /**
         * @param major the major to set
         */
        public SimpleStudentBuilder setMajor(String major) {
            this.major = major;
            return this;

        }

        /**
         * @param mobileNumber the mobileNumber to set
         */
        public SimpleStudentBuilder setMobileNumber(String mobileNumber) {
            this.mobileNumber = mobileNumber;

            return this;

        }

        /**
         * @param salary the salary to set
         */
        public SimpleStudentBuilder setSalary(double salary) {
            this.salary = salary;
            return this;
        }

        public Student build() {

            if (id == 0) {

                throw new NullPointerException("id cant be witout a value");
            }

            if (name == null) {

                throw new NullPointerException("Name cant be without value");

            }

            if (major == null) {

                throw new NullPointerException("major cant be without value");
            }

            if (mobileNumber == null) {

                throw new NullPointerException("mobile number cant be without value");
            }

            Student student = new Student(id, name, major, mobileNumber);
            student.salary = salary;

            return student;

        }
    }

}