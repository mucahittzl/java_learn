package HalukHocaJava.j01_Variables.j11_Method_Creation;

import java.util.Scanner;

public class C02_MethodCreation {
    public static void main(String[] args) {

        //task->girilen 3 notun ortalamasını hesaplayan method create ediniz.


        Scanner sc=new Scanner(System.in);
        System.out.print("1. notunuzu giriniz:");
        double not1= sc.nextDouble();
        System.out.print("2. notunuzu giriniz:");
        double not2= sc.nextDouble();
        System.out.print("3. notunuzu giriniz:");
        double not3= sc.nextDouble();

       double ortalamanız= ortalamaHesapla(not1,not2,not3);
        System.out.println("not ortalamanız:"+ortalamanız);


    }//main kapanış

    private static double ortalamaHesapla(double not1, double not2, double not3) {

        return (not1+not2+not3)/2;
    }

}
