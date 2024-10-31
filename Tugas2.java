import java.util.Scanner;
public class Tugas2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah pesanan: ");
        int jmlPesanan = sc.nextInt();
        sc.nextLine();

        String[] namaPesanan = new String[jmlPesanan];
        double[] hargaPesanan = new double[jmlPesanan];
        
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.print("Masukkan nama makanan/minuman untuk pesanan " + (i + 1) + ": ");
            namaPesanan[i] = sc.nextLine();

            System.out.print("Masukkan harga untuk " + namaPesanan[i] + ": ");
            hargaPesanan[i] = sc.nextDouble();
            sc.nextLine();
        }
        double totalBiaya = 0;
        for (double harga : hargaPesanan) {
            totalBiaya += harga;
        }

        System.out.println("Daftar pesanan: ");
        for (int i = 0; i < jmlPesanan; i++) {
            System.out.println((i + 1) + ". " + namaPesanan[i] + " - Rp " + hargaPesanan[i]);
        }
        System.out.println("Total biaya: Rp " + totalBiaya);
    }
}