package chap2_4.collection.map;

import java.time.LocalDate;
import java.util.*;

public class MapExample {

    public static void main(String[] args) {

        /*
            Map (JSON 객체, 파이썬 딕셔너리 대응)
            1. key와 value를 가진 엔트리 객체를 보관하는 자료구조
            2. key는 중복을 허용하지 않으며 value는 중복을 허용
            3. 순서를 보장하지 않음
         */

        Map<String, Object> map = new HashMap<>();

        /*
            데이터 추가: put
            {
                "empName" : "김철수",
                "hireDate" : "2012-05-13",
                "salary" : 5000000
            }
         */
        map.put("empName", "김철수");
        map.put("hireDate", LocalDate.of(2012, 5, 13));
        map.put("salary", 5000000);

        System.out.println(map);
        System.out.println(map.size());

        // 맵에 있는 데이터 참조
        // 처음 들어갈 때 업캐스팅으로 map의 value로 들어왔지만
        // 다운캐스팅을 거쳐야 고유의 기능 사용가능.
        String empName = (String) map.get("empName");
        System.out.println("empName = " + empName);

        LocalDate hireDate = (LocalDate) map.get("hireDate");
        System.out.println("hireDate = " + hireDate);

        int salary = (int) map.get("salary");
        System.out.println("salary = " + salary);
        
        // 중복된 키를 사용해서 데이터를 삽입 -> 수정
        map.put("empName", "박영희");
        System.out.println(map);

        // 수정 전에는 정확하게 데이터가 있는지 체크
        System.out.println(map.containsKey("salary") );

        System.out.println("================");

        // map의 반복문 처리
        Set<String> keys = map.keySet();
        System.out.println("keys = " + keys);

        for (String key : keys) {
            System.out.printf("[%s] : %s\n", key, map.get(key));
        }
        // %s에 들어가는게 가능?

        System.out.println("================");

        Stack<String> stack = new Stack<>();
        Queue<String> queue = new LinkedList<>();

    }
}
