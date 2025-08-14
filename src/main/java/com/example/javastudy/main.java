package com.example.javastudy;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world.");
        System.out.println("It is test.");

        //参照型の検証
        int[] a = {1};
        int[] b = a;
        b[0] = 2;
        System.out.println("配列aの先頭の値は" + a[0]); // => 2が出力される

        String strA = "strA";
        String strB = strA;
        strB = "strB";
        System.out.println("StrAの値は" + strA); // => 文字列は変更が不可になっていて、違う文字列を割り当てると別の領域に新しくデータを確保するため"strA"が出力される

        SuperHero superHero = new SuperHero("superHero");
        superHero.run();
        superHero.attack();
        SuperHero.drink();

        Hero hero = new SuperHero("superHero2");
        //多態性の実験。変数の中身はSuperHeroのインスタンスなので、継承時に子クラスにオーバーライドしたrunメソッドが実行される！
        hero.run();

        Hero[] heroes = new Hero[2];
        heroes[0] = superHero;
        heroes[1] = hero;
        for (Hero h : heroes) {
            h.run();
        }

        SuperHero.changeName(superHero,"hoge");
        superHero.run();
        //多態性は配列や引数で子クラスを親クラスとしてざっくりとらえてまとめて扱うことができる。便利！
    }
}
