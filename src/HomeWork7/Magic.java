package HomeWork7;

public class Magic extends Hero{

    public Magic(int damage, int health, String superPowerType){
        super(damage,health,superPowerType);
    }


    @Override
    public String applySuperAbility(String superAbilityType) {
        return "Magic " + superAbilityType + super.getSuperPowerType() + "health:  " + super.getDamage() + " damage:  " + super.getHealth();
    }
}
