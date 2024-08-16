package PatternTwo.observer;

public class ClientTest {
    public static void main(String[] args) {
        MessagePublisher publisher = new MessagePublisher();

        MessageSubscriberOne subscriberOne = new MessageSubscriberOne();
        MessageSubscriberTwo subscriberTwo = new MessageSubscriberTwo();
        MessageSubscriberThree subscriberThree = new MessageSubscriberThree();

        publisher.attach(subscriberOne);
        publisher.attach(subscriberTwo);
        publisher.attach(subscriberThree);
        publisher.notifyUpdate(new Message("Notify to all observers"));

        publisher.detach(subscriberOne);
        publisher.notifyUpdate(new Message("Message send after detach sub one"));

        publisher.detach(subscriberThree);

        publisher.notifyUpdate(new Message("Message send after detach sub three"));


    }
}
