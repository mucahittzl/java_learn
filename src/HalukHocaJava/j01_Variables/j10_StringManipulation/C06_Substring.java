package HalukHocaJava.j01_Variables.j10_StringManipulation;

import java.util.Scanner;

public class C06_Substring {
    public static void main(String[] args) {


/*
substring()
Metin icinde, istenilen araliktaki bir parcasina ya da butunune ulasilabilir. Sonuc ise String dir.
substring(i)->Method'a parametre olarak girilen  index'den sona kadar olan parcayi return eder
substring(baslangicIndexi, bitisIndexi)->Method'a parametre olarak girilen  baslangicIndexi'den bitis
indexi'e kadar parçayı return eder
baslangic indexi ==> inclusive/dahil
bitis indexi ==> eclusive/haric
 */
String str="java bilen sırtı yere gelmez :)";
        System.out.println(str.substring(10));//sırtı yere gelmez yazar
        //str datasınınn son 10 karakterını yazdırınız
        System.out.println(str.substring(str.length() - 10));//gelmez :) verir

        System.out.println(str.substring(0,10));//java bilen ilk 10 karakteri almak için bu yontem
        System.out.println(str.substring(0, 1));//j->0 alır 1 almaz yanı ılk karakterı verır

        //task-->girilen 4 harflı kelımeyı tersten prınt eden code create edınız
        Scanner sc=new Scanner(System.in);
        System.out.println("4 harflı kelıme gır");
        String kelime= sc.next();
        if(kelime.length()!=4){
            System.out.println("dort harflı gır");
        }else{
            System.out.println(kelime.substring(kelime.length() - 1));
            System.out.println(kelime.substring(2,3));
            System.out.println(kelime.substring(1,2));
            System.out.println(kelime.substring(0,1));


        }





    }
}
