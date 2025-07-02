package chap1_8.practice;

public class User extends Messenger {

    private String name;

    public User(String name) {
        super(name);
    }

    @Override
    void sendMessage(String message) {
        System.out.printf("[사용자] %s: %s\n", getName(), message);
    }

}
