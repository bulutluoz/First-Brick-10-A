package day04_dataCasting;

import java.util.Scanner;

public class C05_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan bir karakter alip
        // ascii table'da o karakterden sonra gelen ilk 3 karakteri yazdirin

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen bir karakter giriniz");

        char girilenKarakter= scan.next().charAt(0);

        System.out.println("girilen karakter : " + girilenKarakter );

        System.out.println("girilen karakterden 1 sonra : " + (char)(girilenKarakter+1));

        System.out.println("girilen karakterden 2 sonra : " + (char)(girilenKarakter+2));

        System.out.println("girilen karakterden 3 sonra : " + (char)(girilenKarakter+3));
    }
}
