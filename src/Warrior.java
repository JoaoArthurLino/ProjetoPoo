public class Warrior extends Character implements ActionsCharacter {
    /*
    *   Guerreiro:
    *   Dano de ataque: 8
    *   Armadura: 15
    *   Vida: 150
    *
    */

    public Warrior(String name){
        super(name);
        setHealth(150);
        setArmor(15);
        setAttackDamage(8);
        setMissChance(0);
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
        System.out.println("Armadura: " + getArmor());
        System.out.println("Dano de ataque: " + getAttackDamage());
    }
}
