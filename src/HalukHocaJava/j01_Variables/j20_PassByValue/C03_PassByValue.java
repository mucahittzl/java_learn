package HalukHocaJava.j01_Variables.j20_PassByValue;

import java.util.ArrayList;
import java.util.List;

public class C03_PassByValue {
    public static void main(String[] args) {

        /*
        java non-primitive data türlerinde objenin kendisi değil de dataları değişirse objenin referans ve kendisi
        değişmediği için dataların değişikliğini kalıcı yapar
         */

        //Task-> llist elemanları 24,20,87 iki farklı method ile list elemanlarını update edip printe eden code create ediniz
        // 1. method->with for each 2. method set(index,value)
        List<Integer>list1=new ArrayList<>(List.of( 24,20,87));
        System.out.println("method öncesi list1 = " + list1);
        listUpdate1(list1);
        listUpdate2(list1);
        System.out.println("method sonrası list1 = " + list1);
    }
    public static void listUpdate1(List<Integer>list1){
        for (Integer v:list1){
            v*=2;}
            System.out.println("v = " + list1);

    }

    public static void listUpdate2(List<Integer>list1){
        for(int i = 0; i <list1.size() ; i++) {
            list1.set(i, list1.get(i)*2);

        }System.out.println("list1 = " + list1);
    }
}
