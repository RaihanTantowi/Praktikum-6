package AbstractClass;

public class Segitiga extends BangunDatar {
    private int alas;
    private int tinggi;

    public Segitiga(String warna, int alas, int tinggi) {
        super.warna = warna;
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public void gambar() {
        System.out.println("Gambar Segitiga\t: "+getWarna());
    }

    @Override
    public float luas() {
        return (float) (0.5 * alas * tinggi);
    }
}
