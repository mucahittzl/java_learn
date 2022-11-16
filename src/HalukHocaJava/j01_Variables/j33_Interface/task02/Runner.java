package HalukHocaJava.j01_Variables.j33_Interface.task02;

import HalukHocaJava.j01_Variables.j26_Inheritance.Task01.B;

import java.util.ArrayList;

public class Runner {
    public static void main(String[] args) {
        ArrayList<Vehicle>araclar=new ArrayList<>();

        TeslaCar tesla1=new TeslaCar();
        ToyotaPirus toyota=new ToyotaPirus();
        Bus bus1=new Bus();
        araclar.add(bus1);
        araclar.add(toyota);
        araclar.add(tesla1);
        for (Vehicle a:araclar) {
            System.out.println(a.engine);
            System.out.println(a.model);
            System.out.println(a.toString());
        }

    }
}
