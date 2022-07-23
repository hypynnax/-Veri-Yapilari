package derecedenradyana;

import javax.swing.JOptionPane;

public class Cember {

    Radyan head = null;
    Radyan tail = null;

    void ekle() {
        int i = 1;
        while (i <= 360) {
            Radyan radyan = new Radyan(i);
            if (head == null) {
                head = radyan;
                tail = radyan;
            } else {
                tail.next = radyan;
                radyan.prev = tail;
                tail = radyan;
            }
            i++;
        }
        tail.next = head;
        head.prev = tail;
    }

    void yazdir() {
        Radyan temp = head;
        do {
            System.out.printf("%1.2f'nin radyanı : %1.2fπ\n", temp.derece, temp.radyan);
            temp = temp.next;
        } while (temp != head);
    }

    void seciliYazdirma(int indis) {
        Radyan temp = head;
        String message;
        int i = 1;
        if (indis == 0) {
            message = "0' radyanın karşılığı: " + temp.prev.radyan + "π";
            JOptionPane.showMessageDialog(null, message);
        } else {
            while (indis != i) {
                temp = temp.next;
                i++;
            }
            message = temp.derece + "' radyanın karşılığı: " + temp.radyan + "π";
            JOptionPane.showMessageDialog(null, message);
        }
    }
}
