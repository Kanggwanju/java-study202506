package chap2_8.stream;

import java.util.List;

import static chap2_8.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Filtering {

    public static void main(String[] args) {

        // 요리 메뉴 중 채식주의자가 먹을 수 있는 요리만 필터링
        /*List<Dish> vegetarianList = new ArrayList<>();

        for (Dish dish : menuList) {
            if (dish.isVegetarian()) {
                vegetarianList.add(dish);
            }
        }*/

        List<Dish> vegetarianList = menuList.stream() // 1. 데이터 소스 생성
            .filter(Dish::isVegetarian)               // 2. 중간연산
            .collect(toList());            // 3. 최종연산

//        System.out.println("vegetarianList = " + vegetarianList);
        vegetarianList.forEach(dish -> System.out.println(dish));
//        vegetarianList.forEach(System.out::println);

        System.out.println("==============");

        // 메뉴중 육류이면서 600칼로리 미만인 요리 필터링
        List<Dish> meatLowCalories = menuList.stream()
            .filter(menu -> menu.getType() == DishType.MEAT && menu.getCalories() < 600)
            .collect(toList());
        meatLowCalories.forEach(System.out::println);

        System.out.println("==============");

        // 메뉴중에 요리 이름이 4글자인 것만 필터링
        menuList.stream()
            .filter(menu -> menu.getName().length() == 4)
            .collect(toList())
            .forEach(System.out::println);

        System.out.println("===============");

        // 300칼로리보다 큰 요리 중 앞에서 3개만 필터링
        menuList.stream()
            .filter(menu -> menu.getCalories() > 300)
            .limit(3) // 앞에서부터 3개만 가져옴
            .collect(toList())
            .forEach(System.out::println);

        System.out.println("===============");

        // 300칼로리보다 큰 요리 중 처음 2개는 건너뛰고 필터링
        menuList.stream()
            .filter(menu -> menu.getCalories() > 300)
            .skip(2)
            .collect(toList())
            .forEach(System.out::println);

        System.out.println("===============");

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 1, 2, 3, 3, 4, 1, 2, 3);

        // 숫자리스트에서 짝수만 필터링
        List<Integer> evenNumbers = numbers.stream()
            .filter(n -> n % 2 == 0)
            .distinct()    // 중복 제거해줌
            .collect(toList());

        System.out.println("evenNumbers = " + evenNumbers);


    }//end main
}
