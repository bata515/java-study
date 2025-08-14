package com.example.javastudy;

public class SuperHero extends Hero {
    boolean flying = false;

    public SuperHero() {
        super();
    }

    public SuperHero(String name) {
        super(name);
    }

    public void  fly() {
        flying = true;
    }
    public void land() {
        flying = false;
    }

    //親クラスのメソッドをオーバーライド
    public void run() {
        System.out.println(this.name + "はスーパー逃げ出した！");
    }

    @Override
    public void attack() {
        System.out.println(this.name + "はスーパー攻撃した！");
    }

    //多態性の実験用メソッド
    public static void drink() {
        System.out.println("スーパーヒーローは飲み物を飲む！");
    }

    public static void changeName(Hero hero,String newName) {
        hero.name = newName;
    }
}
