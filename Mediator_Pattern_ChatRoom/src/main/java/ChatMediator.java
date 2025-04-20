public interface ChatMediator {
    void broadcastMessage(User sender, String message);
    void sendPrivateMessage(String message, User sender, User receiver);
    void addUser(User user);
    void removeUser(User user);
}
