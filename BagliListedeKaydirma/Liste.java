package baglilistedekaydirma;

public class Liste {

    Dugum heap = null;
    Dugum tail = null;

    void elemanEkle(Dugum dugum) {
        if (heap == null) {
            heap = dugum;
            tail = dugum;
        } else {
            tail.next = dugum;
            dugum.prive = tail;
            tail = dugum;
            tail.next = heap;
            heap.prive = tail;
        }
    }

    void sagaKaydir(int tekrar) {
        for (int i = 1; i <= tekrar; i++) {
            heap = heap.prive;
        }
        tail = heap.prive;
    }

    void solaKaydir(int tekrar) {
        for (int i = 1; i <= tekrar; i++) {
            heap = heap.next;
        }
        tail = heap.prive;
    }

    void yazdir() {
        Dugum temp = heap;
        System.out.print("baş ->");
        do {
            System.out.print(temp.veri + "->");
            temp = temp.next;
        } while (temp != heap);
        System.out.println("son");
    }
}
