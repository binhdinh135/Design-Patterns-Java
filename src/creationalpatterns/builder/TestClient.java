package creationalpatterns.builder;

public class TestClient {
    public static void main(String[] args) {
        House house = new HouseBuilder().buildDoors(2)
                .buildColors("Red")
                .buildWalls(4)
                .buildRoof(true)
                .buildPool(false).build();
        System.out.println(house.toString());
    }
}
