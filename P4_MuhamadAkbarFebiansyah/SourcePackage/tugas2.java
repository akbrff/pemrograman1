package P4_MuhamadAkbarFebiansyah.SourcePackage;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String namaBarang;
        double harga;
        int jumlah;
        double total;

        System.out.print("Masukkan nama barang : ");
        namaBarang = input.nextLine();

        System.out.print("Masukkan harga : ");
        harga = input.nextDouble();

        System.out.print("Masukkan jumlah beli : ");
        jumlah = input.nextInt();

        total = harga * jumlah;

        System.out.println("\n=== STRUK PEMBELIAN ===");
        System.out.println("Nama Barang : " + namaBarang);
        System.out.println("Harga : " + harga);
        System.out.println("Jumlah : " + jumlah);
        System.out.println("Total Bayar : " + total);
    }
    
}
