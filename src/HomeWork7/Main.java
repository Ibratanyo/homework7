package HomeWork7;

public class Main {

    public static void main(String[] args) {
        Magic magic = new Magic(60, 200," Kinesis, ");
        Medic medic = new Medic(50, 150, " Heal,");
        Warrior warrior = new Warrior(60,200," Critical Damage,");
        HavingSuperAbility[] havingSuperAbilities = {magic,medic,warrior};
        for (int i = 0; i < havingSuperAbilities.length; i++) {
            System.out.println(havingSuperAbilities[i].applySuperAbility("is using Power"));

        }
    }
}
