package creationalpatterns.singletondesign.lazyinitialization;

public class TestClient {
    public static void main(String[] args) {
        LazyInitialization instanceOne = LazyInitialization.getInstance();
        instanceOne.setName("Binh Boong");
        LazyInitialization instanceTwo = LazyInitialization.getInstance();
        System.out.println(instanceOne.getName());
        System.out.println(instanceTwo.getName());

    }
}
