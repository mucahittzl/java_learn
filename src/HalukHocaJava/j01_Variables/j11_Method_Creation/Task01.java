package HalukHocaJava.j01_Variables.j11_Method_Creation;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {

       //girilen iki sayının eşitliğini kontol eden method create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("1. sayıyı giriniz:");
        int sayi1=sc.nextInt();
        System.out.println("2. sayıyı giriniz:");
        int sayı2=sc.nextInt();

        System.out.println(esitkontrol(sayi1, sayı2));//girilen sayıya true veya false değeri verir


    }//main sonu

    private static boolean esitkontrol(int sayi1, int sayı2) {
        boolean esitMı=false;
        if (sayi1==sayı2){
            esitMı=true;
        }else esitMı=false;

        return esitMı;
    }


}
