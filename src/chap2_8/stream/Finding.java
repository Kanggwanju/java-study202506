package chap2_8.stream;

public class Finding {

    public static void main(String[] args) {

        // 요리 목록에서 채식주의가 먹을 수 있는 요리가 하나라도 있는가?
        boolean flag1 = Menu.menuList.stream()
            .filter(menu -> menu.getType() == DishType.OTHER)
            .anyMatch(menu -> menu.isVegetarian());

        System.out.println("flag1 = " + flag1);

        System.out.println("==========================");

        // 요리 목록중에 모든 요리의 칼로리가 1000 미만입니까?
        boolean flag2 = Menu.menuList.stream()
            .allMatch(m -> m.getCalories() < 1000);
        System.out.println("flag2 = " + flag2);

        System.out.println("==========================");

        // 요리 중에 첫번째 발견된 생선요리를 찾기
        Dish firstFishDishes = Menu.menuList.stream()
            .filter(m -> m.getType() == DishType.FISH)
            .findFirst()
            .get();

        System.out.println("firstFishDishes = " + firstFishDishes);

    }
}
