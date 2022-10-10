package TekrarDersleri.methoncreation;

import java.util.Scanner;

public class deneme1 {
    public static void main(String[] args) {

/*
 cm olarak verilen bir sayiyi, metre ve kilometreye donusturen bir method yaziniz
  */

        Scanner sc=new Scanner(System.in);
        System.out.println("sayıyı giriniz:");
        double sayı= sc.nextDouble();
        System.out.println(dönüştürmemttr(sayı)+"metre");
        System.out.println(dönüsturmekm(sayı)+"kilometre");



    }

    private static double dönüştürmemttr(double a) {


        return a/100;
    }
private static double dönüsturmekm(double a){


    return a/100000;
}

}
