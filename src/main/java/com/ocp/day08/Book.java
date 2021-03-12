package com.ocp.day08;

public class Book {
    private int pages;
    public Book(int pages) {
        this.pages = pages;
    }
    // 物件成員
    public int getPages() {
        return pages;
    }
    // 類別成員
    public static String getPublich() {
        return "碁鋒資訊";
    }
}
