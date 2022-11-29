package AbstractClass;

public class Persegi extends BangunDatar {
    private float panjang;
    private float lebar;

    public Persegi(String warna, float panjang, float lebar) {
        super.warna = warna;
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public void gambar() {
        System.out.println("Gambar Persegi\t: "+getWarna());
    }

    @Override
    public float luas() {
        return (panjang * lebar);
    }
}