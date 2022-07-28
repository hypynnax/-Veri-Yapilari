package binarytree;

public class Dugum implements Comparable {

    private int veri;
    private Dugum right;
    private Dugum left;

    public Dugum(int veri) {
        this.veri = veri;
        this.right = null;
        this.left = null;
    }

    public int getVeri() {
        return veri;
    }

    public void setVeri(int veri) {
        this.veri = veri;
    }

    public Dugum getRight() {
        return right;
    }

    public void setRight(Dugum right) {
        this.right = right;
    }

    public Dugum getLeft() {
        return left;
    }

    public void setLeft(Dugum left) {
        this.left = left;
    }

    @Override
    public String toString() {
        return veri + "";
    }

    @Override
    public int compareTo(Object object) {
        Dugum dugum = (Dugum) object;
        if (this.veri > dugum.veri) {
            return 1;
        } else if (this.veri < dugum.veri) {
            return -1;
        } else {
            return 0;
        }
    }
}
