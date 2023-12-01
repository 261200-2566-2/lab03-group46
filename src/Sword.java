public class Sword {
    private String name;
    private int level;
    private int damage;

    public Sword(String name, int level, int damage) {
        this.name = name;
        this.level = level;
        this.damage = damage;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void swordlevelUp() {
        level++;
        damage *= (1 + 0.1 * level);
        System.out.printf("%s leveled up to level %d! Damage increased to %d.\n", name, level, damage);
    }
    public int getLevel() {
        return level;
    }
}
