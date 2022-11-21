package HalukHocaJava.j01_Variables.j35_Collection.C02_Set.OdevTask;

import java.util.Arrays;
import java.util.HashSet;

public class T01 {
    public static void main(String[] args) {

        /*
    Task
    Parametre olarak bir String HashSet   ve  iki String alan  return type HashSet
   olan  changeSet() isminde bir method oluşturun.
    Eğer HashSet String 1 e sahipse,HashSet'in  String 1 elemanını String 2 ile değiştirin.
    ÖRNEK:
    hashset = "banana" , "strawberry" , "kiwi" , "pineapple"
    String 1 = banana
    String 2 = peach
    CEVAP: "peach" , "strawberry" , "kiwi" , "pineapple"
     */
        HashSet<String> hs1 = new HashSet<>(Arrays.asList("banana", "strawberry", "kiwi", "pineapple"));
        String s1 = "banana";
        String s2 = "peach";
        System.out.println("changeSet(hs1,s1,s2) = " + changeSet(hs1, s1, s2));

    }

    private static HashSet changeSet(HashSet<String> hs1, String s1, String s2) {
        if (hs1.contains(s1)) {
            hs1.remove(s1);
            hs1.add(s2);

        }
        return hs1;
    }
}
