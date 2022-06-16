package ciftyonludaireselbagliliste;

public class Liste {

    Dugum head = null;
    Dugum tail = null;

    void basaEkle(Dugum dugum) {
        if (head == null) {
            head = dugum;
            tail = dugum;
        } else {
            dugum.next = head;
            tail.next = dugum;
            dugum.prive = tail;
            head.prive = dugum;
            head = dugum;
        }
    }

    void sonaEkle(Dugum dugum) {
        if (head == null) {
            head = dugum;
            tail = dugum;
        } else {
            tail.next = dugum;
            dugum.next = head;
            head.prive = dugum;
            dugum.prive = tail;
            tail = dugum;
        }
    }

    void arayaEkle(Dugum dugum, int indis) {
        Dugum temp = null;
        Dugum tempSonrasi = head;
        if (indis == 1) {
            dugum.next = head;
            tail.next = dugum;
            dugum.prive = tail;
            head.prive = dugum;
            head = dugum;
        } else {
            int i = 1;
            while (i != indis) {
                i++;
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            dugum.next = tempSonrasi;
            temp.next = dugum;
            dugum.prive = temp;
            tempSonrasi.prive = dugum;
        }
    }

    void bastanSil() {
        if (head == null) {
            System.out.println("Boş liste");
        } else if (head == tail) {
            head = null;
            tail = null;
            System.out.println("Son eleman silindi");
        } else {
            head = head.next;
            head.prive = tail;
            tail.next = head;
        }
    }

    void sondanSil() {
        if (head == null) {
            System.out.println("Boş liste");
        } else if (head == tail) {
            head = null;
            tail = null;
            System.out.println("Son eleman silindi");
        } else {
            Dugum temp = null;
            Dugum tempSonrasi = head;
            while (tempSonrasi.next != head) {
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            tail = temp;
            tail.next = head;
            head.prive = tail;
        }
    }

    void aradanSil(int indis) {
        Dugum temp = head;
        Dugum tempSonrasi = head.next;
        int i = 0;
        if (temp == tail) {
            i++;
        } else if (temp != null) {
            i++;
            while (tempSonrasi != head) {
                i++;
                tempSonrasi = tempSonrasi.next;
            }
        }
        if (indis == 1) {
            head = head.next;
            head.prive = tail;
            tail.next = head;
        } else if (indis == i) {
            while (tempSonrasi.next != head) {
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            tail = temp;
            tail.next = head;
            head.prive = tail;
        } else {
            temp = null;
            tempSonrasi = head;
            int j = 1;
            while (j != indis) {
                j++;
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            temp.next = tempSonrasi.next;
            tempSonrasi.next.prive = temp;
        }
    }

    void duzYazdir() {
        Dugum temp = head;
        System.out.print("baş->");
        do {
            System.out.print(temp.veri + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("son");
    }

    void tersYazdir() {
        Dugum temp = tail;
        System.out.print("son->");
        do {
            System.out.print(temp.veri + "->");
            temp = temp.prive;
        } while (temp != tail);
        System.out.println("baş");
    }
}
