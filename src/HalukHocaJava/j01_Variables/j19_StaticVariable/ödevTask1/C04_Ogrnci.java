package HalukHocaJava.j01_Variables.j19_StaticVariable.ödevTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C04_Ogrnci {

    String StudentName;
    int maxCredi;
    List<C04_Lesson>dersler=new ArrayList<>();

    public C04_Ogrnci(String next){
        Scanner sc=new Scanner(System.in);
        StudentName= sc.next();
        while (maxCredi<=10){
            System.out.println("ders adı gir:");
            C04_Lesson ders=new C04_Lesson(sc.next());
            System.out.println(ders.dersİsmi+ "dersin kredisini giriniz:");
            ders.credi=sc.nextInt();
            if(maxCredi+ders.credi<=10){
                maxCredi+=ders.credi;
                dersler.add(ders);
                continue;
            }else System.out.println("Maksimum 30 kredi mikarını aşığınız için " + ders.dersİsmi + " dersini alamadınız");
            break;

        }

        System.out.println("Adınız :"+StudentName+"\nAldığınız dersler :");
        for (C04_Lesson lesson:dersler) {
            System.out.println(lesson.dersİsmi+" : "+lesson.credit);
        }
        System.out.println("Toplam kredi :"+toplamKredisi());
    }

    public int toplamKredisi() {//Task'a baglı kalmak için yazıp son printte kullandım
        return maxCredi;
    }













}