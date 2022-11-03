// Lakukan penggeseran kiri sejauh 2 bit terhadap suatu nilai bertipe byte dan berikan program untuk membuktikannya 
public class GeserKiri {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2);

        System.out.println("Nilai awal dari a: " + a);
        System.out.println("i dan b: " + i + " " + b);

    }

}
