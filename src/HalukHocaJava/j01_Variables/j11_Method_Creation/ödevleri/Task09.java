package HalukHocaJava.j01_Variables.j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner sc=new Scanner(System.in);
        System.out.println("saat giriniz:");
        double saat= sc.nextDouble();

        saniye(saat);

    }

    private static void saniye(double saat) {

        System.out.println("girilen saat="+saat*3600);

    }


}
