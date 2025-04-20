public class ChatManager {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoom("CSK Dugout");

        User dhoni = new User("Dhoni");
        User jadeja = new User("Jadeja");
        User ashwin = new User("Ashwin");

        chatRoom.addUser(dhoni);
        chatRoom.addUser(jadeja);
        chatRoom.addUser(ashwin);

        jadeja.sendMessage("Hello team!");
        dhoni.sendPrivateMessage("Pad up!", ashwin);

        chatRoom.removeUser(jadeja);
        jadeja.sendMessage("Can I still talk?");
    }
}
