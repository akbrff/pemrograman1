package P8_MuhamadAkbarFebiansyah.SourcePackage;

import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char pilihan;

        do{
            System.out.print("Masukkan nama mahasiswa: ");
            String nama = input.nextLine();

            System.out.print("Masukkan nilai mahasiswa: ");
            int nilai = input.nextInt();
            input.nextLine();

            System.out.println("Nama: " + nama);
            System.out.println("Nilai: " + nilai);

            System.out.print("Ingin input lagi? (y/t): ");
            pilihan = input.next().charAt(0);
            input.nextLine();

        } while (pilihan == 'y' || pilihan == 'Y');

        System.out.println("Program selesai");
    }
}
