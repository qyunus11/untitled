import java.util.Scanner;

/*
    char a, b;
    a = 'b';
System.out.println(a);  // Çıktı: b
    b = 'c';
System.out.println(b);  // Çıktı: c
    a = b;
System.out.println(a);  // Çıktı: c
*/

//    char symbol = '7';
//    System.out.println((int)symbol);  // Çıktı: 55
public class nyplab {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan taban ve yükseklik değerlerini al
        System.out.print("Tabanı giriniz: ");
        double base = input.nextDouble();

        System.out.print("Yüksekliği giriniz: ");
        double height = input.nextDouble();

        // double değerlerle alan hesapla
        double areaDouble = (base * height) / 2.0;
        System.out.println("double olarak üçgenin alanı: " + areaDouble);

        // int değerlerle alan hesapla (precision loss)
        int baseInt = (int) base;
        int heightInt = (int) height;
        double areaInt = (baseInt * heightInt) / 2.0;
        System.out.println("int olarak üçgenin alanı: " + areaInt);

        // Precision kaybını hesapla
        double precisionLoss = areaDouble - areaInt;
        System.out.println("Precision loss’dan dolayı değer kaybı: (" + areaDouble + " - " + areaInt + ") = " + precisionLoss);
    }




}
