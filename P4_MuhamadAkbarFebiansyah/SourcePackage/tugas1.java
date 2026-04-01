package P4_MuhamadAkbarFebiansyah.SourcePackage;
import java.util.Scanner;

public class tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double[] makan = new double[7];
        double[] transport = new double[7];
        double[] belanja = new double[7];

        double totalMakan = 0, totalTransport = 0, totalBelanja = 0;

        for (int i = 0; i < 7; i++) {
            System.out.println("\nHari ke " + (i+1));

            System.out.print("Masukkan biaya makan : ");
            makan[i] = input.nextDouble();

            System.out.print("Masukkan biaya transport : ");
            transport[i] = input.nextDouble();

            System.out.print("Masukkan biaya belanja : ");
            belanja[i] = input.nextDouble();

            totalMakan += makan[i];
            totalTransport += transport[i];
            totalBelanja += belanja[i];
        }

        double totalSemua = totalMakan + totalTransport + totalBelanja;

        System.out.println("\n=== RINCIAN PENGELUARAN HARIAN ===");
        for (int i = 0; i < 7; i++) {
            double totalHarian = makan[i] + transport[i] + belanja[i];

            System.out.printf("Hari ke %d\n", (i+1));
            System.out.printf("Makan : %.2f\n", makan[i]);
            System.out.printf("Transport : %.2f\n", transport[i]);
            System.out.printf("Belanja : %.2f\n", belanja[i]);
            System.out.printf("Total : %.2f\n", totalHarian);
            System.out.printf("------------------------------");
        }

        double persenMakan = (totalMakan/totalSemua)*100;
        double persenTransport = (totalTransport/totalSemua)*100;
        double persenBelanja = (totalBelanja/totalSemua)*100;

        System.out.println("\n=== TOTAL PENGELUARAN 7 HARI ===");
        System.out.printf("Total Makan : %.2f\n", totalMakan);
        System.out.printf("Total Transport : %.2f\n", totalTransport);
        System.out.printf("Total Belanja : %.2f\n", totalBelanja);
        System.out.printf("Total semua : %.2f\n", totalSemua);

        System.out.println("\n=== PERSENTASE ===");
        System.out.printf("Makan : %.2f\n", persenMakan);
        System.out.printf("Transport : %.2f\n", persenTransport);
        System.out.printf("Belanja : %.2f\n", persenBelanja);

        
    }
}