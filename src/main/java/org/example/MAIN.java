package org.example;

public class MAIN {
    public static void main(String[] args) {
        Department department = new Department();
        Student student1 = new Student("John", "Doe");
        Student student2 = new Student("Pepe", "Botella");
        Student student3 = new Student("Victor", "Perez");
        Student student4 = new Student("Cristian", "Botella");

        System.out.println("\nAdding students to department...");
        department.addStudentWithGrade(student1, 10);
        department.addStudentWithGrade(student2, 9);
        department.addStudentWithGrade(student3, 8);

        System.out.println("\nStudents with grades:");
        department.printStudentWithGrades();

        System.out.println("\nAdding student with same last name as student2: "+student4+" with grade 7");
        department.addStudentWithGrade(student4, 7);

        System.out.println("\nStudents with grades after adding student4:");
        department.printStudentWithGrades();
    }
}