package HomeWork7;

public abstract class Hero implements HavingSuperAbility{
    private int damage;
    private  int health;
    private String SuperPowerType;

    public int getDamage() {
        return damage;
    }

    public int getHealth() {
        return health;
    }

    public String getSuperPowerType() {
        return SuperPowerType;
    }

    public Hero(int damage, int health, String superPowerType){
        this.damage = damage;
        this.health = health;
        SuperPowerType = superPowerType;
    }
}
