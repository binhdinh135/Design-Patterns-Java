package creationalpatterns.factorymethod;

public class TestClient {
    public static void main(String[] args) {

        HardCandy hardCandy = (HardCandy) CandyFactory.getCandy(CandyType.HARD_CANDY);
        System.out.println(hardCandy.getCandyName());

        Candy nouguetCandy = CandyFactory.getCandy(CandyType.NOUGUET_CANDY);
        System.out.println(nouguetCandy.getCandyName());

        Candy mintyCandy = CandyFactory.getCandy(CandyType.MINTY_CANDY);
        System.out.println(mintyCandy.getCandyName());
    }
}
