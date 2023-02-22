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
        String s = String.format("Az első 10 szám összege: " + osszeg);
        kiir(s);
    }

    private static void masodikFeladat() {
        int a = 3, b = 6;
        int osszeg = osszeg(a, b);
        String s = String.format("%d + %d = %d", a, b, osszeg);
        kiir(s);
    }

    private static void harmadikFeladat() {
        int a = 3, b = 6, c = 4, d = 8;
        int osszeg = osszeg(a, osszeg(b, osszeg(c, d)));
        String s = String.format("%d + %d + %d + %d = %d", a, b, c, d, osszeg);
        kiir(s);
    }

    private static void negyedikFeladat() {
        int a = 3, b = 6, c = 4;
        double gyok = Math.sqrt(osszeg(a, osszeg(b, c)));
        String s = String.format("gyök(%d + %d + %d) = %.0f", a, b, c, gyok);
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
