package tekyonludaireselbagliliste;

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
            tail = dugum;
        }
    }

    void arayaEkle(Dugum dugum, int indis) {
        Dugum temp = null;
        Dugum tempSonrasi = head;
        if (indis == 1) {
            dugum.next = head;
            tail.next = dugum;
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
            tail.next = head;
        } else if (indis == i) {
            while (tempSonrasi.next != head) {
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            tail = temp;
            tail.next = head;
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
        }
    }

    void yazdir() {
        Dugum temp = head;
        System.out.print("baş->");
        do {
            System.out.print(temp.veri + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("son");
    }
}
