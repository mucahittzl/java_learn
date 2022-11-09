package HalukHocaJava.j01_Variables.j16_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class C13_replaceAll_fill {
    public static void main(String[] args) {

        //replaceAll();->listte brlirli bir değer ile update eder
        ArrayList<Integer>listSayi=new ArrayList<>(Arrays.asList(1,24,23,14,19,60,1,55,27,1,38));
        System.out.println("listSayi = " + listSayi);//replace öncesi
        Collections.replaceAll(listSayi,1,20);// salyilist'inde 1 yerine 20 atandı
        System.out.println("listSayi = " + listSayi);//replace sonrası

        //fill();-> listte tüm elemanları belirli bir değere update eder
        Collections.fill(listSayi,33);
        System.out.println("listSayi = " + listSayi);// fill sonrası


    }
}
