package Tugas8;

class Pangkat {
    int angka, pangkat;

    Pangkat(int angka, int pangkat){
        this.angka = angka;
        this.pangkat = pangkat;
    }

    int hitung(){
        int hasil = 1;
        for(int i = 0; i < pangkat; i++){
            hasil *= angka;
        }
        return hasil;
    }
}

public class Soal2_Pangkat {
    public static void main(String[] args) {
        Pangkat p = new Pangkat(2, 5);
        System.out.println("Hasil pangkat = " + p.hitung());
    }
}