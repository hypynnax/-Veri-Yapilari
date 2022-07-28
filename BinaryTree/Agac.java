package binarytree;

public class Agac {

    private Dugum root = null;
    private int derinlik = 0;

    /**
     * Add metodu ağaca eleman ekleme işlemini yapar.
     */
    void add(Dugum dugum) {
        if (root == null) {
            root = dugum;
        } else {
            Dugum temp = root;
            while (temp != null) {
                if (temp.compareTo(dugum) < 0) {
                    if (temp.getRight() == null) {
                        temp.setRight(dugum);
                        return;
                    } else {
                        temp = temp.getRight();
                    }
                } else {
                    if (temp.getLeft() == null) {
                        temp.setLeft(dugum);
                        return;
                    } else {
                        temp = temp.getLeft();
                    }
                }
            }
        }
    }

    /**
     * Derinlik bul metodu agacın derinliğini bulur ve geriye integer bir değer
     * döndürür.
     */
    int derinlikBul() {
        derinlik = 0;
        int tempDerinlik = 0;
        derinlik(root, tempDerinlik);
        return derinlik;
    }

    private void derinlik(Dugum root, int tempDerinlik) {
        if (root != null) {
            if (root.getLeft() != null || root.getRight() != null) {
                tempDerinlik++;
                derinlik(root.getLeft(), tempDerinlik);
                derinlik(root.getRight(), tempDerinlik);
            } else {
                derinlik = tempDerinlik;
            }
        }
    }

    /**
     * Yükseklik bul metodu gelen düğüm tipindeki nesnenin bulunduğu yüksekliği
     * bulur ve yazdırır.
     */
    void yukseklikBul(Dugum dugum) {
        int yukseklik = 0;
        int derinik = derinlikBul();
        int dugumDerinik = dugumDerinligiBul(dugum);
        yukseklik = derinik - dugumDerinik;
        System.out.println(yukseklik);
    }

    private int dugumDerinligiBul(Dugum dugum) {
        derinlik = 0;
        int tempDerinlik = 0;
        dugumDerinligi(root, tempDerinlik, dugum);
        return derinlik;
    }

    private void dugumDerinligi(Dugum root, int tempDerinlik, Dugum dugum) {
        if (root != null) {
            if (root.getLeft() != dugum && root.getRight() != dugum) {
                tempDerinlik++;
                dugumDerinligi(root.getLeft(), tempDerinlik, dugum);
                dugumDerinligi(root.getRight(), tempDerinlik, dugum);
            } else {
                tempDerinlik++;
                derinlik = tempDerinlik;
            }
        }
    }

    /**
     * Parent bul metodu gelen düğüm tipindeki nesnenin üst elemanını bulur ve
     * ekrana yazdırır.
     */
    void parentBul(Dugum dugum) {
        parent(root, dugum);
    }

    private void parent(Dugum parent, Dugum dugum) {
        if (parent != null) {
            if (parent.getLeft() == dugum || parent.getRight() == dugum) {
                System.out.println(parent);
                return;
            } else {
                parent(parent.getLeft(), dugum);
                parent(parent.getRight(), dugum);
            }
        }
    }

    /**
     * Yazdırma işlemleri için gerekli metotlar preOrder metodu ilk veri sonra
     * verinin sol ve sağındaki değerleri yazdırmakla yapılır inOrder metodu ilk
     * verinin solu sonra veri ve en son sağındaki değerler yazılır postOrder
     * metodu ise ilk verinin sol ve sağındaki değerler yazılır ve sonunda veri
     * yazılır.
     */
    private void preOrder(Dugum dugum) {
        if (dugum != null) {
            System.out.println(dugum.getVeri());
            preOrder(dugum.getLeft());
            preOrder(dugum.getRight());
        }
    }

    private void inOrder(Dugum dugum) {
        if (dugum != null) {
            inOrder(dugum.getLeft());
            System.out.println(dugum.getVeri());
            inOrder(dugum.getRight());
        }
    }

    private void postOrder(Dugum dugum) {
        if (dugum != null) {
            postOrder(dugum.getLeft());
            postOrder(dugum.getRight());
            System.out.println(dugum.getVeri());
        }
    }

    void yazdir() {
        Dugum temp = root;
        preOrder(temp);
        System.out.println("*************");
        inOrder(temp);
        System.out.println("*************");
        postOrder(temp);
    }
}
