package j18_Constructor;

public class C01_Constructor {
    /*
    1- constructor ismi class name ile aynı olmalıBuyuk harf ile baslamalı
    2- constructor create edildiginde name den sonra () {} mutlaka kullanılmalı
    3- eğer parametreli coons. create edilirse java default constructoru siler.
    4- constructor un return type'si olmaz. methoddan ayıran ozelliğidir
    5- Class olustugunda java default constructoru kendı create eder.
     */

    String str;
    String selam="güzel insan";
  //  C01_Constructor obj1=new C01_Constructor();
    public static void main(String[] args) {
        //class name   obj name   new keyword          default cons.
        C01_Constructor   obj1    =   new           C01_Constructor();
        C01_Constructor   obj2    =   new           C01_Constructor();
        C01_Constructor   obj3    =   new           C01_Constructor();
        C01_Constructor   obj4    =   new           C01_Constructor();

        obj1.str="javacan";//str ins varıable obj1 ile call edilerek obj1 degeri atandı
        obj2.str="javatar";//str ins varıable obj2 ile call edilerek obj1 degeri atandı
        System.out.println(obj3.selam);//"güzel insan"
        System.out.println(obj1.str);//javacan
        System.out.println(obj2.str);//javatar
        System.out.println(obj4.str);//atama yapılmadığı ıcın default degerını verır null

        obj3.aga();//aga methodu çalısır içindekini verir. ""agama selam""
        obj2.aga();


    }
    public static void aga(){
        System.out.println("agama selam");
    }
}
