package DependencyInjection;

public class TestMain {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        MessageService smsService = new SMSService();
        MessageService iMessService = new IMessService();

        //C1: tiêm sự phục thuộc bằng constructor:
//        Client client = new Client(emailService);

        //C2: tiêm sự phục thuộc bằng setter:
//        Client client = new Client();
//        client.setMessageService(smsService);

        // C3: tiêm sự phục thuộc bằng Interface

        Client client = new Client();
        client.setMessage(iMessService);
        client.sendMessage("This is example for Dependency Injection - Binh Dinh");

    }
}
