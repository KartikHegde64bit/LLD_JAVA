import java.util.UUID;

public class User implements Participant {
    private final String id;
    private final String name;
    private ChatMediator chatMediator;

    public User(String name) {
        this.name = name;
        this.id = UUID.randomUUID().toString();
    }

    public void setChatMediator(ChatMediator chatMediator) {
        this.chatMediator = chatMediator;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    @Override
    public void sendMessage(String message) {
        if (chatMediator != null) {
            chatMediator.broadcastMessage(this, message);
        } else {
            System.out.println(name + " is not part of any chatroom.");
        }
    }

    @Override
    public void sendPrivateMessage(String message, User receiver) {
        if (chatMediator != null) {
            chatMediator.sendPrivateMessage(message, this, receiver);
        } else {
            System.out.println(name + " is not part of any chatroom.");
        }
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " received: " + message);
    }
}
