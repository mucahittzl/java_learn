package HalukHocaJava.j01_Variables.j32_Abstract.Abstract01;

public class Crv extends Honda {
    @Override
    public void motor() {
        System.out.println("agam 2.4 super turbo motor arazi seni bekler 4X4");
    }

    @Override
    void koltuk() {
        System.out.println("agam deri koltuk arazide daha temiz olur");
    }

    @Override
    void kapı() {
        System.out.println("agam kapılar vakumlu çarpılmayasan");
    }
}
