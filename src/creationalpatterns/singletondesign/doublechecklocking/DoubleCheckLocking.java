package creationalpatterns.singletondesign.doublechecklocking;

public class DoubleCheckLocking {
    private static volatile DoubleCheckLocking INSTANCE;

    private DoubleCheckLocking() {}

    public static DoubleCheckLocking getInstance() {
        if (INSTANCE == null) {
            // Đảm bảo rằng, nếu 2 thread cùng gọi getInstance thì nó đảm bảo rằng chỉ một
            // thằng khởi tạo thôi, một thread sẽ đợi thread khởi tạo xong mới lấy ra
            // instance tạo ra trước đó.
            synchronized (DoubleCheckLocking.class) {
                if (INSTANCE == null) {
                    INSTANCE = new DoubleCheckLocking();
                }
            }
        }
        return INSTANCE;
    }
}
