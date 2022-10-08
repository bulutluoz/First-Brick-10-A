package day03_dataTurleri;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {

        // kullanicidan bir dikdortgenin 2 kenarini isteyip, alanini hesaplayin

        Scanner scan= new Scanner(System.in);

        System.out.println("Lutfen dikdorgenin kenar uzunluklarini girin");

        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        double alan= kenar1*kenar2;

        System.out.println("Girilen dikdortgenin alani : " + alan);
    }
}
