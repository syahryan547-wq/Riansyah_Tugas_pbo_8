class Faktorial {
    int n;

    Faktorial(int n){
        this.n = n;
    }

    int hitung(){
        int hasil = 1;
        for(int i = 1; i <= n; i++){
            hasil *= i;
        }
        return hasil;
    }
}

public class Soal1_Faktorial {
    public static void main(String[] args) {
        Faktorial f = new Faktorial(5);
        System.out.println("Faktorial = " + f.hitung());
    }
}
