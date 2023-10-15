public abstract class Character {
    private String name;
    private Integer health;
    private Integer armor;
    private Integer attackDamage;
    private Integer missChance;
    /* As variáveis precisam ser Integer ao invés de int pra permitir que receba NULL */

    /* Decidi setar como nulo porque eu pretendo definir os valores nas subclasses */

    /* Construtor da classe abstrata*/
    public Character(String name){
        this.name = name;
        this.health = null;
        this.armor = null;
        this.attackDamage = null;
        this.missChance = null;
    }



    /* Getters e Setters*/

    public Integer getMissChance() {
        return missChance;
    }

    public void setMissChance(Integer missChance) {
        this.missChance = missChance;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(Integer health) {
        this.health = health;
    }

    public void setArmor(Integer armor) {
        this.armor = armor;
    }

    public void setAttackDamage(Integer attackDamage) {
        this.attackDamage = attackDamage;
    }

    public String getName() {
        return name;
    }

    public int getArmor() {
        return armor;
    }

    public int getAttackDamage() {
        return attackDamage;
    }

    public int getHealth() {
        return health;
    }
}

