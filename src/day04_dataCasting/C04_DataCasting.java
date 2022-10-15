package day04_dataCasting;

public class C04_DataCasting {
    public static void main(String[] args) {

        int sayi1= 25;
        int sayi2= 10 ;

        System.out.println(sayi1 / sayi2 ); // 2


        double  sayi3= 10;

        System.out.println(sayi1 / sayi3); // int 25 / double 10 = 2.5

        double sayi4=5;

        System.out.println(sayi1 / sayi4); // int 25 / double 5 = 5.0

        // iki tamsayiyi birbirine bolup, sonucu ondalikli olarak yazin

        System.out.println(sayi1/sayi2); // int 25 / int 10 = 2

        double sonuc= sayi1 / sayi2 ;

        System.out.println(sonuc); // 2.0


        sonuc= (double)sayi1 / sayi2 ;

        System.out.println("ondalikli sonuc : " + sonuc);
    }
}
