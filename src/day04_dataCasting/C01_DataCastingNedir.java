package day04_dataCasting;

public class C01_DataCastingNedir {
    public static void main(String[] args) {

        /*
          java'da temelde 2 tur data turu vardir
          1- primitive data turleri
                - boolean  mantiksal ifadeleri depolar true/false
                - char     tek bir karakter alir ' ' ile kullanilir
                - byte
                - short
                - int
                - long tamsayi degerleri alir, saklanacak datanin buyuklugune gore biri kullanilir
                - float
                - double ondalikli sayi / reel sayi icerir.
          2- non-primitive  data turleri
                - String Metinsel ifadeler tasir

         */

        String isim= "Ali";
        //int a= isim; // bazi data turlerinin birbirine cevrilmesi mumkun degildir
                       // boyle bir atama yapilirsa java altini kirmizi cizer (CTE)
                       // boyle bir hata varken projemizde hicbir class calismaz

        // isim=false; isim String turunden oldugundan boolean false'u kabul etmez


        int sayi=10;
        double dbl=sayi;

        double sayi2= 20;
        short sh1=(short) sayi2;

        // primitive data turlerinden sayi iceren data turleri birbirine donusturulebilir
        // Ancak bazilari otomatik olarak donusurken bazilarinda bizim mudahele etmemiz gerekir.

        // byte-short-int-long-float-double

        int sayi3 = 20;

        double sayi4= sayi3;

        //             int


        long sayi5= sayi3;
        //          int

        /*
           daha dar kapsamli data turundeki degeri
           daha genis kapsamli data turundeki variable'a atama yaparsak
           Java bu islemi otomatik olarak yapar
           buna aiuto-widening - otomatik genisletme
         */


        short sayi6= 23;

        int sayi7= sayi6; // int, degerin data turu olan short'dan daha kapsamli
        long sayi8= sayi6; // long, degerin data turu olan short'dan daha kapsamli
        sayi4= sayi8; // sayi4 double, double, deger olan sayi8'in data turu long'dan daha kapsamli


    }
}
