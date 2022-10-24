package j19_StaticVariable.ödevTask1;

public class C02_ElektrikHesap {



    int toplamTuketim;
    final private double oran=0.7;
    double fatura;

    public int tüketimEkle(int tüketim){
        return toplamTuketim += tüketim;
    }
    public double odenecekTutar(int toplamTuketim){
        return fatura = oran*toplamTuketim;
    }

    @Override
    public String toString() {
        return "ElwktrikHesap{" + "toplamTuketim=" + toplamTuketim + ", fatura=" + fatura + '}';
    }









}
