package chap2_7.lambda.basic;

public class Main {

    public static void order(Pet pet) {
        System.out.println("주인님의 명령입니다!");
        // 콜백함수 처리
        pet.eat();
        System.out.println("꺼어어어어억!");
    }

    public static void main(String[] args) {

        Pet dog = () -> System.out.println("강아지는 사료를 먹어요~");

        order(dog);
        System.out.println("=======================");

        order(new Cat());


        System.out.println("=======================");

        order (new Pet() {
            @Override
            public void eat() {
                System.out.println("호랑이는 생고기를 먹어요");
            }
        });

        System.out.println("=======================");

        order(() -> System.out.println("호랑이는 생고기를 먹어요"));

        System.out.println("=======================");
        
        order(() -> {
            System.out.println("호호라라");
            System.out.println("후하후하");
        });

    }
}
