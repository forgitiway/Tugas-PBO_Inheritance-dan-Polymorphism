public class main {

    public static void main(String[] args) {

        bentuk bentuk = new bentuk("Merah");
        System.out.println("Warna bentuk: " + bentuk.getWarna());

        bujurSangkar bujurSangkar = new bujurSangkar(5, "Biru");

        System.out.println("\n=== Bujur Sangkar ===");
        System.out.println("Warna: " + bujurSangkar.getWarna());
        System.out.println("Sisi: " + bujurSangkar.getSisi());
        System.out.println("Luas: " + bujurSangkar.hitungLuas());

        lingkaran lingkaran = new lingkaran(7, "Hijau");

        System.out.println("\n=== Lingkaran ===");
        System.out.println("Warna: " + lingkaran.getWarna());
        System.out.println("Radius: " + lingkaran.getRadius());
        System.out.println("Luas: " + lingkaran.hitungLuas());

        Silinder silinder = new Silinder(10, 7, "Kuning");

        System.out.println("\n=== Silinder ===");
        System.out.println("Warna: " + silinder.getWarna());
        System.out.println("Radius: " + silinder.getRadius());
        System.out.println("Tinggi: " + silinder.getTinggi());
        System.out.println("Volume: " + silinder.hitungVolume());
    }
}