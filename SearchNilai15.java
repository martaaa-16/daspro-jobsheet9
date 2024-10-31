import java.util.Scanner;
public class SearchNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlMhs = 0;
        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        jmlMhs = sc.nextInt();
        int[] nilaiMhs = new int[jmlMhs];
        int key = 85, hasil = 0;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
            for (int i = 1; i < nilaiMhs.length; i++) {
                System.out.println("Masukkan nilai yang ingin dicari: " + key);
            if (key == nilaiMhs[i]) {
                System.out.println();
                System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
                hasil = i;
            } else {
                System.out.println();
                System.out.println("Nilai yang dicari tidak ditemukan");
                break;
            }
        }
    }
}