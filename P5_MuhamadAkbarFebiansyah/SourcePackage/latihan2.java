package SourcePackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class latihan2 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String input = "";
        int jumlah;
        int nilai[];

        System.out.print("Masukkan jumlah mahasiswa: ");
        try {
            input = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan!");
        }

        jumlah = Integer.parseInt(input);
        nilai = new int[jumlah];

        System.out.println("\nMasukkan nilai mahasiswa: ");
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Nilai ke-" + (i + 1) + " = ");
            try {
                input = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Terjadi kesalahan!");
            }
            nilai[i] = Integer.parseInt(input);
        }

        System.out.println("\nData Nilai:");
        for (int i = 0; i < jumlah; i++) {
            System.out.println("Nilai ke-" + (i + 1) + " = " + nilai[i]);
        }

        int max = nilai[0];
        int min = nilai[0];

        for (int i = 1; i < jumlah; i++) {
            if (nilai[i] > max) {
                max = nilai[i];
            }
            if (nilai[i] < min) {
                min = nilai[i];
            }
        }

        System.out.println("\nNilai Tertinggi = " + max);
        System.out.println("Nilai Terendah  = " + min);

        Arrays.sort(nilai);

        System.out.println("\nNilai setelah diurutkan:");
        for (int i = 0; i < jumlah; i++) {
            System.out.print(nilai[i] + " ");
        }
    }
}