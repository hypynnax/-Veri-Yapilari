package baglilistedekaydirma;

public class Liste {

    Dugum head = null;
    Dugum tail = null;

    void elemanEkle(Dugum dugum) {
        if (head == null) {
            head = dugum;
            tail = dugum;
        } else {
            tail.next = dugum;
            dugum.prev = tail;
            tail = dugum;
            tail.next = head;
            head.prev = tail;
        }
    }

    void sagaKaydir(int tekrar) {
        for (int i = 1; i <= tekrar; i++) {
            head = head.prev;
        }
        tail = head.prev;
    }

    void solaKaydir(int tekrar) {
        for (int i = 1; i <= tekrar; i++) {
            head = head.next;
        }
        tail = head.prev;
    }

    void yazdir() {
        Dugum temp = head;
        System.out.print("baş ->");
        do {
            System.out.print(temp.veri + "->");
            temp = temp.next;
        } while (temp != head);
        System.out.println("son");
    }
}
