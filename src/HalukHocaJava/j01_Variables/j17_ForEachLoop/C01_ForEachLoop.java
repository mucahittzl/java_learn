package HalukHocaJava.j01_Variables.j17_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C01_ForEachLoop {
    public static void main(String[] args) {

        /*
        for-each loop for loopungelişmişidir.
        1. clean code-yazım kolaylıgı
        2. code okuma kolaylıgı
        3. hata yapma riskini azaltır
         */
        List<Integer>sayiList=new ArrayList<>(List.of(16,5,2,33,22,27,41,24));
        // task 01-> list elemanlarını ayrı satırlara prınt ediniz
        for (Integer a:sayiList) {
            System.out.println( a + " ");
        }
        System.out.println("*************");
        //task 02-> list elemanlarının ilk 3 eleman harıc tek olanları prınt edınız
        for (Integer b:sayiList.subList(3, sayiList.size())) {
            if(b%2==1) System.out.println(b+" ");//33,27,41
        }
        //task 03->list elemanlarının 2 ile 5 index arasındakı(2,3,4,5) elemanlarının toplamını prınt edınız
        int toplam=0;
        for (Integer c:sayiList.subList(2,6)){
            toplam+=c;
        }
        System.out.println("toplam = " + toplam);


    }
}
