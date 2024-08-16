package creationalpatterns.abstractfactory;

public class PlasticChair implements Chair {
    @Override
    public void create() {
        System.out.println("Creating a PlasticChair");
    }
}
