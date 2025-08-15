package com.example.javastudy;

import com.example.javastudy.characters.Hero;
import com.example.javastudy.characters.SuperHero;

import java.util.Objects;

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

        //どんなオブジェクトでも自動で継承されているObject.toString()が呼び出せるのか検証。
        System.out.println(superHero.toString());

        SuperHero fuga1 = new SuperHero("fuga");
        SuperHero fuga2 = fuga1;
        SuperHero fuga3 = new SuperHero("fuga");
        System.out.println(Objects.equals(fuga1, fuga2));
        System.out.println(Objects.equals(fuga1, fuga3));
        String hoge1 = "hoge";
        String hoge2 = "hoge";
        System.out.println(Objects.equals(hoge1, hoge2));


        System.out.println("Objects.equals()メソッドで比較すれば文字列や数値同士の比較は値一致で判断してくれる");
        // 文字列比較
        String str1 = "hello";
        String str2 = new String("hello");
        System.out.println(Objects.equals(str1, str2)); // true（値が同じ）

        // 数値比較
        Integer num1 = 100;
        Integer num2 = 100;
        System.out.println(Objects.equals(num1, num2));  // true（値が同じ）

        // 小数比較
        Double d1 = 3.14;
        Double d2 = 3.14;
        System.out.println(Objects.equals(d1, d2));      // true（値が同じ）
    }
}
