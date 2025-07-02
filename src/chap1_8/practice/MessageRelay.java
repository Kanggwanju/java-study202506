package chap1_8.practice;

public class MessageRelay {

    public void relay(Messenger sender, String message) {
        sender.sendMessage(message);
    }
}
