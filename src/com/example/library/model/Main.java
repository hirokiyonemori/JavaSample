package com.example.library.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;



public class Main {


  public static void main(String[] args) {



    // 新しいBookオブジェクトを作成
    // Book myBook = new Book("Java入門", "田中太郎");
    // System.out.println("myBook のタイトル: " + myBook.getTitle());
    //
    // // 参照をコピー
    // Book yourBook = myBook;
    // System.out.println("yourBook のタイトル: " + yourBook.getTitle());
    //
    // // yourBookを通じてオブジェクトを変更
    // yourBook.setTitle("Java完全攻略");
    //
    // // 両方の変数を通じて変更が見える
    // System.out.println("変更後のmyBook のタイトル: " + myBook.getTitle());
    // System.out.println("変更後のyourBook のタイトル: " + yourBook.getTitle());
    //
    // // 変数の比較
    // System.out.println("myBook == yourBook: " + (myBook == yourBook));

    // ArrayList<String> members = new ArrayList<>();
    // members.add("kirishima");
    // members.add("midorikawa");
    // members.add("rokumura");
    //
    // // 以下にコードを追加
    // // 以下にコードを追加
    // System.out.print(""+members.get(1));
    //
    // members.clear();
    //
    //
    //
    // System.out.println(members);
    // System.out.println(members.size());
    // System.out.println(members.contains("rokumura"));



    ArrayList<String> original = new ArrayList<>();
    original.add("apple");
    original.add("banana");

    // 空のリストを作成し、addAll()で全要素をコピー
    ArrayList<String> copy = new ArrayList<>();
    copy.addAll(original);
    copy.add("cherry");

    System.out.println(original); // [apple, banana]
    System.out.println(copy); // [apple, banana, cherry]



    // String での連結
    // long startTime1 = System.currentTimeMillis();
    // String str1 = "";
    // for (int i = 0; i < 100000; i++) {
    // str1 += "a";
    // }
    // long endTime1 = System.currentTimeMillis();
    // System.out.println("String連結の実行時間: " + (endTime1 - startTime1) + "ミリ秒");

    // StringBuilder での連結
    // long startTime2 = System.currentTimeMillis();
    // StringBuilder sb = new StringBuilder();
    // for (int i = 0; i < 100000; i++) {
    // sb.append("a");
    // }
    // String str2 = sb.toString();
    // long endTime2 = System.currentTimeMillis();
    // System.out.println("StringBuilder連結の実行時間: " + (endTime2 - startTime2) + "ミリ秒");
    //


    String input = "Hello";
    String reversed = reverseWithStringBuilder(input);
    System.out.println("StringBuilder使用: " + reversed); // 出力: olleH

    LinkedList<String> list = new LinkedList<Integer>();
    list.add("apple");
    System.out.println(list.get(0));
    list.addFirst("Banana");
    for (String string : list) {
      System.out.println(string);
    }
    System.out.println(list);
    list.removeLast();
    System.out.println(list);
    HashMap<String, Integer> Map = new HashMap<String, Integer>();



  }

  static int count = 0;

  static void display() {
    System.out.print(" count " + count);
  }

  public static String reverseWithStringBuilder(String input) {
    StringBuilder sb = new StringBuilder(input);
    sb.reverse(); // 逆順にするメソッド
    return sb.toString();
  }

}


class AppConfig {
  // APP_NAMEとVERSIONを定義
  // 定数は大文字とアンダースコアで表記するのが慣例
  public static final String APP_NAME = "MyApp";
  public static final String VERSION = "1.0";

  public static void main(String[] args) {
    // 出力: アプリ名: MyApp / バージョン: 1.0
    System.out.println("アプリ名: " + APP_NAME + " / バージョン: " + VERSION);
  }
}


class TestResult {
  // static 変数 totalScore, studentCount を定義
  private static int totalScore = 0;
  private static int studentCount = 0;

  // コンストラクタ：個々の点数を受け取り、合計点と人数を更新
  public TestResult(int score) {
    // 合計点と人数を更新
    totalScore += score;
    studentCount++;
  }

  // 平均点を計算して返すstatic メソッド
  public static double average() {
    // 平均点を返す
    // 0除算を防ぐためにチェックを追加
    if (studentCount == 0) {
      return 0;
    }
    return (double) totalScore / studentCount;
  }

  public static void main(String[] args) {
    // テストデータの追加
    new TestResult(80);
    new TestResult(90);
    new TestResult(70);

    // 平均点を表示
    System.out.println("平均点：" + average());
  }
}


class MathUtil {
  // static メソッド add を定義
  public static int add(int a, int b) {
    return a + b;
  }

  public static void main(String[] args) {
    // メソッド呼び出しと出力
    int result1 = add(5, 3);
    System.out.println("5 + 3 = " + result1);

    int result2 = add(10, 20);
    System.out.println("10 + 20 = " + result2);
  }
}


class Student {
  // インスタンス数を数える static 変数
  private static int count = 0;

  // 名前フィールド（オプション）
  private String name;

  // コンストラクタ
  public Student(String name) {
    this.name = name;
    // インスタンス生成時にカウントをインクリメント
    count++;
  }

  // クラスメソッド：現在のインスタンス数を表示
  public static void showCount() {
    System.out.println("作られた人数：" + count);
  }

  // デフォルトコンストラクタ
  public Student() {
    // デフォルトコンストラクタでもカウントをインクリメント
    count++;
  }

  public static void main(String[] args) {
    // テスト
    Student student1 = new Student("田中");
    Student student2 = new Student("佐藤");
    Student student3 = new Student();

    // 現在のインスタンス数を表示
    showCount();
  }
}
