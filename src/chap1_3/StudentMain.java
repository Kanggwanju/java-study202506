package chap1_3;

public class StudentMain {

    public static void main(String[] args) {

        Student student1 = new Student();
        student1.printStudentInfo();

        System.out.println("======================");
        Student student2 = new Student();
        student2.updateGrade(4);
        student2.printStudentInfo();

        System.out.println("======================");
        Student student3 = new Student();
        student3.updateGrade(1);
        student3.printStudentInfo();
    }
}
