package day05_wrapperClass;

public class WrapperClass03_Character {

    public static void main(String[] args) {

        String str="Java 23 Guzeldir";

        System.out.println(str.charAt(1)); // a

        // 5.index'deki karakter bir harf mi ?

        System.out.println(Character.isLetter(str.charAt(5))); // false
        // 4.index'deki karakter bir sayi mi ?

        System.out.println(Character.isDigit(str.charAt(4))); // false
        // 4.index space mi ?

        System.out.println(Character.isWhitespace(str.charAt(4))); // true
    }
}
