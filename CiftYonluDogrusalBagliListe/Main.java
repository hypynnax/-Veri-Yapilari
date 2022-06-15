package ciftyonludogrusalbagliliste;

public class Main {

    public static void main(String[] args) {
        Liste liste = new Liste();
        Dugum dugum1 = new Dugum(1);
        Dugum dugum2 = new Dugum(2);
        Dugum dugum3 = new Dugum(3);
        Dugum dugum4 = new Dugum(4);
        Dugum dugum5 = new Dugum(5);
        liste.duzYazdir();
        liste.sonaEkle(dugum3);
        liste.sonaEkle(dugum4);
        liste.sonaEkle(dugum5);
        liste.duzYazdir();
        liste.basaEkle(dugum2);
        liste.basaEkle(dugum1);
        liste.duzYazdir();
        liste.bastanSil();
        liste.duzYazdir();
        liste.sondanSil();
        liste.duzYazdir();
        liste.arayaEkle(dugum1, 1);
        liste.duzYazdir();
        liste.aradanSil(1);
        liste.duzYazdir();
        liste.tersYazdir();
    }
}
