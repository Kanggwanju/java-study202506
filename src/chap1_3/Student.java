package chap1_3;

public class Student {

    // 프로퍼티(필드)
    String studentId;
    String name;
    int grade;

    // 기능(메서드)
    void updateGrade(int newGrade) {
        grade = newGrade;
    }
    void printStudentInfo() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
    }

    Student() {
        studentId = "201811232";
        name = "판주";
        grade = 2;
    }

}
