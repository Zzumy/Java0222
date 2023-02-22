package metodusok;

public class Metodusok {
    
    public static void main(String[] args) {
        feladatok();
    }
    
    private static void feladatok() {
        elsoFeladat();
        masodikFeladat();
    }

    private static void elsoFeladat() {
        int osszeg = ElsoSzamOsszege();
        String s = String.format("Az első 10 szám összege: " + osszeg);
        kiir(s);
    }

    private static void masodikFeladat() {
        int a = 3, b = 6;
        int osszeg = osszeg(a, b);
        String s = String.format("%d + %d = %d\n", a, b, osszeg);
        kiir(s);
    }

    private static int ElsoSzamOsszege() {
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
