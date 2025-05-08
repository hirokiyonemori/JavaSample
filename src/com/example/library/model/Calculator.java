package com.example.library.model;

public class Calculator {
    // 加算
    public int add(int a, int b) {
        return a + b;
    }
    
    // 減算
    public int subtract(int a, int b) {
        return a - b;
    }
    
    // 乗算
    public int multiply(int a, int b) {
        return a * b;
    }
    
    // 除算
    public double divide(int a, int b) {
        if (b == 0) {
            System.out.println("0で割ることはできません");
            return 0;
        }
        return (double) a / b;
    }
    
    // 計算履歴を保存
    private String[] history = new String[10];
    private int historyIndex = 0;
    
    // 計算を履歴に記録
    public void saveToHistory(String calculation) {
        if (historyIndex < 10) {
            history[historyIndex] = calculation;
            historyIndex++;
        } else {
            // 配列がいっぱいになったら、最初から上書き
            for (int i = 0; i < 9; i++) {
                history[i] = history[i + 1];
            }
            history[9] = calculation;
        }
    }
    
    // 履歴表示
    public void printHistory() {
        System.out.println("計算履歴：");
        for (int i = 0; i < historyIndex; i++) {
            System.out.println(history[i]);
        }
    }
    
    // メイン実行メソッド
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        
        // テスト計算
        int resultAdd = calc.add(5, 3);
        calc.saveToHistory("5 + 3 = " + resultAdd);
        
        int resultSub = calc.subtract(10, 4);
        calc.saveToHistory("10 - 4 = " + resultSub);
        
        int resultMul = calc.multiply(6, 7);
        calc.saveToHistory("6 * 7 = " + resultMul);
        
        double resultDiv = calc.divide(20, 4);
        calc.saveToHistory("20 / 4 = " + resultDiv);
        
        // 履歴表示
        calc.printHistory();
    }
}
