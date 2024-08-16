package DependencyInjection;

public class SMSService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("We are using SMS Service: " + message);
    }
}
