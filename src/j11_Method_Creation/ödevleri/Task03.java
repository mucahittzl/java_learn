package j11_Method_Creation.ödevleri;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.



		Scanner scanner = new Scanner(System.in);
		System.out.print("saat giriniz: ");
		int saat = scanner.nextInt();
		System.out.print("mil giriniz: ");
		int mil = scanner.nextInt();
		System.out.print("kilogram giriniz: ");
		int kg = scanner.nextInt();

hesaplama(saat,mil,kg);


	}

	public static void hesaplama(int saat, int mil, int kg) {
		int saniye = saat * 3600;
		double km = mil * 1.609344;
		int gram = kg * 1000;
		System.out.println("" + saat + " saat = " + saniye + " saniye\n" + mil + "mil= "
				+ km + " kilometre\n" + kg + " kg = " + gram + " gram");
	}









}
