package TekrarDersleri;

import java.util.Random;
import java.util.Scanner;

public class boşişler {
    static Scanner scan = new Scanner(System.in);
    static int numberOfFirstWin=0;
    static int numberOfSecondWin=0;
    static int numberOfComWin=0 ;
    static int gameOver = 3;





            public static void main(String[] args) {

                do {
                    System.out.println(">>>Oyun Başı Puanlar<<< \nOyuncu1 Puan = " + numberOfFirstWin + " Oyuncu2 Puan = " + numberOfSecondWin + " Java Puan = " + numberOfComWin);
                    System.out.print("Oyuncu1 seçimini yapınız\n<T>aş  <M>akas  <K>ağıt ");
                    char oyuncu1Karar = scan.next().toUpperCase().charAt(0);
                    System.out.print("Oyuncu2 seçimini yapınız\n<T>aş  <M>akas  <K>ağıt ");
                    char oyuncu2Karar = scan.next().toUpperCase().charAt(0);
                    System.out.println("Java karar veriyor şimdi :) ");
                    char java = javaKarar();
                    System.out.println("oyuncu1 kararı = " + oyuncu1Karar + " oyuncu2 kararı =  " + oyuncu2Karar + " Javanın Kararı = " + java);
                    System.out.println("-------------------------------------");
                    kararOyuncularArasında(oyuncu1Karar, oyuncu2Karar);
                    System.out.println("-------------------------------------");
                    kararOyuncu1JavaArasında(oyuncu1Karar, java);
                    System.out.println("-------------------------------------");
                    kararOyuncu2JavaArasında(oyuncu2Karar, java);
                    System.out.println("<<<Oyun sonu puanlar>>> \nOyuncu1 Puan = " + numberOfFirstWin + " Oyuncu2 Puan = " + numberOfSecondWin + " Java Puan = " + numberOfComWin);
                    numberOfFirstWin = numberOfFirstWin; numberOfSecondWin = numberOfSecondWin; numberOfComWin = numberOfComWin;

                } while (numberOfFirstWin < gameOver && numberOfSecondWin < gameOver && numberOfComWin<gameOver);
                String kazanan = ((numberOfComWin>=3 )? "Java" :"") + ((numberOfSecondWin>=3)? " Oyuncu2" : "") + ((numberOfFirstWin >= 3) ? "Oyuncu1" : "");
                System.out.println("Oyun bitti! Kazanan " + kazanan);

            }

            public static char javaKarar() {
                char karar = ' ';
                double sayi = (double) (Math.random() * 3);
                int net = (int) sayi;
                switch (net) {
                    case 0:
                        karar = 'T';
                        break;
                    case 1:
                        karar = 'M';
                        break;
                    case 2:
                        karar = 'K';
                        break;
                }
                return karar;
            }

            public static void kararOyuncularArasında(char oyuncu1, char oyuncu2) {
                if (oyuncu1 == oyuncu2) {System.out.println("İki oyuncuda aynı seçimi yaptı , kimse puan kazanamadı");}
                if ((oyuncu1 == 'T' && oyuncu2 == 'M') || (oyuncu1 == 'K' && oyuncu2 == 'T')|| (oyuncu1 == 'M' && oyuncu2 == 'K')) { System.out.println("Oyuncu1 Puan kazandı!!!"); numberOfFirstWin++;}
                if ((oyuncu1 == 'T' && oyuncu2 == 'K') || (oyuncu1 == 'K' && oyuncu2 == 'M')|| (oyuncu1 == 'M' && oyuncu2 == 'T')) {System.out.println("Oyuncu2 Puan kazandı!!!"); numberOfSecondWin ++;}
                System.out.println("Oyuncu1 Puan = " + numberOfFirstWin + " Oyuncu2 Puan = " + numberOfSecondWin);
            }
            public static void kararOyuncu1JavaArasında(char oyuncu1 , char oyuncu2) {
                if (oyuncu1 == oyuncu2) {System.out.println("İki oyuncuda aynı seçimi yaptı , kimse puan kazanamadı");}
                if ((oyuncu1 == 'T' && oyuncu2 == 'M') || (oyuncu1 == 'K' && oyuncu2 == 'T')|| (oyuncu1 == 'M' && oyuncu2 == 'K')) {System.out.println("Oyuncu1 Puan kazandı!!!"); numberOfFirstWin++;}
                if ((oyuncu1 == 'T' && oyuncu2 == 'K') || (oyuncu1 == 'K' && oyuncu2 == 'M')|| (oyuncu1 == 'M' && oyuncu2 == 'T')) {System.out.println("Java Puan kazandı!!!"); numberOfComWin ++;}
                System.out.println("Oyuncu1 Puanı = " + numberOfFirstWin + " Javanın Puanı = " + numberOfComWin);
            }
            public static void kararOyuncu2JavaArasında(char oyuncu1 , char oyuncu2) {
                if (oyuncu1 == oyuncu2) {System.out.println("İki oyuncuda aynı seçimi yaptı , kimse puan kazanamadı");}
                if ((oyuncu1 == 'T' && oyuncu2 == 'M') || (oyuncu1 == 'K' && oyuncu2 == 'T')|| (oyuncu1 == 'M' && oyuncu2 == 'K')) {System.out.println("Oyuncu2 Puan kazandı!!!"); numberOfSecondWin++;}
                if ((oyuncu1 == 'T' && oyuncu2 == 'K') || (oyuncu1 == 'K' && oyuncu2 == 'M')|| (oyuncu1 == 'M' && oyuncu2 == 'T')) {System.out.println("Java Puan kazandı!!!"); numberOfComWin ++;}
                System.out.println("Oyuncu2 Puanı = " + numberOfSecondWin + " Javanın Puanı = " + numberOfComWin);
            }


        }

















