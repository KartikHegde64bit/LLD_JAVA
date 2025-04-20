import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ChatRoom implements ChatMediator {
    private final String id;
    private final String roomName;
    private final List<User> usersList;

    public ChatRoom(String roomName) {
        this.id = UUID.randomUUID().toString();
        this.roomName = roomName;
        this.usersList = new ArrayList<>();
    }

    @Override
    public void addUser(User user) {
        if (!usersList.contains(user)) {
            usersList.add(user);
            user.setChatMediator(this);
            System.out.println(user.getName() + " has joined " + roomName);
        }
    }

    @Override
    public void removeUser(User user) {
        if (usersList.remove(user)) {
            user.setChatMediator(null);
            System.out.println(user.getName() + " has been removed from " + roomName);
        }
    }

    @Override
    public void broadcastMessage(User sender, String message) {
        for (User receiver : usersList) {
            if (!receiver.equals(sender)) {
                receiver.receiveMessage("[Broadcast from " + sender.getName() + "]: " + message);
            }
        }
    }

    @Override
    public void sendPrivateMessage(String message, User sender, User receiver) {
        if (usersList.contains(receiver)) {
            receiver.receiveMessage("[Private from " + sender.getName() + "]: " + message);
        } else {
            System.out.println("User " + receiver.getName() + " is not in the chatroom.");
        }
    }
}
