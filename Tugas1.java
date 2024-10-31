import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] nilaiMhs = new int[5];
        double tertinggi = 0, terendah = 100;
        float totalNilai=0, rataNilai;

        for (int i = 1; i <= 5; i++) {
            i = 1;
            while (i <= 3) {
                totalNilai = 0;
                System.out.println("Input nilai mahasiswa ke-" + i);
                for (int j = 1; j <= 5; j++) {
                    System.out.print("Nilai ke-" + j + " = ");
                    nilaiMhs[i] = sc.nextInt();
                    totalNilai += nilaiMhs[i];
                }
                rataNilai = totalNilai/5;
                i++;
                System.out.println("Rata-rata nilai mahasiswa ke-" + i + " adalah " + rataNilai);
            if (rataNilai > tertinggi) {
                tertinggi = rataNilai;
            }
            if (rataNilai < terendah) {
                terendah = rataNilai;
            }
        }
        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah); 
        }
    }
}