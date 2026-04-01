package P2_MuhamadAkbarFebiansyah.SourcePackage;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nama;
        int usia;
        System.out.print("Input nama: ");
        nama=input.nextLine();
        System.out.print("usia :");
        usia=input.nextInt();
        System.out.println("Nama anda: " + nama);
        System.out.println("Usia anda: " + usia + "tahun");
    }
}