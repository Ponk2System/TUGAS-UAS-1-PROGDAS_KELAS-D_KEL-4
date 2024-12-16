package tumpukan;

public class tumpukanGG {
    private node topGanjil;
    private node topGenap;

    public tumpukanGG() {
        topGanjil = null;
        topGenap = null;
    }

    public void push(Integer data) {
        if (data % 2 == 0) {
            topGenap = new node(data, topGenap);
        } else {
            topGanjil = new node(data, topGanjil);
        }
    }

    public Integer popganjil() {
        if (topGanjil != null) {
            Integer value = (Integer) topGanjil.getData();
            topGanjil = topGanjil.getPtr();
            return value;
        }
        return null;
    }

    public Integer popgenap() {
        if (topGenap != null) {
            Integer value = (Integer) topGenap.getData();
            topGenap = topGenap.getPtr();
            return value;
        }
        return null;
    }

    public void cetakganjil() {
        node current = topGanjil;
        System.out.print("Tumpukan Ganjil: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPtr();
        }
        System.out.println();
    }

    public void cetakgenap() {
        node current = topGenap;
        System.out.print("Tumpukan Genap: ");
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getPtr();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        tumpukanGG tumpukan = new tumpukanGG();
        tumpukan.push(4);
        tumpukan.push(7);
        tumpukan.push(10);
        tumpukan.push(3);
        tumpukan.push(2);
        tumpukan.push(5);

        tumpukan.cetakganjil();
        tumpukan.cetakgenap();

        System.out.println("Pop Ganjil: " + tumpukan.popganjil());
        System.out.println("Pop Genap: " + tumpukan.popgenap());

        tumpukan.cetakganjil();
        tumpukan.cetakgenap();
    }
}