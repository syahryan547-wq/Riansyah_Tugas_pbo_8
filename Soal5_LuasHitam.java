package Tugas8;

class PersegiPanjang {
    int p, l;

    PersegiPanjang(int p, int l){
        this.p = p;
        this.l = l;
    }

    int luas(){
        return p * l;
    }
}

public class Soal5_LuasHitam {
    static int hitungLuasHitam(PersegiPanjang luar, PersegiPanjang dalam){
        return luar.luas() - dalam.luas();
    }

    public static void main(String[] args) {
        PersegiPanjang luar = new PersegiPanjang(10, 10);
        PersegiPanjang dalam = new PersegiPanjang(8, 5);

        int hasil = hitungLuasHitam(luar, dalam);

        System.out.println("Luas bidang hitam = " + hasil);
    }
}