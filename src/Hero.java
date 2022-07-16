public class Hero {
    private int Health;
    private int Damage;
    private String superPower;

    public Hero(int Health, int Damage, String superPower) {
    }

    public Hero(int Health, int Damage) {

    }

    public int getHealth() {
        return Health;
    }

    public int getDamage() {
        return Damage;
    }

    public String getSuperPower() {
        return superPower;
    }
}