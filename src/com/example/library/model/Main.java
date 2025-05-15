package com.example.library.model;

public class Main {
	 public static void main(String[] args) {
        // 新しいBookオブジェクトを作成
        Book myBook = new Book("Java入門", "田中太郎");
        System.out.println("myBook のタイトル: " + myBook.getTitle());
        
        // 参照をコピー
        Book yourBook = myBook;
        System.out.println("yourBook のタイトル: " + yourBook.getTitle());
        
        // yourBookを通じてオブジェクトを変更
        yourBook.setTitle("Java完全攻略");
        
        // 両方の変数を通じて変更が見える
        System.out.println("変更後のmyBook のタイトル: " + myBook.getTitle());
        System.out.println("変更後のyourBook のタイトル: " + yourBook.getTitle());
        
        // 変数の比較
        System.out.println("myBook == yourBook: " + (myBook == yourBook));
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
