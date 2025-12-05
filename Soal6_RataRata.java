class Nilai {
    int[] data;

    Nilai(int[] data){
        this.data = data;
    }

    double rataRata(){
        int total = 0;
        for(int x : data){
            total += x;
        }
        return total * 1.0 / data.length;
    }
}

public class Soal6_RataRata {
    public static void main(String[] args) {
        int[] nilai = {80, 90, 70, 85};

        Nilai n = new Nilai(nilai);

        System.out.println("Rata-rata = " + n.rataRata());
    }
}