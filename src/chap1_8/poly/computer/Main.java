package chap1_8.poly.computer;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer(new SamsungKeyboard());

        computer.changeKeyboard(new AppleKeyboard());
    }
}
