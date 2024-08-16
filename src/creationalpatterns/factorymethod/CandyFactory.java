package creationalpatterns.factorymethod;

public class CandyFactory {
    public static Candy getCandy(CandyType candyType) {
        return switch (candyType) {
            case HARD_CANDY -> new HardCandy();
            case MINTY_CANDY -> new MintyCandy();
            case NOUGUET_CANDY -> new NouguetCandy();
            default -> null;
        };

    }
}
