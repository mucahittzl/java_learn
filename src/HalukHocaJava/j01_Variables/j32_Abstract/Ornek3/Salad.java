package HalukHocaJava.j01_Variables.j32_Abstract.Ornek3;

public abstract class Salad extends Food{//parent ve child abs. class'larda aynı isimli iki method create edilebilir

    public abstract void madeIn();

    public void taste() {
        System.out.println("agam salatanı gavurdağı çoban kaşık söğüş mü verelim");
    }
}
