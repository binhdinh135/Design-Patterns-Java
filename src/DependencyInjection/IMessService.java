package DependencyInjection;

public class IMessService implements  MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("We are using IMessMessage: " + message);
    }
}
