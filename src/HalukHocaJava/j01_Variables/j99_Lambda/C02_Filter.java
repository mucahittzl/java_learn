package HalukHocaJava.j01_Variables.j99_Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_Filter {
    public static void main(String[] args) {

        List<Integer> sayi = new ArrayList<>(Arrays.asList(24, 38, 49, 33, 7, 3, 42, 66, 75, 45, 46, 55, 35, 25, 67, 16));

        printCiftElStructured(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***   ");
        printCiftElFunctional(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***   ");
        printCiftElFunctional1(sayi);//24 38 42 66 46 16
        System.out.println("\n   ***   ");
        printCiftElFunctional2(sayi);//24 16
        System.out.println("\n   ***   ");
        printCiftElFunctional3(sayi);

    }
    //Task : "Structured Programming":Amele code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    public static void printCiftElStructured(List<Integer> sayi){//amele işi method

        for (Integer w:sayi){
            if (w%2==0){
                System.out.print(w+" ");
            }
        }

    }
//Task : "Functional Programming":cincix code kullanarak list elemanlarının çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    private static void printCiftElFunctional(List<Integer> sayi){
        sayi.stream().//LİST ELEMANLARI AKIŞA ALINDI
                filter(t->t%2==0).//akısdakı list elemanları cıft olma sartına gore filtrelendi : akısn cıkarıldı->bad practise
                forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call) edildi

    }

    private static void printCiftElFunctional1(List<Integer> sayi){//METHOD REFERANSLI BEST PRACTİSE
        sayi.stream().//LİST ELEMANLARI AKIŞA ALINDI
                filter(C01_LambdaExpression::ciftMi).//akısdakı list elemanları cıft olma sartına gore filtrelendi : akısn cıkarıldı
                forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call) edildi

    }

    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 35 den küçük  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.

    private static void printCiftElFunctional2(List<Integer> sayi){//METHOD REFERANSLI BEST PRACTİSE
        sayi.stream().//LİST ELEMANLARI AKIŞA ALINDI
                filter(C01_LambdaExpression::ciftMi).//akısdakı list elemanları cıft olma sartına gore filtrelendi : akısn cıkarıldı
                filter(t->t<35/*&&t%2==0*/). //bu şekilde tek filter içinde de yapılabilir
                forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call) edildi

    }
    //Task : "Functional Programming":cincix code kullanarak list elemanlarının 34 den buyuk YADA  çiftlerini  aynı satirda aralarında bosluk olacak sekilde print ediniz.
    private static void printCiftElFunctional3(List<Integer> sayi){//METHOD REFERANSLI BEST PRACTİSE
        sayi.stream().//LİST ELEMANLARI AKIŞA ALINDI
                filter(t->t%2==0||t>34).//akısdakı list elemanları cıft olma sartına gore filtrelendi : akısn cıkarıldı
                filter(t->t<35/*&&t%2==0*/). //bu şekilde tek filter içinde de yapılabilir
                forEach(C01_LambdaExpression::yazdir);//C01 Class'daki yazdır method refere(call) edildi

    }


}
