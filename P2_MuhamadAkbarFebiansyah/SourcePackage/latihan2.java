package P2_MuhamadAkbarFebiansyah.SourcePackage;
import java.util.Scanner;

public class latihan2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nama, alamat, jurusan;
        int usia;
        double tinggi;

        System.out.print("Input nama : ");
        nama = input.nextLine();

        System.out.print("Input usia : ");
        usia = input.nextInt();

        System.out.println("Input alamat : ");
        alamat = input.nextLine();

        System.out.print("Input jurusan : ");
        jurusan = input.nextLine();

        System.out.print("Input tinggi badan : ");
        tinggi = input.nextDouble();

        System.out.println("\n===== DATA ANDA =====");
        System.out.println("Nama           : " + nama);
        System.out.println("Usia           : " + usia + " tahun");
        System.out.println("Alamat         : " + alamat);
        System.out.println("Jurusan        : " + jurusan);
        System.out.println("Tinggi Badan   : " + tinggi + " cm");
    }
}
