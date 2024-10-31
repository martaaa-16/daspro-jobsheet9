import java.util.Scanner;
public class CobaAnjay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] nilaiMhs = new int[5];
        int key = 78;
        int hasil = 0;

        System.out.println("Masukkan banyaknya nilai yang akan diinput: ");
        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
            for (int i = 1; i < nilaiMhs.length; i++) {
            if (key == nilaiMhs[i]) {
                hasil = i;
            }
            else {
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;
            }
            System.out.println("Masukkan nilai yang ingin dicari: " + key);
            System.out.println();
            System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
        }
    }
}