package HalukHocaJava.j01_Variables.j32_Abstract.Ornek2;

public abstract class Sekil {

    private String name;

    public Sekil() {//p'siz cons.

    }
    public Sekil(String name) {//p'li cons.

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double alanHesapla();
    public abstract double cevreHesapla();
  // public void ciz(){
  //     System.out.println(this.name+" çizildi");
  // }
  public String ciz(){
           return this.name+" çizildi";
       }

    @Override
    public String toString() {//obje value'lerini print eder
        return
                "şekil isim='" + this.name + '\'' +
                        "\n ekil alanı :"+this.alanHesapla()+
                        "\nsekil cevre :"+this.cevreHesapla()+
                        "\n sekil "+this.ciz();// ciz methodu call edildi

    }
}
