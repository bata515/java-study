package com.example.javastudy;

import com.example.javastudy.characters.Hero;
import com.example.javastudy.characters.SuperHero;

import java.util.*;

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

        List<Integer> intList = new ArrayList<>();//Arrays.asList(1, 2, 3, 4, 5)では変更不可になる。ArraysのArrayListはまた別物
        intList.add(1);
        intList.add(2);
        for (Integer i : intList) {
            System.out.println(i);
            System.out.println(intList.indexOf(1));
        }

        // ========== コレクションの復習 ==========
        System.out.println("\n=== List（ArrayList vs LinkedList）===");
        
        // ArrayList - インデックスアクセスが高速
        List<String> arrayList = new ArrayList<>();
        arrayList.add("リンゴ");
        arrayList.add("バナナ");
        arrayList.add("オレンジ");
        arrayList.add(1, "イチゴ"); // 挿入
        System.out.println("ArrayList: " + arrayList);
        System.out.println("2番目の要素: " + arrayList.get(1));
        
        // LinkedList - 挿入・削除が高速
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.addAll(arrayList);
        linkedList.removeFirst();
        linkedList.addLast("ブドウ");
        System.out.println("LinkedList: " + linkedList);

        System.out.println("\n=== Set（重複なしコレクション）===");
        
        // HashSet - 高速だが順序保証なし
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(4);
        hashSet.add(1); // 重複は追加されない
        hashSet.add(5);
        System.out.println("HashSet: " + hashSet);
        
        // TreeSet - ソート済み
        Set<Integer> treeSet = new TreeSet<>(hashSet);
        System.out.println("TreeSet: " + treeSet);

        System.out.println("\n=== Map（キー・バリューペア）===");
        
        // HashMap - 高速だが順序保証なし
        Map<String, Integer> fruitPrices = new HashMap<>();
        fruitPrices.put("リンゴ", 150);
        fruitPrices.put("バナナ", 100);
        fruitPrices.put("オレンジ", 200);
        fruitPrices.put("リンゴ", 180); // キーが同じなので値が更新される
        
        System.out.println("果物の価格:");
        for (Map.Entry<String, Integer> entry : fruitPrices.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue() + "円");
        }
        
        // TreeMap - キーでソート済み
        Map<String, Integer> sortedPrices = new TreeMap<>(fruitPrices);
        System.out.println("ソート済み価格: " + sortedPrices);

        System.out.println("\n=== コレクション操作の実践 ===");
        
        // 果物リストから重複除去してソート
        List<String> fruits = Arrays.asList("リンゴ", "バナナ", "リンゴ", "オレンジ", "バナナ", "イチゴ");
        System.out.println("元のリスト: " + fruits);
        
        Set<String> uniqueFruits = new TreeSet<>(fruits); // 重複除去＋ソート
        System.out.println("重複除去＋ソート: " + uniqueFruits);
        
        // リストの検索・フィルタリング
        List<String> longNameFruits = new ArrayList<>();
        for (String fruit : fruits) {
            if (fruit.length() >= 3) {
                longNameFruits.add(fruit);
            }
        }
        System.out.println("3文字以上の果物: " + longNameFruits);


    }
}
