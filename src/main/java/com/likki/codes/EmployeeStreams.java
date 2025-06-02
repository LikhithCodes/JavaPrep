package com.likki.codes;

import com.likki.beans.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class EmployeeStreams {
    public static void main(String[] args) {
        List<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Likhith", "Bangalore", 27, "Male", "IT", 23, 250.0));
        empList.add(new Employee(7, "Mans", "Hyd", 27, "Female", "BE", 23, 2550.0));
        empList.add(new Employee(4, "Pri", "Kol", 26, "Male", "CS", 24, 2530.0));
        empList.add(new Employee(8, "Sho", "Chen", 28, "Female", "FS", 25, 250.0));
        empList.add(new Employee(5, "Majs", "Del", 24, "Male", "MA", 22, 25330.0));
        empList.add(new Employee(3, "fsfv", "Hyd", 32, "Male", "CS", 20, 2530.0));
        empList.add(new Employee(2, "tel", "Mum", 32, "Female", "FS", 23, 253320.0));
        empList.add(new Employee(6, "svsbs", "Pune", 27, "Male", "IT", 24, 25440.0));
        empList.add(new Employee(9, "ffsdvs", "Bangalore", 29, "Male", "FS", 23, 25140.0));
        empList.add(new Employee(10, "mifmsf", "Bangalore", 40, "Male", "MA", 23, 5550.0));

        //Streams
        //Get all employee names as a list
        List<String> empNameList =  empList.stream().map(n -> n.getName()).collect(Collectors.toList());
        empNameList.forEach(System.out::println);
        System.out.println("");
        //Get all employee names as a list whose age is > 23
        List<String> empNameList2 =  empList.stream().filter(n -> n.getAge()>30).map(n -> n.getName()).collect(Collectors.toList());
        empNameList2.forEach(System.out::println);
        System.out.println("");
        //print all distinct citynames of employees
        empList.stream().map(n -> n. getCity()).distinct().forEach(System.out::println);

        //get cpunt of employees whose salary is > 5000
        System.out.println("");
        Long count = empList.stream().filter(n-> n.getSalary()> 5000.00).count();
        System.out.println(count);

        //get first 3 employee objects as list
        List<Employee> empList3 = empList.stream().limit(3).collect(Collectors.toList());
        System.out.println("");
        System.out.println(empList3);

        //Skip first 3 employee objects as list
        List<Employee> empList4 = empList.stream().skip(3).collect(Collectors.toList());
        System.out.println("");
        System.out.println(empList4);

        //Verify ant employee under age < 27
        boolean isUnderAge = empList.stream().anyMatch(n -> n.getAge() < 27);
        System.out.println("");
        System.out.println(isUnderAge);
        //Verify all employees joined after 19
        boolean isAfter22 = empList.stream().allMatch(n -> n.getYearOfJoining() > 19);
        System.out.println("");
        System.out.println(isAfter22);

        //Sorted with comparator example : return employee objects based on id sorting

        List<Employee> empList5 =  empList.stream().sorted((e1,e2) -> {
            return e1.getId() - e2.getId();
        }).collect(Collectors.toList());
        System.out.println("");
        System.out.println(empList5);

        //minimum salary employee details.
        Employee emp = empList.stream().min((e1,e2) -> (int) (e1.getSalary()-e2.getSalary())).get();
        System.out.println("");
        System.out.println(emp);

        //Average of all salaries
        Double avgSalary = empList.stream().mapToDouble(n->n.getSalary()).average().getAsDouble(); // Similarly we have mapToInt. mapToLong
        System.out.println("");
        System.out.println(avgSalary);

        //Out of all e,ployees, whose joining date is > 20 and also need to trace how manhy employees are being processed
        List<Employee> empList6= empList.stream().peek(System.out::println).filter(n->n.getYearOfJoining()>20).collect(Collectors.toList());
        System.out.println("");
        System.out.println(empList6);

        //Collect all employee names as list whose age is greater than 27
        List<String> empNames = empList.stream().filter(n-> n.getAge()>27).map(Employee::getName).collect(Collectors.toList());
        System.out.println("");
        System.out.println(empNames);

        //Unique department names
        List<String> depNames= empList.stream().map(Employee::getDeptartment).distinct().collect(Collectors.toList());
        Set<String> depNamesSet= empList.stream().map(Employee::getDeptartment).collect(Collectors.toSet());
        System.out.println("");
        System.out.println(depNames);
        System.out.println(depNamesSet);

        //Collect empId as key and their salaries ie map
        Map<Integer, Double> map = empList.stream().collect(Collectors.toMap(Employee::getId, Employee::getSalary));
        System.out.println("");
        System.out.println(map);

        //getAverage Salay of each department

        Map<String, Double> mapSal =  empList.stream().collect(Collectors.groupingBy(
                Employee::getDeptartment, Collectors.averagingDouble(Employee::getSalary)

        ));
        System.out.println("");
        System.out.println(mapSal);


        //Get count of employyes Gender wise
        Map<String,Long> mamp3 = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("");
        System.out.println(mamp3);

        //Summing all employees salaries
        Double sal = empList.stream().collect(Collectors.summingDouble(Employee::getSalary));
        System.out.println("");
        System.out.println(sal);

        //Summarizing all employees salaries. Provides additional information like count, min, max and avg etcc;;
        System.out.println("");
        System.err.println(empList.stream().collect(Collectors.summarizingDouble(Employee::getSalary)));

        //Finding max age of employees
        Employee emp4 = empList.stream().collect(Collectors.maxBy((e1,e2) -> e1.getAge()-e2.getAge())).get();
        System.out.println("");
        System.out.println(emp4);

        //All department names with delimiter :::
        String allDeps = empList.stream().map(Employee::getDeptartment).collect(Collectors.joining(":::"));
        System.out.println("");
        System.out.println(allDeps);




    }
}