public class Tank extends Character implements ActionsCharacter {
    /*
     *   Tanque:
     *   Dano de ataque: 10
     *   Armadura: 25
     *   Vida: 200
     */

    public Tank(String name){
        super(name);
        setArmor(25);
        setHealth(200);
        setAttackDamage(10);
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
    }
}
