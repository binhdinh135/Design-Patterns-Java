package creationalpatterns.singletondesign.lazyinitialization;

public class LazyInitialization {
    // Lười biếng (Lazy)
    // Khởi tạo một biến Instance dang private static
    private static LazyInitialization INSTANCE;
    // Vẫn có một hàm tạo private để đảm bảo rằng là chỉ được khởi tạo trong class này,
    private LazyInitialization() {
    }

    public static LazyInitialization getInstance() {
        // tại hàm getInstance, nếu instance == null thì ta mới tạo ra instance rồi return
        // instance đó.
        if (INSTANCE == null)
            INSTANCE = new LazyInitialization();
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

