package j13_Break_Continue;

import java.util.Scanner;

public class C03_AsalKontrol {
    public static void main(String[] args) {


        //task->Girilen tamsayının asal olmasını kontrol eden code create ediniz.

        Scanner sc=new Scanner(System.in);
        System.out.println("sayı giriniz:");
        int sayı=sc.nextInt();
        boolean asalmı=true;

        for (int i = 2; i <sayı ; i++) {
        if(sayı%i==0) {  //eğer sayı kendisinne kladar olan sayılara tam bölünüyorsa nın kontrolu
        asalmı=false;
        break;
}
        }
        if (asalmı) System.out.println("girilen sayı asal");
        else System.out.println("girilen sayı asal değil");











    }
}
