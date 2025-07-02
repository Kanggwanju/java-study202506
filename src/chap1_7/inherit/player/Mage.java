package chap1_7.inherit.player;

public class Mage extends Player {

    // 필드
    int mana; // 마력 게이지

    // 생성자
    public Mage(String nickName) {
        super(nickName, 40);
        this.mana = 100;
    }

    @Override
    void showStatus() {
        super.showStatus();
        System.out.println("# 마력: " + this.mana);
    }

    void fireBall(Player player) {
        if (this == player) {
            System.out.println("자기 자신에게는 시전할 수 없습니다.");
            return;
        }
        System.out.printf("%s님이 파이어볼을 시전합니다.\n", this.nickName);
        /*
            파이어볼을 맞은 플레이어의 직업이 전사면 50의 데미지를 입혀라
            마법사면 60의 데미지
            사냥꾼이면 40의 데미지를 입혀주세요.

            만약 전사가 파이어볼을 맞으면 해당 전사는 돌진(dash)를 시전해야합니다.
         */
        int damage = 0;
        if (player instanceof Warrior) {
            damage = 50;
            ((Warrior) player).dash(this);
        } else if (player instanceof Mage) {
            damage = 60;
        } else if (player instanceof Hunter) {
            damage = 40;
        }
        player.hp -= damage;
        System.out.printf("%s님이 %d의 피해를 입었습니다.\n", player.nickName, damage);
    }
}
