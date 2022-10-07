package j10_StringManipulation;

import java.util.Scanner;

public class Task04derste {
    public static void main(String[] args) {

        /*
 Task->
 Girilen iki kelimeden ilki çift sayıda kaqrakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
 ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
 name1= mehmet
 name2= ahmet
 Print ==> mehahmetmet
 */


        Scanner sc=new Scanner(System.in);
        System.out.println("1. karakterleri gir");
        String kelime1=sc.nextLine();
        System.out.println("2. karakteri gir:");
        String kelime2=sc.next();
        if(kelime1.length()%2==0){
            System.out.println(kelime1.substring(0, kelime1.length() / 2) + kelime2 + kelime1.substring(kelime1.length() / 2));
        }else{
            System.out.println("kelime2 kelime1 e eklenemez");
        }











    }
}
