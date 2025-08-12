package com.example.javastudy;

public class Hero {
    String name;
    int hp;

    public Hero(String name) {
        this.name = name;
        this.hp = 100;
    }

    public Hero() {
        this("名前は未登録！");
    }
}
