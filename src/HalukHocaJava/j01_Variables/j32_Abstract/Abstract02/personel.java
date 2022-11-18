package HalukHocaJava.j01_Variables.j32_Abstract.Abstract02;

public abstract class personel {

    String name="Nur Hanım";

    public abstract void maasHesapla();//abs method
    public abstract void maasBilgisi();//abs method

    public void sigorta(){//concrete method
        System.out.println("agam özel sigorta kapsamındasın..");
    }



}
