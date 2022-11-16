package HalukHocaJava.j01_Variables.j32_Abstract.Abstract02;

public class isci extends personel{
    @Override
    public void maasHesapla() {//personel parent class'dan override abs. meth.
        System.out.println("gam marabalara en çok yevmiye 499 gayme verilir");
    }

    @Override
    public void maasBilgisi() {//personel parent class'dan override abs. meth.
        System.out.println("agm marabalar çay-cugara hariç günde 8 saat kurek mahkumu");
    }

}
