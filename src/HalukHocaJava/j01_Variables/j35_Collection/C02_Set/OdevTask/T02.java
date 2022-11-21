package HalukHocaJava.j01_Variables.j35_Collection.C02_Set.OdevTask;

import java.util.Arrays;
import java.util.LinkedHashSet;

public class T02 {
    public static void main(String[] args) {

        /*
    Task->
   return tipi linkedhashset olan removing() isminde bir method oluşturun.
    Parametre olarak bir LinkedHashset ve iki String ten oluşmalı.
    Eğer Stringler LinkedHashset 'in içinde varsa, silinmeli.

    Örneğin,
    linkedhashset : Germany , France , USA , Canada , Mexico , Brazil
    String 1= Germany
    String 2 = USA
     Germany ve USA 'i sil.
    Set'i return et.
     */

        LinkedHashSet<String>ls1=new LinkedHashSet<>(Arrays.asList("Germany" , "France" ,"USA"," Canada"," Mexico", "Brazil"));
        String s1= "Germany";
        String s2 = "USA";

        System.out.println("removing(ls1,s1,s2) = " + removing(ls1, s1, s2));

    }

    private static LinkedHashSet removing(LinkedHashSet<String> ls1, String s1, String s2) {
        if (ls1.contains(s1)&&ls1.contains(s2)){
            ls1.remove("Germany");
            ls1.remove("USA");
        }
        return ls1;
    }
}
