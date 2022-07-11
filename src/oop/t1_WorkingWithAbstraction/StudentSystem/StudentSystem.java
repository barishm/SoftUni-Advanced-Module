package oop.t1_WorkingWithAbstraction.StudentSystem;

import java.util.HashMap;
import java.util.Map;

public class StudentSystem {
    private Map<String, Student> studentMap;

    public StudentSystem() {
        this.studentMap = new HashMap<>();
    }

    public Map<String, Student> getStudentMap() {
        return this.studentMap;
    }

    public void ParseCommand(String[] args) {

        String name = args[1];
        String command = args[0];

        if (command.equals("Create")) {

            int age = Integer.parseInt(args[2]);
            double grade = Double.parseDouble(args[3]);
            if (!studentMap.containsKey(name)) {
                Student student = new Student(name, age, grade);
                studentMap.put(name, student);
            }
        } else if (command.equals("Show")) {
            Student student = studentMap.get(name);

            if (student != null) {
                String studentInfo = student.getInfo();
                System.out.println(studentInfo);
            }
        }
    }
}
