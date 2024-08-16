package creationalpatterns.singletondesign.eagerinitialization;

public class ClientTest {
    public static void main(String[] args) {
        EagerInitialization eagerOne = EagerInitialization.getInstance();
        eagerOne.setName("Dinh Cong Binh");
        System.out.println(eagerOne.getName());
        EagerInitialization eagerTwo = EagerInitialization.getInstance();
        System.out.println(eagerTwo.getName());
    }
}
