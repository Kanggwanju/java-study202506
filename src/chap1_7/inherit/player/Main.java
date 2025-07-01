package chap1_7.inherit.player;

/*
                 Object
                  |
                Player
            /      |     \
        Warrior  Mage    Hunter
          |   \   |
   Berserker   WarMage
 */


public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior("주차왕파킹");
        Mage mage = new Mage("간달프쇼킹");
        Hunter hunter = new Hunter("스티븐호킹");

        warrior.showStatus();
        warrior.attack();

//        warrior
        System.out.println("=============");

        mage.showStatus();
        mage.attack();
        System.out.println("=============");

        hunter.showStatus();
        hunter.attack();
    }
}
