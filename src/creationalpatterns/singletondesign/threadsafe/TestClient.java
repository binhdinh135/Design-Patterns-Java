package creationalpatterns.singletondesign.threadsafe;

public class TestClient {
    public static void main(String[] args) {
        ThreadSafe instanceOne = ThreadSafe.getInstance();
        ThreadSafe instanceTwo = ThreadSafe.getInstance();
        ThreadSafe instanceThree = ThreadSafe.getInstance();
        instanceOne.setName("Binh Dinh 135");
        System.out.println(instanceOne.getName());
        instanceOne.setName("Binh Dinh");
        System.out.println(instanceTwo.getName());
        System.out.println(instanceThree.getName());

    }
}
