package j26_Inheritance.Inheritance02;

import j26_Inheritance.Inheritance02.Kedi;



public class Runner {

    public static void main(String[] args) {

        Kedi k1=new Kedi();

        System.out.println("k1.a = " + k1.a);//0->Hayvancık class call
        System.out.println("k1.c = " + k1.c);//2->Kedi class call
        System.out.println("k1.d = " + k1.d);//5->kedi class call
        System.out.println("k1.m = " + k1.m);//1->Mammal class call

/*
  Ayni isimli variable'lardan hangisinin kullanildi
olusturulan object'in data type'ina göre bilinir
Variable'i arastirmaya data type'i classindan baslanır.
*/


        k1.mA();//hayvancık class call
        k1.mC();//kedi class tan call
        k1.mM();//Mammal class call

        /*
 Method cagirilirken ayni isimli methodlardan
 hangisinin kullanilacagina Constructor karar verir.
 Methodlari arastirmaya Consctuctor ismini tasiyan
 class'dan baslayin ve parentlarda arastirmaya devam edin.
 */




        Mammal k2 = new Kedi("kevser");//Data Type-> Parent Mammal Class Cons. -> p'li kedi Class
        System.out.println("k2.c = " + k2.c);
        System.out.println("k2.a = " + k2.a);
        System.out.println("k2.m = " + k2.m);
        k2.mA();
        k2.mC();
        k2.mM();



        Hayvancık k3=new Kedi();
        System.out.println("k3.m = " + k3.m);
        System.out.println("k3.a = " + k3.a);
        //k3.c->Datatype Hayvancık Class oldugu için class'da olmayan
        k3.mA();
        k3.mM();

        Mammal m1=new Mammal('$');
        System.out.println("m1.m = " + m1.m);//1
        System.out.println("m1.a = " + m1.a);//0
        System.out.println("m1.c = " + m1.c);//4
        //m1.d ->parent Mammal Class Child Kedi Class'dan variable call edemez
        m1.mA();//Hayvancık Class call
        m1.mC();//Mammal Class call
        m1.mM();//Mammal Class call


    }

    }




