package tekyonludaireselbagliliste;

public class Main {

    public static void main(String[] args) {
        Liste liste = new Liste();
        Dugum dugum1 = new Dugum(1);
        Dugum dugum2 = new Dugum(2);
        Dugum dugum3 = new Dugum(3);
        Dugum dugum4 = new Dugum(4);
        Dugum dugum5 = new Dugum(5);
        liste.basaEkle(dugum4);
        liste.basaEkle(dugum3);
        liste.basaEkle(dugum2);
        liste.basaEkle(dugum1);
        liste.sonaEkle(dugum5);
        liste.yazdir();
        liste.bastanSil();
        liste.yazdir();
        liste.sondanSil();
        liste.yazdir();
        liste.arayaEkle(dugum1, 1);
        liste.yazdir();
        liste.aradanSil(4);
        liste.yazdir();
    }
}
