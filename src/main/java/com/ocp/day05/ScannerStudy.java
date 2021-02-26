package com.ocp.day05;
import java.util.Scanner;

public class ScannerStudy {
    public static void main(String[] args) {
        Scanner sc = new Scanner("170.0 60 小明的資料 明天 228 放假");
        double h = sc.nextDouble();
        int w = sc.nextInt();
        String s = sc.nextLine(); //sc.next();
        System.out.println(h);
        System.out.println(w);
        System.out.println(s);
        System.out.println("請輸入任意字串...");
        //Scanner sc2 = new Scanner(System.in);
        //String any = new Scanner(System.in).nextLine();
        //System.out.printf("您所輸入的是: %s\n", any);
        System.out.printf("您所輸入的是: %s\n", new Scanner(System.in).nextLine());
    }
}
