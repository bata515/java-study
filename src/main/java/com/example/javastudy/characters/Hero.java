package com.example.javastudy.characters;

public abstract class Hero {
    String name;
    int hp;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public Hero() {
        this("名前は未登録！");
    }

    public void run() {
        System.out.println(this.name + "は逃げ出した！");
    }

    /**
     * 抽象メソッド学習用
     */
    public abstract void attack();

}
