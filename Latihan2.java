import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input
        System.out.print("Masukkan nama: ");
        String nama = input.nextLine();

        // Proses (ubah ke huruf besar)
        String hasil = nama.toUpperCase();

        // Output
        System.out.println("Hasil: " + hasil);

        input.close();
    }
}