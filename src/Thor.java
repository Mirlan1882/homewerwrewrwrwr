

public class Thor extends Hero{
    private boolean deafening;

    public Thor(int health, int damage) {
        super(health, damage, SuperAbility.DEAFENING);
    }

    public boolean isDeafening() {
        return deafening;
    }

    public void setDeafening(boolean deafening) {
        this.deafening = deafening;
    }

    public void applySuperPower(Boss boss, Hero[] heroes) {
        boolean trueFalseDeafening = RPG_Game.random.nextBoolean();
        this.setDeafening(trueFalseDeafening);

            }
        }
