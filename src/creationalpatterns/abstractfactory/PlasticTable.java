package creationalpatterns.abstractfactory;

public class PlasticTable implements Table {
    @Override
    public void create() {
        System.out.println("Creating PlasticTable");
    }
}
