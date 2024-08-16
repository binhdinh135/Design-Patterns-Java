package DependencyInjection;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("We are using EmailService: " + message);
    }
}
