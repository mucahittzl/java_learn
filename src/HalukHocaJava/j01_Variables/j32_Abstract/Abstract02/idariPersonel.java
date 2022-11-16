package HalukHocaJava.j01_Variables.j32_Abstract.Abstract02;

public class idariPersonel extends personel {

    @Override
    public void maasHesapla() {//personel parent class'dan override abs. meth.
        System.out.println("agam frapan idarecimize saat başı 120$");
    }

    @Override
    public void maasBilgisi() {//personel parent class'dan override abs. meth.
        System.out.println("agam cıncık code yazan idari personele ekistiradan 1 ay ikramiye");
    }

    @Override
    public void sigorta() {//personel parent class'dan override edilen conc. method
        System.out.println("agam cıncık coder personel dull sigorta");
    }
}
