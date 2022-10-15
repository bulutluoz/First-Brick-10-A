package day04_dataCasting;

public class C02_DataCasting {
    public static void main(String[] args) {

        int sayi1= 23;
        int sayi2= 150;
        int sayi3= 567895;

        byte sayi4= (byte)sayi1;
        System.out.println("byte kaydedilen 23 : " + sayi4); // 23

        byte sayi5= (byte) sayi2 ;
        System.out.println("byte kaydedilen 150 : " + sayi5); // -106

        short sayi6= (short)sayi2;
        System.out.println("short kaydedilen 150 : " + sayi6); // 150

        byte sayi7= (byte)sayi3;
        System.out.println("byte kaydedilen 567895 : " + sayi7); // 87

        short sayi8 = (short)sayi3;
        System.out.println("short kaydedilen 567895 : " + sayi8); // -21929

        //
    }
}
