package advanced.t6_DefiningClasses.CompanyRoster;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int countOfPeople = Integer.parseInt(scan.nextLine());
        ArrayList<Employee> employees = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        for (int i = 0; i < countOfPeople; i++) {
            String[] peopleInfo = scan.nextLine().split(" ");
            String name = peopleInfo[0];
            double salary = Double.parseDouble(peopleInfo[1]);
            String position = peopleInfo[2];
            String department = peopleInfo[3];
            Employee employee = null;
            switch (peopleInfo.length){
                case 4: //No email, No age
                    employee = new Employee(name,salary,position,department);
                    break;
                case 6:// has email has age
                    String email = peopleInfo[4];
                    int age = Integer.parseInt(peopleInfo[5]);
                    employee = new Employee(name,salary,position,department,email,age);
                    break;
                case 5: //has email or age
                    if(peopleInfo[4].matches("\\d+")){
                        int personAge = Integer.parseInt(peopleInfo[4]);
                        employee = new Employee(name,salary,position,department,personAge);
                    }else{
                        String personEmail = peopleInfo[4];
                        employee = new Employee(name,salary,position,department,personEmail);
                    }
                    break;
            }
            employees.add(employee);
            boolean departmentExists = departmentList.stream().filter(dep -> dep.getName().equals(department)).count() >= 1;
            if(!departmentExists){
                departmentList.add(new Department(department));
            }
            Department currentDepartment = departmentList.stream().filter(dep -> dep.getName().equals(department)).findFirst().get();
            currentDepartment.getEmployees().add(employee);
        }

        Department highestPaidDepartment = departmentList.stream()
                .max(Comparator.comparingDouble(Department::calculateAverageSalary))
                .get();
        System.out.printf("Highest Average Salary: %s%n", highestPaidDepartment.getName());

        highestPaidDepartment.getEmployees().stream()
                .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))
                .forEach(System.out::println);
        }
}

