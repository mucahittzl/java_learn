package HalukHocaJava.j01_Variables.j02_DataTypes_WrapperClass;

public class C01_VariablesCreate {

    public static void main(String[] args) {
        // 1.yol->best practise(Recomended)tavsiye edilen
        int yas=48;
        int maaş=33000;
        System.out.println("yas");//yas
        System.out.println(yas);//48
        System.out.println(maaş);//33000
        System.out.println("nur hanım başlangıç maaşı : "+maaş);//33000
        //2. yol
        int boy ; //değeri atanmayan boy isminde bir int tanımlandı declaration
        //System.out.println(boy);//değeri atanmamış değişkeni hiç bir aksiyonda kullanılamaz
        boy=175;
        System.out.println("boyunuz:"+boy);


        //3. yol
        int yevmiye,age,kilo; //birden çok aynı tipte değişken tanımlandı
        age=33;
        yevmiye=1000;
        kilo=99;//tanımlanan değişkenlere değer ataması yapıldı

        int gunluk=1500, yıl=2022, agırlık=99;
        //TRİCK bir variable sadece bir kez tanımlanabilir ama birden çok değer atanabilir
        System.out.println(gunluk);//1500
        gunluk=1800;//gunluk değeri yeni değeri 1800 olarak atandı
        System.out.println("gunluk son değeri :"+gunluk);//1800
        System.out.println("gunluk değeri:"+gunluk+"yıl"+"yevmiye"+"agırlık");
    }


}
