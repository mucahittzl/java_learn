package HalukHocaJava.j01_Variables.j35_Collection.C01_LinkedList;

import java.util.LinkedList;

public class C02_LinkedList {
    public static void main(String[] args) {

        LinkedList<Object>list=new LinkedList<>();// DataType OBJECT yani her tipte variable alır
        //Bad practise application çok yavaşlar tavsiye edilmez
        list.add("nazım");
        list.add('$');
        list.add(1453);
        System.out.println("list = " + list);//list = [nazım, $, 1453]


    }
}
