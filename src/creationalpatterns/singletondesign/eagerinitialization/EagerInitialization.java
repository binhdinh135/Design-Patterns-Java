package creationalpatterns.singletondesign.eagerinitialization;

public class EagerInitialization {
    // Tạo một biến INSTANCE kiểu trả về chính nó với 'private static final'
    private static final EagerInitialization INSTANCE = new EagerInitialization();

    // Tạo một constructor dạng private
    private EagerInitialization() {}

    // Tạo một hàm getInstance trả về đối tượng INSTANCE phía trên dạng static
    public static EagerInitialization getInstance() {
        return INSTANCE;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
