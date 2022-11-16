package HalukHocaJava.j01_Variables.j32_Abstract.Ornek3;

public class Runner {
    public static void main(String[] args) {

Baklava b=new Baklava();
        b.madeIn();
        b.taste();
        System.out.println("b = " + b);

        SezarSalad ss=new SezarSalad();
        ss.taste();
        ss.madeIn();
    }
}
