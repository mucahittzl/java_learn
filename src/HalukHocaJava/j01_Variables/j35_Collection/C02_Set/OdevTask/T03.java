package HalukHocaJava.j01_Variables.j35_Collection.C02_Set.OdevTask;

import java.util.Arrays;
import java.util.HashSet;

public class T03 {
    public static void main(String[] args) {
        /*
           Task
           totalCount() isminde bir method oluşturun.
           Parametresi  'Integer Hashset' olmalı

           HashSetteki eleman sayısını alın.
           totalCount'u döndürün.
           Örnek:
           hashset ; 4,2,3,1,7
           cevap: 5
            */
        HashSet<Integer>hs1=new HashSet<>(Arrays.asList(4,2,3,1,7));
        System.out.println("totalCount(hs1) = " + totalCount(hs1));


    }

    private static int totalCount(HashSet<Integer> hs1) {
        return hs1.size();

    }
}
