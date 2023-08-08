// A simple message class to encapsulate messages
class Message {
    private String content;

    public Message(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}

// A class representing a sender object
class Sender {
    public void sendMessage(Message message, Receiver receiver) {
        System.out.println("Sender: Sending message - " + message.getContent());
        receiver.receiveMessage(message);
    }
}

// A class representing a receiver object
class Receiver {
    public void receiveMessage(Message message) {
        System.out.println("Receiver: Received message - " + message.getContent());
    }
}

public class MessagePassingExample {
    public static void main(String[] args) {
        Sender sender = new Sender();
        Receiver receiver = new Receiver();

        Message message = new Message("Hello, how are you?");
        
        sender.sendMessage(message, receiver);
    }
}

