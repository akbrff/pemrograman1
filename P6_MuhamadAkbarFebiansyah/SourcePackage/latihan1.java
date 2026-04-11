package P6_MuhamadAkbarFebiansyah.SourcePackage;
import java.util.Arrays;

public class latihan1 {
    private double tinggi;
    private double alas;

    public void settinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public void setalas(double alas) {
        this.alas = alas;
    }

    public double gettinggi() {
        return tinggi;
    }

    public double getalas() {
        return alas;
    }

    public double getluas() {
        return (this.tinggi * this.alas * 0.5);
    }

    public static void main(String[] args) {
        latihan1 S[] = new latihan1[2];

        S[0] = new latihan1();
        S[1] = new latihan1();

        S[0].settinggi(12.0);
        S[0].setalas(8.0);

        S[1].settinggi(11.23);
        S[1].setalas(7.7);

        double luasArray[] = new double[2];

        for (int i = 0; i < 2; i++) {
            System.out.println("Segitiga ke-" + (i + 1));
            System.out.println("Tinggi = " + S[i].gettinggi());
            System.out.println("Alas = " + S[i].getalas());

            luasArray[i] = S[i].getluas();
            System.out.println("Luas Segitiga = " + luasArray[i]);
            System.out.println();
        }
        
        double max = luasArray[0];
        double min = luasArray[0];

        for (int i =1; i < luasArray.length; i++) {
            if (luasArray[i] > max) {
                max = luasArray[i];
            }
            if (luasArray[i] < min) {
                min = luasArray[i];
            }
        }

        System.out.println("Luas Maksimum = " + max);
        System.out.println("Luas Minimum = " + min);

        Arrays.sort(luasArray);

        System.out.println("\nLuas setelah diurutkan : ");
        for (int i = 0; i < luasArray.length; i++) {
            System.out.println(luasArray[i]);
        }
    }
}

