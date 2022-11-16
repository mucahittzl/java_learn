package HalukHocaJava.j01_Variables.j33_Interface;

public class Sahin extends Tofas implements dısDonanım,icDonanım,Lastik{// concrete child class extends->Tofaş, implement ->dısDonanım,içDonanım,Lastik
    @Override
    public void ebat() {
        System.out.println("agam 16 inc lastik ebat");
    }

    @Override
    public void jant() {
        System.out.println("agam senin gibi janti adama çelik 5 kollu jant yakışır");
    }

    @Override
    public void motor() {
        System.out.println("agam 1.6 aile motor");
    }

    @Override
    public void yakıt() {
        System.out.println("agam tüpü tak yoksa ocağa incir ağacı");
    }

    @Override
    public void kapi() {
        System.out.println("agam 4 kapı sedan");
    }

    @Override
    public void kaporta() {
        System.out.println("agam akordeon kaporta gamzesiz olmaz");
    }

    @Override
    public void koltuk() {
        System.out.println("agam deri koltuk yazın pişik yapar içi saman olmasın kafi");
    }

    @Override
    public void klima() {
        System.out.println("agam aç camı serşnle klima senın neyine");
    }

}
