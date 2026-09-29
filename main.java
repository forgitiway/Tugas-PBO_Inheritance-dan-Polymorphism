public class main {

    public static void main(String[] args) {

        System.out.println("====================================");
        System.out.println("       INFORMASI BENTUK");
        System.out.println("====================================");

        bentuk[] daftarBentuk = {
            new bentuk("Merah"),
            new bujurSangkar(5, "Biru"),
            new lingkaran(7, "Hijau"),
            new Silinder(10, 7, "Kuning")
        };

        for (bentuk b : daftarBentuk) {
            System.out.println();
            b.printInfo();
            System.out.println("------------------------------------");
        }
    }
}