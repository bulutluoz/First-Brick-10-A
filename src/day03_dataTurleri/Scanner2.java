package day03_dataTurleri;

import java.util.Scanner;

public class Scanner2 {
    public static void main(String[] args) {
        // kullanicidan dairenin yaricapini alip, cevresini hesaplayin

        // 1.adim - scanner objesi olustur
        Scanner scan = new Scanner(System.in);

        // 2.adim - kullanicidan ne istedigini yazdir
        System.out.println("Cemberin yaricapini girin");

        // 3.adim- kullanicinin girecegi datanin turune gore
        //         bir variable olusturupo, alinan degeri kaydedin

        double yaricap= scan.nextDouble();

        double cevre= 2 * 3.14 * yaricap;

        System.out.println("Cemberin cevresi : " + cevre);
    }
}
