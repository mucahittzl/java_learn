package HalukHocaJava.j01_Variables.j16_ArrayList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class task08 {
    public static void main(String[] args) {

        //Task->Girilen sayıların içindeortalamadan buyuk olanları prınt eden method create edıonız


        Scanner sc=new Scanner(System.in);
        String str="";
        while (true) {
            System.out.println("sayı giriniz: sayı yeterliyse 'y' giriniz");
            String sayı = sc.next().trim().toLowerCase();
            if (sayı.equals("y"))
                break;
            else {
                sayı = sayı.replace("//D", "");
                str += sayı + " ";
            }
        }
            ortBuyk(str);
    }//main sonu

    private static void ortBuyk(String str) {

        List<String> sayiList = new ArrayList<>(List.of(str.split(" ")));
        System.out.println("girilen sayılar"+sayiList);
        double toplam=0;
        for (int i = 0; i < sayiList.size(); i++) {
            toplam+=Double.parseDouble(sayiList.get(i));
        }
        double ort=toplam/ sayiList.size();
        for (int i = 0; i < sayiList.size() ; i++) {
            if (Integer.parseInt(sayiList.get(i))>ort)
                System.out.println("Girilen sayılardan ortalaması büyük olanlar:"+sayiList.get(i));
        }
    }


}
