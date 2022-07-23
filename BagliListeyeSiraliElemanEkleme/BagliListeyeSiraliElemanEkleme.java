package baglilisteyesiralielemanekleme;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BagliListeyeSiraliElemanEkleme {

    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        listeyiDoldur(liste);
        listeyiSirala(liste);
        System.out.println(liste);
        listeyeElemanEkleme(liste);
        System.out.println(liste);
    }

    public static void listeyiDoldur(List<Integer> liste) {
        while (liste.size() < 10) {
            int rastgele = (int) (Math.random() * 100 + 1);
            if (!liste.contains(rastgele)) {
                liste.add(rastgele);
            }
        }
    }

    private static void listeyiSirala(List<Integer> liste) {
        for (int i = 0; i < liste.size(); i++) {
            int kucukEleman = liste.get(i);
            int kucukElemanIndeksi = i;
            int temp = kucukEleman;
            for (int j = i + 1; j < liste.size(); j++) {
                if (liste.get(j) < kucukEleman) {
                    kucukEleman = liste.get(j);
                    kucukElemanIndeksi = j;
                }
            }
            liste.remove(i);
            liste.add(i, kucukEleman);
            liste.remove(kucukElemanIndeksi);
            liste.add(kucukElemanIndeksi, temp);
        }
    }

    private static void listeyeElemanEkleme(List<Integer> liste) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Kaç eleman girmek istediğinizi girin : ");
        int tekrarSayisi = reader.nextInt();
        int tekrar = 0;
        while (tekrar != tekrarSayisi) {
            System.out.print("Listeye eklemek istediğiniz sayıyı girin : ");
            int sayi = reader.nextInt();
            liste.add(sayi);
            listeyiSirala(liste);
            tekrar++;
        }
    }
}
