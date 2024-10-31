import java.util.Scanner;
public class SearchNilai15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jmlMhs = 0;
        int[] nilaiMhs = new int[jmlMhs];
        int key = 78;
        int hasil = 0;

        System.out.print("Masukkan banyaknya nilai yang akan diinput: ");
        int banyak = sc.nextInt();

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i+1) + " : ");
            nilaiMhs[i] = sc.nextInt();
        }
            for (int i = 1; i < nilaiMhs.length; i++) {
                if (key == nilaiMhs[i]) {
                    hasil = i;
                }
        }
        System.out.println("Masukkan nilai yang ingin dicari: " + key);
        System.out.println();
        System.out.println("Nilai " + key + " ketemu, merupakan nilai mahasiswa ke-" + hasil);
    }
}