package chap1_3;

// 실행용 클래스: 실제로 Dancer 생성
public class DancerMain {

    public static void main(String[] args) {

        // 데이터 타입: 데이터를 담는 그릇
        // 기본 데이터 타입: byte, short, int, long...

        // 설계도(class)를 가져와서 객체(instance)를 찍어낸다.
        // 클래스 이름을 타입 그대로 사용
        // 객체 생성 코드
        Dancer park = new Dancer();

//        park.dancerName = "박격포";
//        park.crewName = "전쟁크루";
//        park.danceLevel = 1;
//        park.genres = new String[] {"케이팝", "코레오"};

        Dancer kim = new Dancer();
        /*
            const park = {
                dancerName: '',
                crewName: '',
                genres: [],
                danceLevel: 0,
                introduce: () => {}
            };
         */

        System.out.println("park = " + park);
        System.out.println("kim = " + kim);

        park.introduce();
        kim.introduce();
    }
}
