package j12_Loops.L01_ForLoop.homework;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */

    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.println("Bir Sayı giriniz ");
        int sayı = scan.nextInt();


        System.out.println(getAsalmı(sayı));

    }

    private static boolean getAsalmı(int sayı) {

      boolean asalsayı=true;
        for (int i = 2; i <sayı ; i++) {
            if(sayı%i==0) asalsayı=false;
        }
        return asalsayı;
    }


}

