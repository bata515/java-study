package com.example.javastudy.characters;

public class Warrior extends Hero {
    private int strength;
    private boolean shieldEquipped;

    public Warrior(String name) {
        super(name);
        this.strength = 15;
        this.shieldEquipped = true;
    }

    public Warrior() {
        super();
        this.strength = 15;
        this.shieldEquipped = true;
    }

    @Override
    public void attack() {
        System.out.println(this.name + "は剣で攻撃した！");
        System.out.println("攻撃力：" + this.strength + "のダメージ！");
    }

    public void defend() {
        if (shieldEquipped) {
            System.out.println(this.name + "は盾で防御した！");
            System.out.println("ダメージを半減！");
        } else {
            System.out.println(this.name + "は武器で受け流した！");
            System.out.println("ダメージを軽減！");
        }
    }

    public void equipShield() {
        this.shieldEquipped = true;
        System.out.println(this.name + "は盾を装備した！");
    }

    public void unequipShield() {
        this.shieldEquipped = false;
        System.out.println(this.name + "は盾を外した！");
    }

    public void powerUp() {
        this.strength += 5;
        System.out.println(this.name + "の攻撃力が上がった！現在の攻撃力：" + this.strength);
    }

    public int getStrength() {
        return strength;
    }

    public boolean isShieldEquipped() {
        return shieldEquipped;
    }
}