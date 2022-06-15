package tekyonludogrusalbagliliste;

public class Liste {

    Dugum head = null;
    Dugum tail = null;

    void basaEkle(Dugum dugum) {
        if (head == null) {
            head = dugum;
            tail = dugum;
        } else {
            dugum.next = head;
            head = dugum;
        }
    }

    void sonaEkle(Dugum dugum) {
        if (head == null) {
            head = dugum;
            tail = dugum;
        } else {
            tail.next = dugum;
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
            head = dugum;
        } else if (indis == i+1) {
            tail.next = dugum;
            tail = dugum;
        } else {
            int j = 1;
            while (j != indis) {
                j++;
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
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Son eleman silindi");
        } else {
            head = head.next;
        }
    }

    void sondanSil() {
        if (head == null) {
            System.out.println("Boş liste");
        } else if (head.next == null) {
            head = null;
            tail = null;
            System.out.println("Son eleman silindi");
        } else {
            Dugum temp = null;
            Dugum tempSonrasi = head;
            while (tempSonrasi.next != null) {
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            tail = temp;
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
        } else if (indis == i) {
            while (tempSonrasi.next != null) {
                temp = tempSonrasi;
                tempSonrasi = tempSonrasi.next;
            }
            tail = temp;
            tail.next = null;
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
        while (temp != null) {
            System.out.print(temp.veri + "->");
            temp = temp.next;
        }
        System.out.println("son");
    }
}
