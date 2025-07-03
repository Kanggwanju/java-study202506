package chap1_9.final_;

public class Student {

    public String name; // 학생명
    public final String ssn; // 주민번호

    // 자바의 상수 (불변성: final, 유일성: static)
    public static final String NATION;

    // static 전용 생성자 - 정적 초기화자 (static initializer)
    static {
        System.out.println("정적 초기화자 호출!"); // 스태틱 접근시 최초 1번 호출
        NATION = "대한민국";
    }
    
    public Student(String name, String ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    @Override
    public String toString() {
        return "Student{" +
            "name='" + name + '\'' +
            ", ssn='" + ssn + '\'' +
            '}';
    }
}