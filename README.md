## Exercise 2
Exercise 2: Java basics  
Create a simple `Department` class that can hold a `Map` (`Student`, `Integer`) with student grades.
The student class has the attributes `name` and `last name`.
The department class should have two methods:  
1. One method that allows to add a student and its grade into the map. If a student to add has the same last name that an student already added to the map then the existing entry should be replaced with the new entry.
2. One method that allows to print each student and the mark.


## Solution
Main
```java
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
```
Output
```java
Adding students to department...

Students with grades:
Pepe Botella : 9
Victor Perez : 8
John Doe : 10

Adding student with same last name as student2: Student{name='Cristian', lastName='Botella'} with grade 7

Students with grades after adding student4:
Cristian Botella : 7
Victor Perez : 8
John Doe : 10
```