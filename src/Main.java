import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Merhabalar! Vücut Kitle İndeksi Hesaplama Programına Hoşgeldiniz.");
        int boy;
        double kilo, vki;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen cm cinsinde boyunuzu giriniz (Örn; 170) : ");
        boy = input.nextInt();

        System.out.print("Lütfen kg cinsinde kilonuzu giriniz (Örn; 75) : ");
        kilo = input.nextInt();

        if (kilo < 0 || boy <= 0) {
            System.out.print("Negatif bir değer girdiğinizden program sonuçlandırılmıştır.");
        } else {
            vki = kilo / ((boy / 100.0) * (boy / 100.0));
            System.out.println("Vücut Kitle İndeksiniz : " + vki);

            if (vki > 0 && vki <= 18.5) {
                System.out.println("Durum : Zayıf");
            } else if (vki > 18.5 && vki <= 24.9) {
                System.out.println("Durum : Normal Kilolu");
            } else if (vki > 24.9 && vki <= 29.9) {
                System.out.println("Durum : Fazla Kilolu");
            } else if (vki > 29.9 && vki <= 34.9) {
                System.out.println("Durum : Obez");
            } else if (vki > 34.9 && vki <= 39.9) {
                System.out.println("Durum : Aşırı Obez");
            } else if (vki > 39.9) {
                System.out.println("Durum : Morbid Obez");
            }

        }

    }
}