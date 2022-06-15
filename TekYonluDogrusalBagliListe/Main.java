package tekyonludogrusalbagliliste;

public class Main {

    public static void main(String[] args) {
        Liste liste = new Liste();
        Dugum dugum1 = new Dugum(1);
        Dugum dugum2 = new Dugum(2);
        Dugum dugum3 = new Dugum(3);
        Dugum dugum4 = new Dugum(4);
        Dugum dugum5 = new Dugum(5);
        liste.yazdir();
        liste.sonaEkle(dugum3);
        liste.sonaEkle(dugum4);
        liste.sonaEkle(dugum5);
        liste.yazdir();
        liste.basaEkle(dugum2);
        liste.basaEkle(dugum1);
        liste.yazdir();
        liste.bastanSil();
        liste.yazdir();
        liste.sondanSil();
        liste.yazdir();
        liste.arayaEkle(dugum1, 1);
        liste.yazdir();
        liste.aradanSil(1);
        liste.yazdir();
    }
}
