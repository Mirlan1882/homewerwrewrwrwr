
public class Boss {
    private int health;
    private int damage;
    private String typeDefence;
    private String superPower;
    public int gethealth(){
        return health;
    }
    public int getdamage(){
        return damage;
    }
    public String gettypeDefence(){
        return typeDefence;
    }
    public String getsuperPower(){
        return superPower;
    }
    public void sethealth(int Health){
        this.health = health;
    }
    public void setdamage(int Damage){
        this.health = damage;
    }
    public void settypeDefence(String typeDefence){
        this.typeDefence = typeDefence;
    }
    public void setsuperPower(String superPower){
        this.superPower = superPower;
    }
}