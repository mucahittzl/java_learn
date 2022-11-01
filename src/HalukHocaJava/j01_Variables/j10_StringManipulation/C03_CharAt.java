package HalukHocaJava.j01_Variables.j10_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {

        /*
        charAt() methodu parametre int olarak girilen index'deki char değerini return eder.
        index değeri 0'dan baslar
         */
   String sehir="Istanbul";
    char besinciİndexKrkt= sehir.charAt(5);
        System.out.println(besinciİndexKrkt);//b
        //son index karakteri-->lenght-1

        System.out.println(sehir.charAt(sehir.length() - 1));//l
    //ilk index karakter-->charAt(0) ile bulunur
        System.out.println(sehir.charAt(0));//I
        //System.out.println(sehir.charAt(18));//rte hata verir max kelimedeki karakter sayısı gırılebılır
        //Trick charAt() index boyutunu geçerse rte verir
        //TASK->istanbul kelimesinin ortadakki karakterini print eden code create ediniz
        sehir.charAt(sehir.length()/2);
        Scanner sc=new Scanner(System.in);
        System.out.println("bir kelime gir");
        String kelime= sc.nextLine();
        if(kelime.length()%2!=0){
            System.out.println(kelime.charAt((kelime.length()-1) / 2));}
        else System.out.println("girilen kelimenın ortası yoktur");


        }
}
