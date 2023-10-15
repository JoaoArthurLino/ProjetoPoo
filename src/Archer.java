public class Archer extends Character implements ActionsCharacter{
    /*
     *   Arqueiro:
     *   Dano de ataque: 8
     *   Armadura: 15
     *   Vida: 150
     *   Chance de errar o disparo: 10%
     */

    public Archer(String name){
        super(name);
        setArmor(15);
        setHealth(150);
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
        System.out.println("Armadura " + getArmor());
        System.out.println("Dano de ataque: " + getAttackDamage());
        System.out.println("Chance de errar o disparo: " + getMissChance());
    }
}

