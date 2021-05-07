package com.lab.barbar;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class BingoThread extends Thread {
    private JLabel label;
    private static ImageIcon[] icons;
    public static boolean play;
    public BingoThread(JLabel label, ImageIcon[] icons) {
        this.label = label;
        this.icons = icons;
    }
    public void run() {
        Random r = new Random();
        while (play) {            
            int n = r.nextInt(icons.length);
            label.setIcon(icons[n]);
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
        }
    }
    
}
