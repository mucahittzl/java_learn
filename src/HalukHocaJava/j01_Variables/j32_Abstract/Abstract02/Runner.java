package HalukHocaJava.j01_Variables.j32_Abstract.Abstract02;

public class Runner {
    public static void main(String[] args) {

        isci mrb1=new isci();
        mrb1.maasBilgisi();
        mrb1.maasHesapla();
        mrb1.name="Ebubekir Güzel insan :-)";
        System.out.println("mrb1.name = " + mrb1.name);
        mrb1.sigorta();//abs parent classs'daki concrete method obje ile call edildi

        idariPersonel cncCdr=new idariPersonel();
        cncCdr.name="Dilek Hanım orjiklerin efendisiii";
        System.out.println("cncCdr.name = " + cncCdr.name);
        cncCdr.sigorta();
        cncCdr.maasHesapla();
        cncCdr.maasBilgisi();
    }
}
