package creationalpatterns.abstractfactory;

public class FurnitureFactory {
    private FurnitureFactory() {

    }
    // Returns a concrete factory object that is an instance of the
    // concrete factory class appropriate for the given architecture.
    public static FurnitureAbstractFactory getFactory(MaterialType materialType) {
        return switch (materialType) {
            case FLASTIC -> new FlasticFactory();
            case WOOD -> new WoodFactory();
            default -> throw new UnsupportedOperationException("This furniture is unsupported ");
        };
    }

}
