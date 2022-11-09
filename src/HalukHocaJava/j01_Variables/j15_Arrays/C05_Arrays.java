package HalukHocaJava.j01_Variables.j15_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {


        //Array copy.... copyof(arr,newlength);->girilen arraın new length kadar ilk elemanını kopyalar


        int sayi[]={63,21,47,27,35,12,36,31,46,24};
        int yeniArr[]= Arrays.copyOf(sayi,5);
        System.out.println(Arrays.toString(yeniArr)); //sayıdan 5 girildiği için ilk 5 değeri kopyaladı


        int baskaArr[]=Arrays.copyOfRange(sayi,3,8);// 3 dahil 8 hariç elemanlar kopyalanır

        System.out.println("sayı arr'den özel kopyalanan baska arr:"+Arrays.toString(baskaArr));

        //Array'ı belırlı bır eleman ıle update etme....fill(arr,value);

        Arrays.fill(sayi,99);// hepsini 99 yapar
        System.out.println(Arrays.toString(sayi));
        Arrays.fill(sayi,3,7,33);//3.4.5.6. index elemanlar 33 ile update edildi
        System.out.println("sayı arr'ı 3 ile 7 index arası 33 ıle full'lenmıs hali"+Arrays.toString(sayi));//[99, 99, 99, 33, 33, 33, 33, 99, 99, 99]












    }
}
