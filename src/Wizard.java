public class Wizard extends Character implements ActionsCharacter {
    /*
     *   Mago:
     *   Dano de ataque: 12
     *   Armadura: 11
     *   Vida: 120
     *   Chance de errar o feitiço: 20%
     */

    public Wizard(String name){
        super(name);
        setHealth(120);
        setArmor(11);
        setAttackDamage(12);
        setMissChance(20);
    }

    @Override
    public void Attack() {

    }

    @Override
    public void defend() {

    }

    @Override
    public void heal() {

    }

    @Override
    public void abandonFight() {

    }

    @Override
    public void startFight() {

    }

    @Override
    public void showStatus() {
        System.out.println("Personagem: " + getName());
        System.out.println("Vida: " + getHealth());
        System.out.println("Armadura " + getArmor());
        System.out.println("Dano de ataque: " + getAttackDamage());
        System.out.println("Chance de errar o feitiço: " + getMissChance());
    }
}
