package P7_MuhamadAkbarFebiansyah.SourcePackage;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int totalPertemuan, hadir;
        double presensi, tugas, uts, uas, total;

        System.out.print("Masukan jumlah pertemuan : ");
        totalPertemuan = input.nextInt();

        System.out.print("Masukan jumlah kehadiran : ");
        hadir = input.nextInt();

        presensi = ((double) hadir/ totalPertemuan) * 100;

        System.out.print("Masukan nilai tugas : ");
        tugas = input.nextDouble();

        System.out.print("Masukan nilai UTS : ");
        uts = input.nextDouble();

        System.out.print("Masukan nilai UAS : ");
        uas = input.nextDouble();

        total = (0.10 * presensi) + (0.20 * tugas) + (0.30 * uts) + (0.40 * uas);

        String grade;
        if (total >= 80) {
            grade = "A";
        } else if (total >= 70) {
            grade = "B";
        } else if (total >= 60) {
            grade = "C";
        } else if (total >= 55) {
            grade = "D";
        } else {
            grade = "E";
        }

        double minimalKehadiran = 75.0;

        System.out.println("Presensi : " + presensi + "%");
        System.out.println("Nilai total : " + total);
        System.out.println("Grade : " + grade);

    }

}
