import java.util.Scanner;

public class ArrayRataNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jmlMhs = 0;
        System.out.print("Masukkan jumlah mahasiswa: ");
        jmlMhs = sc.nextInt();

        int[] nilaiMhs = new int[jmlMhs];
        double total = 0, rata2, rata2Lulus = 0, rata2TdkLulus = 0;
        double jmlLulus = 0, jmlTdkLulus = 0;
        double lulus = 0, tdkLulus = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            if (nilaiMhs[i] > 70) {
                lulus += nilaiMhs[i];
                jmlLulus++;
            }
            else {
                tdkLulus += nilaiMhs[i];
                jmlTdkLulus++;
            }
        }
        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];
        }
        rata2 = total/jmlLulus;
        rata2Lulus = lulus/jmlLulus;
        System.out.println("Rata-rata nilai lulus: " + rata2Lulus);
        rata2TdkLulus = tdkLulus/jmlTdkLulus;
        System.out.println("Rata-rata nilai tidak lulus: " + rata2TdkLulus);
    }
}