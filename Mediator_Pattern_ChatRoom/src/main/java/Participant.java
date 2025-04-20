public interface Participant {
    void sendMessage(String message);
    void sendPrivateMessage(String message, User receiver);
    void receiveMessage(String message);
}
