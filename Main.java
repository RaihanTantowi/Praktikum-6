package AbstractClass;

public class Main {
    public static void main(String[] args) {
        // membuat objek BangunDatar dari class Lingkaran
        BangunDatar Ling = new Lingkaran("Biru", 200);

        // membuat objek BangunDatar dari class Segitiga
        BangunDatar Seg = new Segitiga("Coklat",80, 40);

        // membuat objek BangunDatar dari class Persegi
        BangunDatar Pers = new Persegi("Kuning", 50, 60);

        /* memanggil method gambar & luas bangun datar */
        System.out.println("==========================");
        System.out.println("\tGambar Bangun Datar");
        System.out.println("==========================");
        Ling.gambar();
        Seg.gambar();
        Pers.gambar();
        System.out.println("==========================");
        System.out.println();
        System.out.println("==========================");
        System.out.println("\tLuas Bangun Datar");
        System.out.println("==========================");
        System.out.println("Luas Lingkaran\t: " + Ling.luas());
        System.out.println("Luas Segitiga\t: " + Seg.luas());
        System.out.println("Luas Persegi\t: " + Pers.luas());
        System.out.println("==========================");
    }
}


