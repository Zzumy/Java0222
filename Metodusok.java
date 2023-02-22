package metodusok;

public class Metodusok {
    
    public static void main(String[] args) {
        feladatok();
    }
    
    private static void feladatok() {
        elsoFeladat();
        masodikFeladat();
        harmadikFeladat();
    }

    private static void elsoFeladat() {
        int osszeg = Elso10SzamOsszege();
        String s = String.format("Az első 10 szám összege: " + osszeg);
        kiir(s);
    }

    private static void masodikFeladat() {
        int a = 3, b = 6;
        int osszeg = ketSzamOsszeg(a, b);
        String s = String.format("%d + %d = %d", a, b, osszeg);
        kiir(s);
    }
    
    private static void harmadikFeladat() {
        int a = 3, b = 6, c = 7, d = 9;
        int osszeg = negySzamOsszeg(a, b, c, d);
        String s = String.format("%d + %d + %d + %d = %d", a, b, c, d, osszeg);
        kiir(s);
    }

    private static int Elso10SzamOsszege() {
        int osszeg = 0;
        for (int i = 0; i < 10; i++) {
            osszeg += 1;
        }
        return osszeg;
    }
    
//    még nincs meg a 4. feladat
    
    private static int negySzamOsszeg(int a, int b, int c, int d) {
        return a+b+c+d;
    }
    
    private static int ketSzamOsszeg(int a, int b) {
        return a+b;
    }
    
    private static void kiir(String str){
        System.out.println(str);
    }
    
}
