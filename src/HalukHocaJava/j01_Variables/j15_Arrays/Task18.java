package HalukHocaJava.j01_Variables.j15_Arrays;

import java.util.Arrays;


public class Task18 {
    public static void main(String[] args) {

        //task-> sayı arr'deki içç arr'lerin toplamını yeni bir array a atayım print eden code create ediniz

        int sayi[][] = { { 1, 2, 3 }, { 19, -8 }, { 24, 10, -41 } };
        int arr[] = new int[sayi.length];

        for (int i = 0; i <= sayi.length - 1; i++) {
            int toplam = 0;
            for (int j = 0; j <= sayi[i].length - 1; j++) {
                toplam += sayi[i][j];

            }
            arr[i] = toplam;
        }
        System.out.println(Arrays.toString(arr));

    }
}
