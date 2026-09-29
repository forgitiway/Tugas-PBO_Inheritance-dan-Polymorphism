public class Silinder extends lingkaran {

    private double tinggi;

    public Silinder(double tinggi, double radius, String warna) {
        super(radius, warna);
        this.tinggi = tinggi;
    }

    public double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    public double hitungVolume() {
        return hitungLuas() * tinggi;
    }

    @Override
    public void printInfo() {
        System.out.println("Silinder");
        System.out.println("Warna  : " + getWarna());
        System.out.println("Radius : " + getRadius());
        System.out.println("Tinggi : " + getTinggi());
        System.out.println("Volume : " + hitungVolume());
    }
}