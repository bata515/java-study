package com.example.javastudy;

public class main {
    public static void main(String[] args) {
        System.out.println("Hello world.");
        System.out.println("It is test.");

        //参照型の検証
        int a[] = {1};
        int b[] = a;
        b[0] = 2;
        System.out.println("配列aの先頭の値は" + a[0]); // => 2が出力される

        String strA = "strA";
        String strB = strA;
        strB = "strB";
        System.out.println("StrAの値は" + strA); // => 文字列は変更が不可になっていて、違う文字列を割り当てると別の領域に新しくデータを確保するため"strA"が出力される

        Hero hero = new Hero();
        Hero subHero = new Hero("subHero");
        System.out.println(hero.name);
        System.out.println(subHero.name);
        hero.run();
        subHero.run();

        SuperHero superHero = new SuperHero("superHero");
        superHero.run();
    }
}
