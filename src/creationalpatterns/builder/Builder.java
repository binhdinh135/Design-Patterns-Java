package creationalpatterns.builder;

public interface Builder {
    Builder buildRoof(boolean hasRoof);
    Builder buildPool(boolean hasPool);
    Builder buildDoors(int doors);
    Builder buildWalls(int wall);
    Builder buildColors(String color);

    House build();
}
