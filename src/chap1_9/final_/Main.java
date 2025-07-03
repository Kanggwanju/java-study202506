package chap1_9.final_;

public class Main {
    public static void main(String[] args) {
        String nation = Student.NATION;

        Student st1 = new Student("김철수", "991111-1233412");
//        st1.ssn = "991111-1ㄱㄱ33412";

        Student st2 = new Student("박영희", "991111-2233412");

        System.out.println("st1 = " + st1);
        System.out.println("st2 = " + st2);
    }
}
