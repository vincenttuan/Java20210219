package com.ocp.day08;

public class BuyBook {
    public static void main(String[] args) {
        // 取得出版社名 ?
        System.out.println(Book.getPublich());
        Book b = new Book(100);
        System.out.println(b.getPages());
        System.out.println(new Book(200).getPages());
    }
}
