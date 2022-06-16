package ciftyonludaireselbagliliste;

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
        liste.duzYazdir();
        liste.bastanSil();
        liste.duzYazdir();
        liste.sondanSil();
        liste.duzYazdir();
        liste.arayaEkle(dugum1, 1);
        liste.duzYazdir();
        liste.aradanSil(4);
        liste.duzYazdir();
        liste.tersYazdir();
    }
}
