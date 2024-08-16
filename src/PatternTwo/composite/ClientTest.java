package PatternTwo.composite;

public class ClientTest {
    public static void main(String[] args) {
        Boss boss = new Boss("Manh Hoang", 3000, 60);
        BusinessAnalyst ba = new BusinessAnalyst("My Huong", 1200, 30);
        Leader leader = new Leader("Van Chien", 2000, 35);
        Developer devOne = new Developer("Hoang Tung", 1500, 30);
        Developer devTwo = new Developer("Van Hung", 1000, 29);

        boss.add(ba);
        boss.add(leader);
        leader.add(devOne);
        leader.add(devTwo);
        boss.print();
    }
}
