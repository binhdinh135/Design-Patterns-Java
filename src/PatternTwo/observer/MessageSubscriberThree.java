package PatternTwo.observer;

public class MessageSubscriberThree implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("MessageSubscriberThree - This message " +
                "has been received from the observer: " + message.getMessage());

    }
}
