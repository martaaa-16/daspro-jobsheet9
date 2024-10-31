import java.util.Scanner;

public class CobaAja {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[10];
        double total = 0, rata2;
        int jmlLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
            if (nilaiMhs[i]> 70) {
                System.out.println("Mahasiswa ke-" + (i+1) + " lulus!");
                jmlLulus++;
            }
        }
        System.out.println("Masukkan banyak mahasiswa yang lulus: " + jmlLulus);
    }
}