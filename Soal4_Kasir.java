class Kasir {
    int harga;
    int jumlah;
    int diskon;

    Kasir(int harga) {
        this.harga = harga;
        this.jumlah = 1;
        this.diskon = 0;
    }

    Kasir(int harga, int jumlah) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = 0;
    }

    Kasir(int harga, int jumlah, int diskon) {
        this.harga = harga;
        this.jumlah = jumlah;
        this.diskon = diskon;
    }

    int totalBayar() {
        return (harga * jumlah) - diskon;
    }
}

public class Soal4_Kasir {
    public static void main(String[] args) {
        Kasir k1 = new Kasir(10000);               // harga saja
        Kasir k2 = new Kasir(10000, 2);           // harga + jumlah
        Kasir k3 = new Kasir(10000, 3, 5000);     // lengkap

        System.out.println("Total 1 = " + k1.totalBayar());
        System.out.println("Total 2 = " + k2.totalBayar());
        System.out.println("Total 3 = " + k3.totalBayar());
    }
}