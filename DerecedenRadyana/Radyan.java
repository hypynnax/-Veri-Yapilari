package derecedenradyana;

public class Radyan {

    double derece, radyan;
    Radyan next;
    Radyan prive;

    public Radyan(double derece) {
        this.derece = derece;
        radyan = derece / 180;
        next = null;
        prive = null;
    }
}
