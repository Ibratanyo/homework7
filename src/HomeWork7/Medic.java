package HomeWork7;

public class Medic extends Hero{

    public Medic(int damage, int health, String superAbilityType){
        super(damage,health,superAbilityType);
    }

    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Medic " + superAbilityType +  super.getSuperPowerType() + " health:  " + super.getDamage() + " damage:  " + super.getHealth();
    }
}
