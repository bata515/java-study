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
}
