package day03_dataTurleri;

import java.util.Scanner;

public class scanner1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz");

        String kullaniciIsmi= scan.nextLine();
        /*
          metinsel bir ifadeyi kod ortamina almak icin scan.next( ) veya scan.nextLine( ) kullanilir
          next( )  sadece 1 kelime alir (ilk space'e kadar)
          nextLine( ) ise o satirda yazilan tum metni alir
         */

        System.out.println("Girilen kullanici ismi : " + kullaniciIsmi);
    }
}
