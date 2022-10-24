package j20_PassByValue;

public class C02_PassByValue {


    public static void main(String[] args) {

        //task->verilen fiyat için %11 %22 ve %33 indirimli fiyatı prınt edn method create ediniz

        double fiyat= 100;

        System.out.println("indir11(fiyat) = " + indir11(fiyat));
        System.out.println("indir22(fiyat) = " + indir22(fiyat));
        System.out.println("indir33(fiyat) = " + indir33(fiyat));
        System.out.println(fiyat);// yine 100 verir. pass by value

    }

    private static double indir33(double fiyat) {
      return fiyat*=0.67;
    }

    private static double indir22(double fiyat) {
        return fiyat*=0.78;
    }

    private static double indir11(double fiyat) {
        return fiyat*=0.89;
    }

}
