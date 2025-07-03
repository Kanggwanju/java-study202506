package chap1_9.enum_;

import static chap1_9.enum_.PizzaStatus.*;

public class Pizza {

    private String pizzaName;   // 피자이름
    private PizzaStatus status; // 주문 상태

    public String getStatus() {
        return status.getDescription();
    }

    public int getTimeToSetup() {
        return status.getTimeToSetup();
    }

    // 피자 주문 기능
    public void orderPizza() {
        this.status = ORDERED;
        System.out.println("피자 주문이 들어왔습니다.");
    }
    // 피자 요리 완료 기능
    public void readyPizza() {
        if (this.status == ORDERED) {
            this.status = READY;
            System.out.println("피자 요리가 완료되었습니다.");
        } else {
            System.out.println("아직 피자 주문이 없습니다.");
        }
    }
    // 피자 배달 기능
    public void deliverPizza() {
        if (this.status == READY) {
            this.status = DELIVERED;
            System.out.println("피자가 배달되었습니다.");
        } else {
            System.out.println("피자가 아직 요리중입니다.");
        }
    }
}
