package DependencyInjection;

public class Client implements InjectionMessage {
    MessageService messageService;

    // Cách 1: tiêm sự phụ thuộc bằng constructor
    // Tạo constructor có thuộc tính là messageService và set nó thôi.
//    Client(MessageService messageService) {
//        this.messageService = messageService;
//    }

    // Cách 2: tiêm sự phục thuộc bằng setter
    // Tạo một hàm setter và truyền, set tham số đó cho messageService
//    public void setMessageService(MessageService messageServiceParam) {
//        this.messageService = messageServiceParam;
//    }

    // Cách 3: tiêm sự phục thuộc bằng interface:
    // Tạo một interface InjectionMessage, sau đó class Client sẽ implement interface này
    // Và sẽ set messageservice trong hàm override


    public void sendMessage(String message) {
        messageService.sendMessage(message);
    }

    @Override
    public void setMessage(MessageService service) {
        this.messageService = service;
    }
}
