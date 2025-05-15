package com.example.library.model;

import java.util.ArrayList;

public class Main {
	public static void main(String[] args) {
		// 新しいBookオブジェクトを作成
//		Book myBook = new Book("Java入門", "田中太郎");
//		System.out.println("myBook のタイトル: " + myBook.getTitle());
//
//		// 参照をコピー
//		Book yourBook = myBook;
//		System.out.println("yourBook のタイトル: " + yourBook.getTitle());
//
//		// yourBookを通じてオブジェクトを変更
//		yourBook.setTitle("Java完全攻略");
//
//		// 両方の変数を通じて変更が見える
//		System.out.println("変更後のmyBook のタイトル: " + myBook.getTitle());
//		System.out.println("変更後のyourBook のタイトル: " + yourBook.getTitle());
//
//		// 変数の比較
//		System.out.println("myBook == yourBook: " + (myBook == yourBook));
		
//	     ArrayList<String> members = new ArrayList<>();
//        members.add("kirishima");
//        members.add("midorikawa");
//        members.add("rokumura");
//        
//        // 以下にコードを追加
//        // 以下にコードを追加
//        System.out.print(""+members.get(1));
//        
//        members.clear();
//        
//        
//        
//        System.out.println(members);
//        System.out.println(members.size());
//        System.out.println(members.contains("rokumura"));
        
        
		
		
		ArrayList<String> original = new ArrayList<>();
		original.add("apple");
		original.add("banana");

		// 空のリストを作成し、addAll()で全要素をコピー
		ArrayList<String> copy = new ArrayList<>();
		copy.addAll(original);
		copy.add("cherry");

		System.out.println(original);  // [apple, banana]
		System.out.println(copy);      // [apple, banana, cherry]
		
		
		
        // String での連結
        long startTime1 = System.currentTimeMillis();
        String str1 = "";
        for (int i = 0; i < 100000; i++) {
            str1 += "a";
        }
        long endTime1 = System.currentTimeMillis();
        System.out.println("String連結の実行時間: " + (endTime1 - startTime1) + "ミリ秒");
        
        // StringBuilder での連結
//        long startTime2 = System.currentTimeMillis();
//        StringBuilder sb = new StringBuilder();
//        for (int i = 0; i < 100000; i++) {
//            sb.append("a");
//        }
//        String str2 = sb.toString();
//        long endTime2 = System.currentTimeMillis();
//        System.out.println("StringBuilder連結の実行時間: " + (endTime2 - startTime2) + "ミリ秒");
//        
        // 問題1のテスト
        System.out.println("===== 問題1: 文字列の反転 =====");
        String test1 = "Hello, World!";
        System.out.println("入力: " + test1);
        
        //
        // 時間計測（StringBuilder版）
        long startTime2 = System.currentTimeMillis();
        String result1b = reverseWithStringBuilder(test1);
        long endTime2 = System.currentTimeMillis();
        System.out.println("StringBuilder版の結果: " + result1b);
        System.out.println("StringBuilder版の処理時間: " + (endTime2 - startTime2) + "ms");
        
        // 問題2のテスト
        System.out.println("\n===== 問題2: 文字カウント =====");
        String test2 = "Hello, World!";
        char target = 'l';
        System.out.println("入力文字列: " + test2);
        System.out.println("カウント対象: " + target);
        System.out.println("結果: " + countChar(test2, target));
        
        // 問題3のテスト
        System.out.println("\n===== 問題3: 母音の削除 =====");
        String test3 = "The quick brown fox jumps over the lazy dog";
        System.out.println("入力: " + test3);
        
        // 時間計測（String版）
        startTime1 = System.currentTimeMillis();
        String result3a = removeVowelsWithString(test3);
        endTime1 = System.currentTimeMillis();
        System.out.println("String版の結果: " + result3a);
        System.out.println("String版の処理時間: " + (endTime1 - startTime1) + "ms");
        
        // 時間計測（StringBuilder版）
        startTime2 = System.currentTimeMillis();
        String result3b = removeVowelsWithStringBuilder(test3);
        endTime2 = System.currentTimeMillis();
        System.out.println("StringBuilder版の結果: " + result3b);
        System.out.println("StringBuilder版の処理時間: " + (endTime2 - startTime2) + "ms");
        
        // 問題4のテスト
        System.out.println("\n===== 問題4: 回文チェック =====");
        String[] palindromeTests = {
            "level",
            "A man, a plan, a canal: Panama",
            "race car",
            "hello world"
        };
        
        for (String test : palindromeTests) {
            System.out.println("'" + test + "' は回文か？ " + isPalindrome(test));
        }
        
        // 問題5のテスト
        System.out.println("\n===== 問題5: 単語の逆順 =====");
        String test5 = "The quick brown fox jumps over the lazy dog";
        System.out.println("入力: " + test5);
        System.out.println("結果: " + reverseWords(test5));
        
	}

	
	// 問題1: 文字列の反転（String のメソッドのみ）
    public static String reverseWithString(String input) {
        String reversed = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i); // 非効率（Stringの連結）
        }
        return reversed;
    }

    // 問題1: 文字列の反転（StringBuilder）
    public static String reverseWithStringBuilder(String input) {
        return new StringBuilder(input).reverse().toString(); // 効率的
    }

    // 問題2: 特定の文字のカウント
    public static int countChar(String str, char target) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    // 問題3: 母音の削除（String のみ）
    public static String removeVowelsWithString(String input) {
        String result = "";
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!"aeiouAEIOU".contains(String.valueOf(c))) {
                result += c; // 文字列連結
            }
        }
        return result;
    }

    // 問題3: 母音の削除（StringBuilder）
    public static String removeVowelsWithStringBuilder(String input) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (!"aeiouAEIOU".contains(String.valueOf(c))) {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    // 問題4: 回文チェック（空白・大文字小文字を無視）
    public static boolean isPalindrome(String input) {
        String cleaned = input.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleaned).reverse().toString();
        return cleaned.equals(reversed);
    }

    // 問題5: 単語の逆順
    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i != 0) {
                sb.append(" ");
            }
        }
        return sb.toString();
    }

}



class Book {
	private String title;
	private String author;

	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
}
