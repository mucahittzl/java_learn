package j11_Method_Creation.ödevleri;

import java.util.Scanner;

import static j11_Method_Creation.ödevleri.Task03.hesaplama;

public class Task06 {



	public static void main(String[] args) {
		/*
		 Kullanıcıya paralelkenar, dikdörtgen ve üçgen kelimelerinden birini 
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
		 */
		
		Scanner sc=new Scanner(System.in);
		System.out.println("lutfen paralelkenar için (P),dikdörtgen için (D) veya üçgenden için (Ü) birini seçin:");
		String seçim=sc.next().toUpperCase().trim().substring(0,1);

hesaplama(seçim);






}

	private static void hesaplama(String seçim) {
if(seçim.equals("P")){
		Scanner sc=new Scanner(System.in);
		System.out.println("paralelkenar uzunluk giriniz");
		int paralelkenaruzunluk= sc.nextInt();
		System.out.println("paralelklenar genıslık giriniz");
		int paralelkenargenişlik=sc.nextInt();
	System.out.println("parlelkenaralan:"+paralelkenaruzunluk * paralelkenargenişlik);
	System.out.println("paralelkenarçevre:"+(paralelkenaruzunluk + paralelkenargenişlik) * 2);}
if(seçim.equals("D")){
	Scanner sc=new Scanner(System.in);
		System.out.println("dikdörtgen uzunluk giriniz");
		int dikdörtgenuzunluk= sc.nextInt();
		System.out.println("dikdörtgen genıslık giriniz");
		int dikdörtgengenişlik=sc.nextInt();
	System.out.println("dikdörtgenalan:"+ dikdörtgenuzunluk * dikdörtgengenişlik);
	System.out.println("dikdörtgençevre:" +(dikdörtgenuzunluk + dikdörtgengenişlik) * 2);}
if(seçim.equals("Ü")){
Scanner sc=new Scanner(System.in);
		System.out.println("üçgen kenar giriniz");
		int üçgenuzunluk= sc.nextInt();
		System.out.println("üçgen yukseklık gir:");
		int üçgenyukseklık= sc.nextInt();
	System.out.println("üçgenalan :"+ (üçgenuzunluk * üçgenyukseklık) * 2);
	System.out.println("üçgençevre :"+ üçgenuzunluk * 2);}


	}


}
