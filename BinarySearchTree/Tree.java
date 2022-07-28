package binarysearchtree;

public class Tree {

    private Node root = null;
    private int derinlik = 0;

    /**
     * Add metodu ağaca eleman ekleme işlemini yapar.
     */
    void add(Node node) {
        if (root == null) {
            root = node;
        } else {
            Node temp = root;
            while (temp != null) {
                if (temp.compareTo(node) < 0) {
                    if (temp.getRight() == null) {
                        temp.setRight(node);
                        return;
                    } else {
                        temp = temp.getRight();
                    }
                } else {
                    if (temp.getLeft() == null) {
                        temp.setLeft(node);
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

    private void derinlik(Node root, int tempDerinlik) {
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
    void yukseklikBul(Node node) {
        int yukseklik = 0;
        int derinik = derinlikBul();
        int dugumDerinik = dugumDerinligiBul(node);
        yukseklik = derinik - dugumDerinik;
        System.out.println(yukseklik);
    }

    private int dugumDerinligiBul(Node node) {
        derinlik = 0;
        int tempDerinlik = 0;
        dugumDerinligi(root, tempDerinlik, node);
        return derinlik;
    }

    private void dugumDerinligi(Node root, int tempDerinlik, Node node) {
        if (root != null) {
            if (root.getLeft() != node && root.getRight() != node) {
                tempDerinlik++;
                dugumDerinligi(root.getLeft(), tempDerinlik, node);
                dugumDerinligi(root.getRight(), tempDerinlik, node);
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
    void parentBul(Node node) {
        parent(root, node);
    }

    private void parent(Node parent, Node node) {
        if (parent != null) {
            if (parent.getLeft() == node || parent.getRight() == node) {
                System.out.println(parent);
                return;
            } else {
                parent(parent.getLeft(), node);
                parent(parent.getRight(), node);
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
    private void preOrder(Node node) {
        if (node != null) {
            System.out.println(node.getData());
            preOrder(node.getLeft());
            preOrder(node.getRight());
        }
    }

    private void inOrder(Node node) {
        if (node != null) {
            inOrder(node.getLeft());
            System.out.println(node.getData());
            inOrder(node.getRight());
        }
    }

    private void postOrder(Node node) {
        if (node != null) {
            postOrder(node.getLeft());
            postOrder(node.getRight());
            System.out.println(node.getData());
        }
    }

    void yazdir() {
        Node temp = root;
        preOrder(temp);
        System.out.println("*************");
        inOrder(temp);
        System.out.println("*************");
        postOrder(temp);
    }
}
