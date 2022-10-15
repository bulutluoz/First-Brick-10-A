package day04_dataCasting;

public class C03_CharDataTuruAsciiTable {

    public static void main(String[] args) {

        char ilkHarf= 'a';
        char ikinciHarf= 'b';

        System.out.println(ilkHarf+ikinciHarf); // 195

        /*
         char data turundeki degiskenler matematiksel bir isleme girerse
         ascii tablosundaki degerlere gore davranirlar
         'a' = 97
         'b' = 98
         'a' + 'b' = 195
         */


        // 'k' harfinden sonraki 3 harfi yazdiralim

        System.out.println('k' + 1); // 108

        System.out.println((char)('k'+1)); // l


        System.out.println((char)('k'+2)); // m

        System.out.println((char)('k'+3)); // n
    }
}
