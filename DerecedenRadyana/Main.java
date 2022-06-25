package derecedenradyana;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Cember cember = new Cember();
        cember.ekle();
        int secim = 0;
        while (secim != 3) {
            System.out.println("1- Çemberin tüm derece değerlerini yazdır");
            System.out.println("2- Seçili derecenin değerini yazdır");
            System.out.println("3- ÇIKIŞ");
            System.out.print("Bir seçim yapın : ");
            secim = reader.nextInt();
            switch (secim) {
                case 1:
                    cember.yazdir();
                    break;
                case 2:
                    System.out.print("Radyanını istediğiniz dereceyi giriniz : ");
                    int derece = reader.nextInt();
                    cember.seciliYazdirma(derece);
                    break;
                case 3:
                    secim = 3;
                    break;
                default:
                    System.out.println("Lütfen geçerli bir sayı girin");
            }
        }
    }
}
