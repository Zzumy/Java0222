package metodusok;

import java.util.Random;

public class Equalizer {
    
    public static Random rnd = new Random();
    
    public static void main(String[] args) {
        eq_5_sor();
    }
    
    private static void eq_5_sor() {
        eq();
        eq(12);
        eq();
        eq(8);
        eq();
    }
    
    private static void eq() {
        int db = rnd.nextInt(3, 8);
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            String s = String.format(szin + " ");
            kiir(s);
        }
        System.out.println("");
    }
    
    private static void eq(int hossz) {
        int db = hossz;
        String szin = "\u001B[45m";
        for (int i = 0; i < db; i++) {
            String s = String.format(szin + " ");
            kiir(s);
        }
        System.out.println("");
    }
    
    private static void kiir(String str){
        System.out.println(str);
    }
}
