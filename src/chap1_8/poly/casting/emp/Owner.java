package chap1_8.poly.casting.emp;

// 사장님
public class Owner {

    // 직원들에게 일을 명령하는 기능
    public void orderWork(Employee employee) {
        System.out.println("사장님이 업무를 지시합니다.");
        employee.work();
        // 다운캐스팅을 함부로 하면 에러 발생 가능성이 있다.
        if (employee instanceof Developer) {
            ((Developer) employee).develop();
        } else if (employee instanceof Designer) {
            ((Designer) employee).design();
        }




    }
}
