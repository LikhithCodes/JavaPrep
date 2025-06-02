package com.likki.beans;


public class Employee {
    private int id;
    private String name;
    private String city;
    private int age;
    private String gender;
    private String deptartment;
    private int yearOfJoining;
    private double salary;

    public Employee(int id, String name, String city, int age, String gender, String deptartment, int yearOfJoining,
                    double salary) {
        this.id = id;
        this.name = name;
        this.city = city;
        this.age = age;
        this.gender = gender;
        this.deptartment = deptartment;
        this.yearOfJoining = yearOfJoining;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public String getDeptartment() {
        return deptartment;
    }

    public int getYearOfJoining() {
        return yearOfJoining;
    }

    public double getSalary() {
        return salary;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setDeptartment(String deptartment) {
        this.deptartment = deptartment;
    }

    public void setYearOfJoining(int yearOfJoining) {
        this.yearOfJoining = yearOfJoining;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [id=" + id + ", name=" + name + ", city=" + city + ", age=" + age + ", gender=" + gender
                + ", deptartment=" + deptartment + ", yearOfJoining=" + yearOfJoining + ", salary=" + salary
                + ", getId()=" + getId() + ", getName()=" + getName() + ", getCity()=" + getCity() + ", getAge()="
                + getAge() + ", getGender()=" + getGender() + ", getDeptartment()=" + getDeptartment()
                + ", getYearOfJoining()=" + getYearOfJoining() + ", getSalary()=" + getSalary() + ", getClass()="
                + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
    }

}
