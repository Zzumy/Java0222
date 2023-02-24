package metodusok;

import java.util.Random;

public class Equalizer {
    
    public static Random rnd = new Random();
    
    public static void main(String[] args) {
        eq_5_sor();
    }
    
    private static void eq_5_sor() {
        eq();
        eq(8, true);
        eq(12);
        eq(true);
        eq(false);
    }
    
    private static void eq() {
        int db = rnd.nextInt(3, 8);
        eq(db);
    }
    
    private static void eq(int hossz) {
        String szin = "\u001B[45m";
        for (int i = 0; i < hossz; i++) {
            String s = String.format(szin + " ");
            kiir(s);
        }
        System.out.println("");
    }
    
    private static void eq(boolean hosszKiir) {
        String szin = "\u001B[45m";
        
        System.out.println("");
    }
    
    private static void eq(int hossz, boolean hosszKiir) {
        String szin = "\u001B[45m";
        for (int i = 0; i < hossz; i++) {
            String s = String.format(szin + " " + "(" + hosszKiir + ")");
            kiir(s);
        }
        System.out.println("");
    }
    
//    MÉG NINCS KÉSZ ÉS HIBÁS
    
    private static void kiir(String str){
        System.out.print(str);
    }
}
