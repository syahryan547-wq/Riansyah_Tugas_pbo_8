package Tugas8;

class Biner {
    int n;

    Biner(int n){
        this.n = n;
    }

    String konversi(){
        String hasil = "";
        int temp = n;

        while(temp > 0){
            hasil = (temp % 2) + hasil;
            temp /= 2;
        }
        return hasil;
    }
}

public class Soal3_Biner {
    public static void main(String[] args) {
        Biner b = new Biner(25);
        System.out.println("Biner: " + b.konversi());
    }
}