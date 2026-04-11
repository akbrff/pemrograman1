package SourcePackage;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;

public class latihan1 {
    public static void main(String[] args) {
        BufferedReader dataIn = new BufferedReader(new InputStreamReader(System.in));
        String BacaInput = "";
        byte JmlData = 0;
        byte DataArray[];

        System.out.print("Jumlah data : ");
        try{
            BacaInput = dataIn.readLine();
        } catch (IOException e) {
            System.out.println("Ada kesalahan !");
        }

        JmlData = Byte.parseByte(BacaInput);
        DataArray = new byte[JmlData];

        System.out.println();
        for (byte i = 0; i < JmlData; i++) {
            System.out.print("DataArray[" +i+ "] =");
            try{
                BacaInput = dataIn.readLine();
            } catch (IOException e) {
                System.out.println("Ada kesalahan !");
            }
            DataArray[i] = Byte.parseByte(BacaInput);
        }
        System.out.println("\nData yang diinput:");
        for (byte i = 0; i < JmlData; i++) {
            System.out.println("DataArray[" +1+ "] =" + DataArray[i]);
        }

        byte max = DataArray[0];
        byte min = DataArray[0];

        for (byte i = 1; i < JmlData; i++) {
            if (DataArray[i] > max) {
                max = DataArray[i];
            }
            if (DataArray[i] < min) {
                min = DataArray[i];
            }
        }
        System.out.println("\nNilai Maksimum = " + max);
        System.out.println("Nilai Minimum = " + min);

        Arrays.sort(DataArray);

        System.out.println("\nData setelah diurutkan : ");
        for (byte i = 0; i < JmlData; i++) {
            System.out.println(DataArray[i] + " ");
        }
    }
}
