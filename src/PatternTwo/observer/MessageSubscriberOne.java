package PatternTwo.observer;

public class MessageSubscriberOne implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriberOne - This message " +
                "has been received from the observer: " + message.getMessage());
    }
}
