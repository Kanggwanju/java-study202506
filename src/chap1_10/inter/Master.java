package chap1_10.inter;

// 동물들의 주인
public class Master {

    // 동물에게 사냥을 명령
    public void letsHund(Huntable animal) {
        animal.hunt();
    }
    // 동물과 재밌게 놀아주는 명령
    public void letsPlay(Pet animal) {
        animal.handle();
    }
}
