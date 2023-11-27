class Shield {
    private String name;
    private int level;
    private int defense;

    public Shield(String name, int level, int defense) {
        this.name = name;
        this.level = level;
        this.defense = defense;
    }

    public String getName() {
        return name;
    }

    public int getDefense() {
        return defense;
    }

    public void shieldlevelUp() {
        level++;
        defense *=(1+0.05*level);
        System.out.printf("%s leveled up to level %d! Defense increased to %d.\n", name, level, defense);
    }

    public int getLevel() {
        return level;
    }
}
