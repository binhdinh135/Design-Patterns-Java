package PatternTwo.observer;

public class MessageSubscriberTwo implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriberTwo - This message " +
                "has been received from the observer: " + message.getMessage());

    }
}
