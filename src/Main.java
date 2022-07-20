

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        Weapon weapon = new Weapon("fire", "gun");
        boss1.setHealth(500);
        boss1.setDamage(30);
        boss1.setSuperPower("SuperJump");
        boss1.setTypeDefence("Бронижелет");
    }
}
