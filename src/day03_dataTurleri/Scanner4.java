package day03_dataTurleri;

import java.util.Scanner;

public class Scanner4 {
    public static void main(String[] args) {

        /*
         Kullanicidan ismini, soyismini ve yasini alip
          Ismi kucuk harflerle, soyismi buyuk harflerle asagidaki formmatta yazdirin

          isim-soyisim : ali KARA
          yas : 16
          kaydiniz basariyla olusturuldu

         */

        Scanner scan = new Scanner(System.in);

        System.out.println("isminizi girin");

        String kullaniciAdi= scan.nextLine().toLowerCase();

        System.out.println("soyisminizi giriniz");

        String kullaniciSoyadi= scan.nextLine().toUpperCase();

        System.out.println("yasinizi girin");

        double yas= scan.nextDouble();


        System.out.println("isim-soyisim : " + kullaniciAdi + " " + kullaniciSoyadi);
        System.out.println("yas : " + yas);
        System.out.println("kaydiniz basariyla olusturuldu");


    }
}
