package P7_MuhamadAkbarFebiansyah.SourcePackage;
import java.util.Scanner;

public class latihan1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kehadiran : ");
        int hadir = input.nextInt();

        System.out.print("Masukkan nilai akhir : ");
        double nilai = input.nextDouble();

        String grade;
        if (nilai >= 80) {
            grade = "A";
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60) {
            grade = "C";
        } else if (nilai >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        double kehadiran = 21 * (75.0 /100.0);

        if (hadir >= kehadiran) {
            System.err.println("Nilai : " + nilai);
            System.out.println("Grade : " + grade);
        } else {
            if (nilai >= 55) {
                System.out.println("Nilai : 55");
                System.out.println("Grade : D");
            } else {
                System.out.println("Nilai : " + nilai);
                System.out.println("Grade : E");
            }
        }
    }    
}
