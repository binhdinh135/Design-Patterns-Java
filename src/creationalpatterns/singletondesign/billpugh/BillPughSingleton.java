package creationalpatterns.singletondesign.billpugh;

public class BillPughSingleton {
    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
    /*
    Tạo ra static nested class với vai trò 1 Helper khi muốn tách biệt
    chức năng cho 1 class function rõ ràng hơn.
    Đây là cách thường hay được sử dụng và có hiệu suất tốt
     */
    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }
}
