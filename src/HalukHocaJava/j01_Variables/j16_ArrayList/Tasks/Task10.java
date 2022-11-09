package HalukHocaJava.j01_Variables.j16_ArrayList.Tasks;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */


       int[]sayılar={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
       Arrays.sort(sayılar);
        ArrayList<Integer>arrList1=new ArrayList<>();
        ArrayList<Integer>arrList2=new ArrayList<>();
        for (int i = 0; i < sayılar.length ; i++) {
            arrList1.add(sayılar[i]);
        }
        for (int i = 0; i <arrList1.size() ; i++) {
            arrList2.add(arrList1.get(i));
            arrList1.removeAll(Collections.singleton(arrList1.get(i)));
        }
        System.out.println("arrList2 = " + arrList2);


    }

}
