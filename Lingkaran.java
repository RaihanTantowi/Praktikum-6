package AbstractClass;

public class Lingkaran extends BangunDatar {
    private int r;

    public Lingkaran(String warna, int r) {
        super.warna = warna;
        this.r = r;
    }

    @Override
    public void gambar() {
        System.out.println("Gambar Lingkaran: "+getWarna());
    }


    @Override
    public float luas() {
        return (float) (Math.PI * r * r);
    }
}
