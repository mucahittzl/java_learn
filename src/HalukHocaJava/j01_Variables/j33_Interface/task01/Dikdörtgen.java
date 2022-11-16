package HalukHocaJava.j01_Variables.j33_Interface.task01;

public class Dikdörtgen implements Sekil{


    @Override
    public int cevre(int... boyut) {
        if (boyut.length==1){//varargs a girilen parametre 1 tane ise kare alanı hesapla
            return (boyut[0]*4);
        }else //varargs a girilen parametre 1 tane değilse dikdörtgen cevre hesapla
            return (boyut[0]+boyut[1])*2;
    }

    @Override
    public int alan(int... boyut) {

        if (boyut.length==1){//varargs a girilen parametre 1 tane ise kare alanı hesapla
            return (boyut[0]*boyut[0]);
        }else return (boyut[0]*boyut[1]);

    }
}

