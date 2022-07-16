public class Main {

    public static void main(String[] args) {
        Hero Buch = new Hero(100, 20, "fly");
        Hero Killua = new Hero(100, 50);
        Boss boss1 = new Boss();
        boss1.sethealth(300);
        boss1.setdamage(50);
        boss1.setsuperPower("Fly");
        boss1.settypeDefence("Field");
        System.out.println(boss1.getdamage() + " " + boss1.gethealth() + " " + boss1.gettypeDefence() + " " + boss1.getsuperPower());
    }
}