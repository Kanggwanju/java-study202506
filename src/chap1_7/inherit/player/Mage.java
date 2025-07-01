package chap1_7.inherit.player;

public class Mage extends Player {

    // 필드
    int mana; // 마력 게이지

    // 생성자
    public Mage(String nickName) {
        super(nickName, 40);
        this.mana = 100;
    }

    void fireBall() {
        System.out.printf("%s님이 파이어볼을 시전합니다.\n", this.nickName);
    }
}
