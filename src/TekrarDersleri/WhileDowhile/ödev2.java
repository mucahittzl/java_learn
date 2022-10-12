package TekrarDersleri.WhileDowhile;

import java.util.Scanner;

public class ödev2 {

    public static void main(String[] args) {



        //	 * Ask user enter a positive number and check if it is prime or not Kullanıcıdan
        // * pozitif bir sayı girmesini isteyin ve asal olup olmadığını kontrol edin


        Scanner sc=new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int sayi = sc.nextInt();
        boolean asalkontrol =true;
        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                asalkontrol=false;
                break;
            }

        }
        System.out.println(asalkontrol);


    }
}
