package chap2_8.stream;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static chap2_8.stream.Menu.menuList;
import static java.util.stream.Collectors.toList;

public class Mapping {

    public static void main(String[] args) {

        // 요리의 이름들만 추출
        List<String> dishNames = menuList.stream()
            .map(Dish::getName)
            .collect(toList());
        System.out.println("dishNames = " + dishNames);

        System.out.println("==========================");

        List<String> browsers = List.of(
            "safari", "chrome", "ms edge",
            "opera", "firefox"
        );

        // 브라우저 목록에서 브라우저의 각 글자수를 수집
        List<Integer> lengthList = browsers.stream()
            .map(s -> s.length())
            .collect(toList());
        System.out.println("lengthList = " + lengthList);

        System.out.println("==========================");

        // 브라우저 목록에서 각 브라우저의 첫글자만 추출
        List<String> characterList = browsers.stream()
            .map(b -> String.valueOf(b.charAt(0)))
            .collect(toList());

        System.out.println("characterList = " + characterList);

        System.out.println("==========================");

        // 요리 목록에서 요리 이름과 칼로리만 추출해서
        // 새 객체에 담아 포장하여 리스트에 담고 싶음.
        // 1. Map을 생성하여 내용을 담고 리턴
        List<Map<String, Object>> menuDetails = menuList.stream()
            .map(menu -> {
                Map<String, Object> menuMap = new HashMap<>();
                menuMap.put("menuName", menu.getName());
                menuMap.put("calories", menu.getCalories());
                return menuMap;
            })
            .collect(toList());

        menuDetails.forEach(System.out::println);

        System.out.println("==========================");
        
        // 2. 따로 클래스를 만들어서 생성자를 통해 객체 생성, 반환
        List<SimpleDish> simpleDishList = menuList.stream()
            .map(menu -> new SimpleDish(menu))
            .collect(toList());
        simpleDishList.forEach(System.out::println);
        
        System.out.println("==========================");
        
        /*
            요리 목록에서 500칼로리 이상의 메뉴들의 메뉴 이름만 추출
         */

        List<String> highCalorieDishNames = menuList.stream()
            .filter(menu -> menu.getCalories() > 500)
            .map(menu -> menu.getName())
            .collect(toList());
        System.out.println("highCalorieDishNames = " + highCalorieDishNames);

        System.out.println("==========================");

        /*
            메뉴 목록에서 칼로리가 500칼로리보다 큰
            음식들을 필터링한 다음에 음식의 이름과 타입만
            추출해서 출력해주세요.

            단, 타입은 MEAT의 경우 육류라고 저장
            FISH는 어류라고 저장, OTHER 기타라고 저장
         */

        List<List<String>> highCalorieDishesNameType = menuList.stream()
            .filter(m -> m.getCalories() > 500)
            .map(m -> {
                List<String> mappedData = new ArrayList<>();
                mappedData.add(m.getName());
                mappedData.add(String.valueOf(m.getType().getTypeName()));
                return mappedData;
            })
            .collect(toList());
        System.out.println("highCalorieDishesNameType = " + highCalorieDishesNameType);

        System.out.println("==========================");

        List<DishDetail> dishDetailList = menuList.stream()
            .filter(m -> m.getCalories() > 500)
            .map(m -> new DishDetail(m))
            .collect(toList());
        System.out.println("dishDetailList = " + dishDetailList);

        System.out.println("==========================");

        // 요리의 총 칼로리 수 구하기
        int totalCalories = menuList.stream()
            .mapToInt(m -> m.getCalories())
            .sum();

        System.out.println("totalCalories = " + totalCalories);

        System.out.println("==========================");

        // 평균칼로리
        double averageCalories = menuList.stream()
            .mapToInt(m -> m.getCalories())
            .average()
            .getAsDouble();

        System.out.println("averageCalories = " + averageCalories);
    }
}
