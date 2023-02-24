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
        eq(randomHossz());
    }
    
    private static void eq(int hossz) {
        String szin = blokkSzin();
        String visszaSzin = alapHatterSzin();
        
        blokkSorGeneralas(hossz, szin, visszaSzin);
        
        System.out.println();
    }
    
    private static void eq(boolean latszik) {
        String szin = blokkSzin();
        String visszaSzin = alapHatterSzin();
        
        int hossz = randomHossz();
        blokkSorGeneralas(hossz, szin, visszaSzin);
        blokkHosszLogikai(latszik, hossz);
        
        System.out.println();
    }

    private static void eq(int hossz, boolean latszik) {
        String szin = blokkSzin();
        String visszaSzin = alapHatterSzin();
        
        blokkSorGeneralas(hossz, szin, visszaSzin);
        blokkHosszLogikai(latszik, hossz);
        
        System.out.println();
    }

    private static void blokkHosszLogikai(boolean latszik, int hossz) {
        if (latszik == true) {
            System.out.print("(" + hossz + ")");
        }
    }

    private static void blokkSorGeneralas(int hossz, String szin, String visszaSzin) {
        for (int i = 0; i < hossz; i++) {
            System.out.print(szin + "*" + visszaSzin);
        }
    }
    
    private static String alapHatterSzin() {
        String visszaSzin = "\u001B[0m";
        return visszaSzin;
    }

    private static String blokkSzin() {
        String szin = "\u001B[45m";
        return szin;
    }
    
    private static int randomHossz() {
        int hossz = rnd.nextInt(3, 8);
        return hossz;
    }
  
}
