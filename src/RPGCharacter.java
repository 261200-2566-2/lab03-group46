public class RPGCharacter {

    private String name;
    private int level;
    private int hp = 100;
    private int mana = 100;
    private double runSpeed = 100;
    private Sword equippedSword;
    private Shield equippedShield;

    public RPGCharacter(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }

    public int getHp() {
        return hp;
    }

    public int getMana() {
        return mana;
    }

    public double getRunSpeed() {
        return runSpeed;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public void setRunSpeed(double runSpeed) {
        this.runSpeed = runSpeed;
    }

    public Sword getEquippedSword() {
        return equippedSword;
    }

    public Shield getEquippedShield() {
        return equippedShield;
    }

    public void attack(RPGCharacter target) {
        int damage = calculateSwordDamage();
        target.setHp(target.getHp() - damage);
        System.out.printf("%s attacks %s for %d damage!\n", name, target.getName(), damage);
    }

    public void defend(RPGCharacter attacker) {
        int defense = calculateShieldDefense();
        int damage = attacker.calculateSwordDamage() - defense;
        setHp(getHp() - damage);
        System.out.printf("%s defends against %s's attack, reducing damage by %d!\n", name, attacker.getName(), defense);
    }

    public void equipSword(Sword sword) {
        equippedSword = sword;
        updateRunSpeed();
        System.out.printf("%s equips %s!\n", name, sword.getName());
    }

    public void equipShield(Shield shield) {
        equippedShield = shield;
        updateRunSpeed();
        System.out.printf("%s equips %s!\n", name, shield.getName());
    }

    public void levelUp() {
        level++;
        setHp(this.hp + 10 * level);
        setMana(this.mana + 2 * level);
        setRunSpeed(this.runSpeed += this.runSpeed * (0.1 + 0.03 * level));
        System.out.printf("%s levels up to level %d!\n", name, level);
    }

    private int calculateSwordDamage() {
        if (equippedSword == null) {
            return 10;
        } else {
            return equippedSword.getDamage() + (int)(equippedSword.getDamage() * 0.1 * level);
        }
    }

    private int calculateShieldDefense() {
        if (equippedShield == null) {
            return 0;
        } else {
            return equippedShield.getDefense() + (int) (equippedShield.getDefense() * 0.05 * level);
        }
    }

    private void updateRunSpeed() {
        double baseRunSpeed = this.runSpeed;

        if (equippedSword != null) {
            double swordRunSpeedDecrease = (int)(baseRunSpeed * (0.1 + 0.04 * equippedSword.getLevel()));
            baseRunSpeed -= swordRunSpeedDecrease;
        }

        if (equippedShield != null) {
            double shieldRunSpeedDecrease = (int)(baseRunSpeed * (0.1 + 0.08 * equippedShield.getLevel()));
            baseRunSpeed -= shieldRunSpeedDecrease;
        }
        setRunSpeed(baseRunSpeed);
    }

    public void displayInfo() {
        System.out.println("Character Information:");
        System.out.println("Name: " + getName());
        System.out.println("Level: " + getLevel());
        System.out.println("HP: " + getHp());
        System.out.println("Mana: " + getMana());
        System.out.println("Run Speed: " + getRunSpeed());
        System.out.println("Equipped Sword: " + (getEquippedSword() != null ? getEquippedSword().getName() : "None"));
        System.out.println("Equipped Shield: " + (getEquippedShield() != null ? getEquippedShield().getName() : "None"));
        System.out.println("-------------------------------------------------------------------------------------------");
    }
}


