import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int jmlMhs = sc.nextInt();
        
        int[] nilaiMhs = new int[jmlMhs];
        
        System.out.print("Masukkan nilai mahasiswa ke-1: ");
        nilaiMhs[0] = sc.nextInt();
        int tertinggi = nilaiMhs[0], terendah = nilaiMhs[0], totalNilai = nilaiMhs[0];

        for (int i = 1; i < jmlMhs; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i + 1) + ": ");
            nilaiMhs[i] = sc.nextInt();
            totalNilai += nilaiMhs[i];
            if (nilaiMhs[i] > tertinggi) {
                tertinggi = nilaiMhs[i];
            }
            if (nilaiMhs[i] < terendah) {
                terendah = nilaiMhs[i];
            }
        }

        double rata2 = (double) totalNilai + jmlMhs;

        System.out.println("Daftar nilai mahasiswa: ");

        for (int i = 0; i < jmlMhs; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i + 1) + ": " + nilaiMhs[i]);
        }

        System.out.println("Nilai mahasiswa yang tertinggi: " + tertinggi);
        System.out.println("Nilai mahasiswa yang terendah: " + terendah); 
        System.out.println("Rata-rata nilai mahasiswa: " + rata2);       
    }
}