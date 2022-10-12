package TekrarDersleri.WhileDowhile;

import java.util.Scanner;

public class ödev3 {
    public static void main(String[] args) {


/*
            * Kullanicidan bir cumle ve bir harf alin,
	     * Cumlede harfin kac kere
	     * kullanildigini bulup, yazdirin
	     *
	     * ORNEK:
	     *
	     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
                *
	     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis. */


        Scanner sc=new Scanner(System.in);
        System.out.println("string ifade ve harf gir gir:");
        String ifade=sc.nextLine();
        char harf= sc.next().charAt(0);
		int adet=0;

		for (int i = 0; i <ifade.length() ; i++) {
			if (ifade.charAt(i)==harf){
				adet++;
			}
		}
		System.out.println("cümlede"+" "+adet+" "+"adet"+" "+harf+" "+"harfi kullanılmış");
    }
}
