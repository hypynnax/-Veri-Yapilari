package baglilisteyitekecifteayirma;

import java.util.Iterator;
import java.util.LinkedList;

public class BagliListeyiTekeCifteAyirma {

    public static void main(String[] args) {
        LinkedList<Integer> liste = new LinkedList<>();
        LinkedList<Integer> teklerinListesi = new LinkedList<>();
        LinkedList<Integer> ciftlerinListesi = new LinkedList<>();
        listeyiDoldur(liste);
        listeyiTekeCifteAyir(liste, teklerinListesi, ciftlerinListesi);
        System.out.println("Rastgele oluşturulan bağlı liste");
        System.out.println(liste);
        System.out.println("Bağlı listedeki tek sayılar");
        System.out.println(teklerinListesi);
        System.out.println("Bağlı listedeki çift sayılar");
        System.out.println(ciftlerinListesi);
    }

    public static void listeyiDoldur(LinkedList<Integer> liste) {
        while (liste.size() < 20) {
            int rastgele = (int) (Math.random() * 100 + 1);
            if (!liste.contains(rastgele)) {
                liste.push(rastgele);
            }
        }
    }

    private static void listeyiTekeCifteAyir(LinkedList<Integer> liste, LinkedList<Integer> teklerinListesi, LinkedList<Integer> ciftlerinListesi) {
        Iterator<Integer> iterator = liste.listIterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 == 0) {
                ciftlerinListesi.push(next);
            } else {
                teklerinListesi.push(next);
            }
        }
    }
}
