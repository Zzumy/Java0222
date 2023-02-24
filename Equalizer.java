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
        String alapSzin = "\u001B[0m";
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + " " + alapSzin);
        }
        System.out.println("");
    }
    
    private static void eq(boolean latszik) {
        String szin = "\u001B[45m";
        String alapSzin = "\u001B[0m";
        int hossz = rnd.nextInt(3, 8);
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + " " + alapSzin);
        }
        if (latszik == true) {
            System.out.print("(" + hossz + ")");
        }
        System.out.println("");
    }
    
    private static void eq(int hossz, boolean latszik) {
        String szin = "\u001B[45m";
        String alapSzin = "\u001B[0m";
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + " " + alapSzin);
        }
        if (latszik == true) {
            System.out.print("(" + hossz + ")");
        }
        System.out.println("");
    }
    
}
