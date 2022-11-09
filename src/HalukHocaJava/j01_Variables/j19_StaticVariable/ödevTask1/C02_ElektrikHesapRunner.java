package HalukHocaJava.j01_Variables.j19_StaticVariable.ödevTask1;

public class C02_ElektrikHesapRunner {
    public static void main(String[] args) {


        /*
    Task 02 ->
    ElektirikHesap Class:  fields : toplamTuketim(int), oran(double), fatura(double)
    Müşteriye ait tüketilen enerjiyi toplamTuketim'e toplayan tüketimEkle method
    oran(0.7)  katsaysı ile  toplamTuketim çarparak fatura değeri atayan odenecekTutar method

    Müsteri Class: fields: name ElektrikHesabi class obj.
    Runner Class obj ile enz 2  aylık elektrik tüketim faturası print eden code create ediniz

     */



        C02_ElektrikHesap fatura1 = new C02_ElektrikHesap();
        fatura1.tüketimEkle(150);
        fatura1.tüketimEkle(250);
        System.out.println("Toplam tüketim = " + fatura1.toplamTuketim);
        System.out.println("Ödenecek tutar= "+ fatura1.odenecekTutar(fatura1.toplamTuketim));








    }
}
