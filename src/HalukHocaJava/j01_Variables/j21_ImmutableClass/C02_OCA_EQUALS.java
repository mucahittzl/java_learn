package HalukHocaJava.j01_Variables.j21_ImmutableClass;

import java.util.ArrayList;
import java.util.List;

public class C02_OCA_EQUALS {
    public static void main(String[] args) {

        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        //list.add(7);  CTE verir

        for (String s : list) System.out.println(s);


    }
}
