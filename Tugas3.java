import  java.util.Scanner;
public class Tugas3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String[] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};

        System.out.print("Masukkan nama menu yang ingin dicari: ");
        String menuDicari = sc.nextLine();

        boolean menuKetemu = false;
        
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equalsIgnoreCase(menuDicari)) {
                menuKetemu = true;
                break;
            }
        }
        
        if (menuKetemu) {
            System.out.print("Menu " + menuDicari + " terdapat dalam daftar menu.");
        } else {
            System.out.print("Maaf, menu " + menuDicari + " tidak terdaftar dalam daftar menu kami.");
        }
    }
}