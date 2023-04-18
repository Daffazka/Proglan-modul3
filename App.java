import java.util.Scanner;

public class App {
    static int a, b, c;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        balok result = new balok();

        System.out.print("Masukkan Panjang : "); a = input.nextInt();
        result.setPanjang(a);

        System.out.print("Masukkan Lebar   : "); b = input.nextInt();
        result.setLebar(b);

        System.out.print("Masukkan Tinggi  : "); c = input.nextInt();
        result.setTinggi(c);
        result.Hasil();

    }
}
