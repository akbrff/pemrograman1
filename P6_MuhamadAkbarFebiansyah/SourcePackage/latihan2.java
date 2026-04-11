package P6_MuhamadAkbarFebiansyah.SourcePackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class latihan2 {
    private double panjang;
    private double lebar;

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    public double getPanjang() {
        return panjang;
    }

    public double getLebar() {
        return lebar;
    }

    public double getLuas() {
        return panjang * lebar;
    }

    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int jumlah;

        System.out.print("Masukkan jumlah data: ");
        try {
            input = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan!");
        }

        jumlah = Integer.parseInt(input);

        latihan2 P[] = new latihan2[jumlah];
        double luasArray[] = new double[jumlah];

        // Input data
        for (int i = 0; i < jumlah; i++) {
            P[i] = new latihan2();

            try {
                System.out.println("\nData ke-" + (i + 1));

                System.out.print("Panjang = ");
                input = dataIn.readLine();
                P[i].setPanjang(Double.parseDouble(input));

                System.out.print("Lebar   = ");
                input = dataIn.readLine();
                P[i].setLebar(Double.parseDouble(input));

            } catch (IOException e) {
                System.out.println("Terjadi kesalahan!");
            }
        }

        // Tampilkan data + hitung luas
        System.out.println("\n=== DATA PERSEGI PANJANG ===");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Data ke-" + (i + 1));
            System.out.println("Panjang = " + P[i].getPanjang());
            System.out.println("Lebar   = " + P[i].getLebar());

            luasArray[i] = P[i].getLuas();
            System.out.println("Luas    = " + luasArray[i]);
            System.out.println();
        }

        // Max & Min
        double max = luasArray[0];
        double min = luasArray[0];

        for (int i = 1; i < jumlah; i++) {
            if (luasArray[i] > max) {
                max = luasArray[i];
            }
            if (luasArray[i] < min) {
                min = luasArray[i];
            }
        }

        System.out.println("Luas Maksimum = " + max);
        System.out.println("Luas Minimum  = " + min);

        // Sorting
        Arrays.sort(luasArray);

        System.out.println("\nLuas setelah diurutkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println(luasArray[i]);
        }
    }
}