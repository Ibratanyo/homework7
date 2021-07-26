package HomeWork7;

public class Warrior extends Hero{

    public Warrior(int damage, int health, String superAbilityType){
        super(damage,health,superAbilityType);
    }


    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Warrior " + superAbilityType + super.getSuperPowerType() + " health:  " + super.getDamage() + " damage:  " + super.getHealth();
    }
}
