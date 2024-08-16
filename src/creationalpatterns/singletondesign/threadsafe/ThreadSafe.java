package creationalpatterns.singletondesign.threadsafe;

public class ThreadSafe {
    private static volatile ThreadSafe INSTANCE;
    private ThreadSafe() {}
    public static synchronized ThreadSafe getInstance() {
        if (INSTANCE == null)
            INSTANCE = new ThreadSafe();
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
