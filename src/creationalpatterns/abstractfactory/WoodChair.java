package creationalpatterns.abstractfactory;

public class WoodChair implements Chair {
    @Override
    public void create() {
        System.out.println("Create Wood Chair");
    }
}
