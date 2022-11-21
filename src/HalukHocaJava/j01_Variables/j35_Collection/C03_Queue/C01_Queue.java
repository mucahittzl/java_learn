package HalukHocaJava.j01_Variables.j35_Collection.C03_Queue;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class C01_Queue {
    public static void main(String[] args) {

        /*
        Queue coll. interface oldugu için child class olan LinkedList ve PriorityQueue
        ile obje üretilir.
        Eczane yemekhane vs. belirli bir şart ile aksiyon alan elemanlar için kullanılır.
        Constructor seçimine göre queue objesi özellikleri belirlenir.
        FİFO->first in first out : Collection ilk giren eleman ilk çıkar.Eleman en sona eklenir en baştan silinir.
         */

        Queue<String> q1 = new LinkedList<>(Arrays.asList("Cebrail", "Sümeyra", "Yakup", "Muharrem"));
        System.out.println("q1 = " + q1);// [Cebrail, Sümeyra, Yakup, Muharrem]->insertion order
        q1.add("Erol");
        System.out.println("q1 = " + q1);//[Cebrail, Sümeyra, Yakup, Muharrem,Erol]

        Queue<String> q2 = new PriorityQueue<>(Arrays.asList("javaCAN", "javaSU", "javaNAZ", "javİYE"));//[javaCAN, javaSU, javaNAZ, javİYE]
        System.out.println("q2 = " + q2);//[javaCAN, javaSU, javaNAZ, javİYE]
        q2.add("javiDAN");
        System.out.println("q2 = " + q2);//[javiDAN, javaCAN, javaNAZ, javİYE, javaSU]

        System.out.println("q1.element() = " + q1.element());// Cebrail
        System.out.println("q1.peek() = " + q1.peek());// Cebrail


        System.out.println("q1.remove() = " + q1.remove());//Cebrail
        System.out.println("q1.poll() = " + q1.poll());//Cebrail
        //peek()-> copy-paste gibi ilk elemanı return eder ama silmez
        //poll()-> cut-paste gibi ilk elemanı siler ve  return eder
        // element() -> ilk elemanı silmeden return eder.
        //remove() -> ilk elemnı siler ve return eder..

        //ahan da Trick kösesinde bugun : poll ve remove farkı ->  eger queue coll. boş ise remove NoSuchElementException
        // poll ise null return eder.

        q1.clear();//queue coll. elemanları silindi.
        System.out.println("q1 = " + q1);//[]
        System.out.println("q1.size() = " + q1.size());//0
        System.out.println("q1.poll() = " + q1.poll());//null
        System.out.println("q1.remove() = " + q1.remove());//NoSuchElementException5


        //offer()-> queue coll. eleman eklemek için kullnılır.
        System.out.println("q2.offer(\"küşleme\") = " + q2.offer("küşleme"));//true

        /*
        TRİCK-> offer ve add farkı-> eger queue call. eleman kısıtlaması yapılmısıse
        add meth Exception fırlatır.offer ise true-false return eder.
         */


    }
}
