// Probelem : Tunjukkan suatu program yang membuktikan bahwa penggeseran bit ke kiri bisa dijadikan cara alternatif dalam mengalikan dengan dua
public class PerkalianDua {
    public static void main(String[] args) {
        int i;
        int angka = 0xFFFFFFE;

        for (i = 0; i < 4; i++) {
            angka = angka << 1;
            System.out.println(angka);
        }

    }

}
