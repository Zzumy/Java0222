package metodusok;

public class Metodusok {
    
    public static void main(String[] args) {
        feladatok();
    }
    
    private static void feladatok() {
        elsoFeladat();
        masodikFeladat();
        harmadikFeladat();
        negyedikFeladat();
    }

    private static void elsoFeladat() {
        int osszeg = Elso10SzamOsszege();
        String t = String.format("I. Feladat:");
        String s = String.format("Az első 10 szám összege: " + osszeg + "\n");
        kiir(t);
        kiir(s);
    }

    private static void masodikFeladat() {
        int a = 3, b = 6;
        int osszeg = osszeg(a, b);
        String t = String.format("II. Feladat:");
        String s = String.format("%d + %d = %d\n", a, b, osszeg);
        kiir(t);
        kiir(s);
    }

    private static void harmadikFeladat() {
        int a = 3, b = 6, c = 4, d = 8;
        int osszeg = osszeg(a, osszeg(b, osszeg(c, d)));
        String t = String.format("III. Feladat:");
        String s = String.format("%d + %d + %d + %d = %d\n", a, b, c, d, osszeg);
        kiir(t);
        kiir(s);
    }

    private static void negyedikFeladat() {
        int a = 3, b = 6, c = 4;
        double gyok = Math.sqrt(osszeg(a, osszeg(b, c)));
        String t = String.format("IV. Feladat:");
        String s = String.format("gyök(%d + %d + %d) = %.0f\n", a, b, c, gyok);
        kiir(t);
        kiir(s);
    }

    private static int Elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 1;
        }
        return osszeg;
    }

    private static int osszeg(int a, int b) {
        return a+b;
    }
    
    private static void kiir(String str){
        System.out.println(str);
    }
    
}
