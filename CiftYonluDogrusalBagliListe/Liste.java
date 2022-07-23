package ciftyonludogrusalbagliliste;

public class Liste {

    Dugum head = null;
    Dugum tail = null;

    void basaEkle(Dugum dugum) {
        if (head == null) {
            head = dugum;
            tail = dugum;
        } else {
            dugum.next = head;
            head.prev = dugum;
            head = dugum;
        }
    }

    void sonaEkle(Dugum dugum) {
        if (head == null) {
            head = dugum;
            tail = dugum;
        } else {
            tail.next = dugum;
            dugum.prev = tail;
            tail = dugum;
        }
    }

    void arayaEkle(Dugum dugum, int indis) {
        Dugum temp = head;
        Dugum tempSonrasi = head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        if (indis == 1) {
            dugum.next = head;
            head.prev = dugum;
            head = dugum;
        } else if (indis == i + 1) {
            tail.next = dugum;
            dugum.prev = tail;
            tail = dugum;
        } else {
            int j = 1;
            while (j != indis) {
                j++;
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            dugum.prev = temp;
            temp.next = dugum;
            dugum.next = tempSonrasi;
            tempSonrasi.prev = dugum;
        }
    }

    void bastanSil() {
        Dugum temp = head;
        if (head == null) {
            System.out.println("Liste boş");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev.next = null;
            head.prev = null;
        }
    }

    void sondanSil() {
        Dugum temp = head;
        if (head == null) {
            System.out.println("Liste boş");
        } else if (head.next == null) {
            head = null;
            tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
    }

    void aradanSil(int indis) {
        Dugum temp = head;
        Dugum tempSonrasi = head;
        int i = 0;
        while (temp != null) {
            i++;
            temp = temp.next;
        }
        if (indis == 1) {
            head = head.next;
            head.prev = null;
        } else if (indis == i) {
            tail = tail.prev;
            tail.next = null;
        } else {
            int j = 1;
            while (j != indis) {
                j++;
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            tempSonrasi.next.prev = temp;
            temp.next = tempSonrasi.next;
        }
    }

    void duzYazdir() {
        Dugum temp = head;
        System.out.print("baş->");
        while (temp != null) {
            System.out.print(temp.veri + "->");
            temp = temp.next;
        }
        System.out.println("son");
    }

    void tersYazdir() {
        Dugum temp = tail;
        System.out.print("son->");
        while (temp != null) {
            System.out.print(temp.veri + "->");
            temp = temp.prev;
        }
        System.out.println("baş");
    }
}
