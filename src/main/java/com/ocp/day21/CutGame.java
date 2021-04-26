package com.ocp.day21;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
請撰寫一支程式, 需由鍵盤輸入一個整數, 用來表示繩子的長度(單位:公尺)
如果每天各減去一半的長度要花費幾天的時間長度會短於5公尺
繩子長度有1000與99這二條
*/
public class CutGame {
    public static void main(String[] args) {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("請輸入繩子的長度: ");
        int rope = 0;
        try {
            rope = sc.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("長度錯誤請從新輸入, " + e);
            main(args);
        }        
        if(rope > 0) {
            while (rope >= 5) { 
                count++;
                rope /= 2;
            }
            System.out.println("count: " + count);
        }
        
        
    }
}
