package com.example.library.model;

public class Product{
    // 静的フィールド - 全商品で共有
    private static int nextId = 1;
    
    // インスタンスフィールド - 各商品固有
    private int id;
    private String name;
    private int price;
    
    // 静的初期化ブロック
    static {
        System.out.println("Productクラスが初期化されました");
    }
    
    // デフォルトコンストラクタ
    public Product() {
        this("商品名未設定", 0);
    }
    
    // 名前のみ指定するコンストラクタ
    public Product(String name) {
        this(name, 0);
    }
    
    // 全項目指定するコンストラクタ
    public Product(String name, int price) {
        this.id = nextId++;
        this.name = name;
        this.price = price;
    }
    
    // インスタンスメソッド - 商品情報表示
    public void displayInfo() {
        System.out.println("商品ID: " + id);
        System.out.println("商品名: " + name);
        System.out.println("価格: " + price + "円");
    }
    
    // 静的メソッド - 商品リストから合計金額を計算
    public static int calculateTotalPrice(Product[] products) {
        int total = 0;
        for (Product product : products) {
            total += product.price;
        }
        return total;
    }
    
    // getterメソッド
    public int getId() { return id; }
    public String getName() { return name; }
    public int getPrice() { return price; }
    
    // setterメソッド
    public void setName(String name) { this.name = name; }
    public void setPrice(int price) { this.price = price; }
    
    // テスト用メインメソッド
    public static void main(String[] args) {
        // 各コンストラクタのテスト
        Product p1 = new Product();
        Product p2 = new Product("ノートパソコン");
        Product p3 = new Product("スマートフォン", 80000);
        
        // 商品情報の表示
        System.out.println("--- 商品1 ---");
        p1.displayInfo();
        
        System.out.println("--- 商品2 ---");
        p2.displayInfo();
        
        System.out.println("--- 商品3 ---");
        p3.displayInfo();
        
        // 価格の変更
        p1.setPrice(50000);
        p1.setName("デスクトップPC");
        p2.setPrice(120000);
        
        System.out.println("\n--- 価格変更後 ---");
        System.out.println("--- 商品1 ---");
        p1.displayInfo();
        
        // 合計金額の計算
        Product[] productList = {p1, p2, p3};
        int totalPrice = Product.calculateTotalPrice(productList);
        System.out.println("\n合計金額: " + totalPrice + "円");
    }
}
