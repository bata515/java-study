package com.example.javastudy.characters;

public class Mage extends Hero {
    private int mp;
    private int magicPower;
    private String[] spells;
    private int currentSpellIndex;

    public Mage(String name) {
        super(name);
        this.mp = 50;
        this.magicPower = 20;
        this.spells = new String[]{"ファイアボール", "アイスランス", "ライトニング", "ヒール"};
        this.currentSpellIndex = 0;
    }

    public Mage() {
        super();
        this.mp = 50;
        this.magicPower = 20;
        this.spells = new String[]{"ファイアボール", "アイスランス", "ライトニング", "ヒール"};
        this.currentSpellIndex = 0;
    }

    @Override
    public void attack() {
        // TODO(human): 魔法攻撃のロジックを実装
        // 現在選択されている呪文でMPを消費して攻撃する処理
    }

    public void switchSpell(int spellIndex) {
        if (spellIndex >= 0 && spellIndex < spells.length) {
            this.currentSpellIndex = spellIndex;
            System.out.println(this.name + "は" + spells[currentSpellIndex] + "を選択した！");
        } else {
            System.out.println("そのような魔法は覚えていません...");
        }
    }

    public void meditate() {
        this.mp += 15;
        if (this.mp > 100) {
            this.mp = 100;
        }
        System.out.println(this.name + "は瞑想してMPを回復した！現在のMP：" + this.mp);
    }

    public void learnNewSpell(String spellName) {
        System.out.println(this.name + "は新しい魔法「" + spellName + "」を覚えた！");
        this.magicPower += 3;
    }

    public int getMp() {
        return mp;
    }

    public int getMagicPower() {
        return magicPower;
    }

    public String getCurrentSpell() {
        return spells[currentSpellIndex];
    }

    public String[] getAllSpells() {
        return spells.clone();
    }
}