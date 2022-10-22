package day05_wrapperClass;

public class WrapperClass02_parseInteger {

    public static void main(String[] args) {

        String str1="120";
        String str2="130";

        // bu iki String'in icerdigi degerleri matematiksel olarak toplayin

        System.out.println(str1 + str2); // 2030

        // eger bir String ifade tamamen sayilardan olusuyorsa
        // bu String'i sayiya cevirebiliriz

        int toplamSonucu= Integer.parseInt(str1)+ Integer.parseInt(str2);

        System.out.println(toplamSonucu);


    }
}
