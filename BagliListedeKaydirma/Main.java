package baglilistedekaydirma;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Liste liste = new Liste();
        for (int i = 1; i < 10; i++) {
            Dugum dugum = new Dugum(i);
            liste.elemanEkle(dugum);
        }
        liste.yazdir();
        System.out.print("Listeyi sağa mı? sola mı? kaydırmak istediğinizi yazın:");
        String yon = reader.nextLine();
        System.out.print("Kaç adım kaydırmak istediğinizi yazın:");
        int adim = reader.nextInt();
        if (yon.equalsIgnoreCase("sag")) {
            liste.sagaKaydir(adim);
            liste.yazdir();
        } else if (yon.equalsIgnoreCase("sol")) {
            liste.solaKaydir(adim);
            liste.yazdir();
        } else {
            System.out.println("Lütfen sadece sağ ve ya sol yazın");
        }
    }
}
