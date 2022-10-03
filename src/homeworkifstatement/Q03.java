package homeworkifstatement;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		/* TASK :
		 *  Kullanicinin boyunu  m  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz

	    INFO :
		BMI = kilo(kg) /(boy*boy)(m)
		BMI <=20 oldukca zayifsiniz
		20<BMI<=25 Normal sinirlardasiniz 
		25<BMI<=30 Sisman kategorisindesiniz
		30<BMI ==> Obez grubundasiniz.
		
		 */


        Scanner sc=new Scanner(System.in);
        System.out.println("boyunuzu giriniz:");
        double boy=sc.nextDouble();
        System.out.println("kilonuzu giriniz:");
        double kg=sc.nextDouble();
        double bmi=kg/boy*boy;
        if(bmi<=20){
            System.out.println("oldukça zayıfsınız");}
        else if(bmi<20&&bmi<=25){
            System.out.println("Normal sınırlardasınız");}
        else if(bmi<25&&bmi<=30){
            System.out.println("Sisman kategorısındesınız");}
        else if(bmi>30){
            System.out.println("Obezsiniz");}






    }

}
