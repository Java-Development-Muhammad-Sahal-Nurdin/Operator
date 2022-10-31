// Problem tunjukkan sebuah program sederhana yang mnedemonstrasikan operator-operator aritmatik.
// Program tersebut juga perli mengilustrasikan perbedaan antara pembagian titik mengambang dan pembagian integer

public class MatDasar {
    public static void main(String[] args) {
        // Aritmatik menggunakan ineteger
        System.out.println("Aritmatik Integer Arithmatic");
        int a = 1 + 1;
        int b = a * 3;
        int c = b / 4;
        int d = c - a;
        int e = -d;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("e = " + e);

        // aritmatik menggunakan double
        System.out.println("\nAritmatik Titik Mengambang:");
        double da = 1 + 1;
        double db = da * 3;
        double dc = db / 4;
        double dd = dc - da;
        double de = -dd;

        System.out.println("da = " + da);
        System.out.println("db = " + db);
        System.out.println("dc = " + dc);
        System.out.println("dd = " + dd);
        System.out.println("de = " + de);

    }

}
