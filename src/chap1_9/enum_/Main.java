package chap1_9.enum_;

public class Main {

    public static void main(String[] args) {

        Pizza pizza = new Pizza();

        pizza.orderPizza();
        pizza.readyPizza();
        pizza.deliverPizza();

        // 현재 주문 상태
        System.out.println("주문 상태: " + pizza.getStatus());
        System.out.println("소요 시간: " + pizza.getTimeToSetup());
    }
}
