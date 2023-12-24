package org.example;

import java.util.HashMap;
import java.util.Map;

public class Department {
    private Map<Student, Integer> studentGrades;

    public Department() {
        this.studentGrades = new HashMap<>();
    }

    public void addStudentWithGrade(Student student, int grade) {

        boolean repeated = false;

        for (Map.Entry<Student, Integer> entry : this.studentGrades.entrySet()) {
            Student studentInMap = entry.getKey();
            String lastName = studentInMap.getLastName();

            if (lastName.equalsIgnoreCase(student.getLastName())) {
                entry.setValue(grade);
                entry.getKey().setName(student.getName());
                repeated = true;
            }
        }

        if (!repeated) {
            this.studentGrades.put(student, grade);
        }
    }

    public void printStudentWithGrades() {
        studentGrades.forEach((student, integer) ->
                System.out.println(student.getName() + " " + student.getLastName() + " : " + integer));
    }
}
