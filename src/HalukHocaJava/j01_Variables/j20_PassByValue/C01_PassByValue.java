package HalukHocaJava.j01_Variables.j20_PassByValue;

public class C01_PassByValue {
    public static void main(String[] args) {

        /*
        java Pass By Value bir programlama dilidir.
        Bir primitive variable argument olarak bir methoda call edildiğinde variable değil bir copy clone edeğerigönderilir
         */
        //task->verilen fiyat için %24 artırılmış fiyatı prınt edn method create ediniz

        double fiyat=100;//primitive double type variable
        System.out.println("method call öncesi fiyat değeri = " + fiyat);//100
        fiyatArttır(fiyat);//fiyat variable method'a parametre call edildi //124
        System.out.println("method call sonrası fiyat değeri = " + fiyat);//100 pass by value

    }

    public static void fiyatArttır(double bişey){
        bişey*=1.24;
        System.out.println("arttırılmıs fiyat:"+bişey);
    }


}
