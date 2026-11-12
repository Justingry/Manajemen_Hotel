package manajemenHotel;

public class Reservasi extends Hotel {
    private String kodeReservasi;
    private Kamar kamar;
    private double tarifPerMalam;
    private static int jumlahReservasi = 0;

    public Reservasi(String kodeReservasi, Kamar kamar, double tarifPerMalam) {
        super("Hotel Grand Nusantara", "Jl. Merdeka No. 10", "Layanan Reservasi Kamar");
        this.kodeReservasi = kodeReservasi;
        this.kamar = kamar;
        setTarifPerMalam(tarifPerMalam);
        jumlahReservasi++;
        kamar.kurangiTotalKamar();
    }

    public Reservasi(String kodeReservasi, Kamar kamar) {
        super("Hotel Grand Nusantara", "Jl. Merdeka No. 10", "Layanan Reservasi Kamar");
        this.kodeReservasi = kodeReservasi;
        this.kamar = kamar;
        this.tarifPerMalam = 350000.0;
        jumlahReservasi++;
        kamar.kurangiTotalKamar();
    }

    public void setTarifPerMalam(double tarifPerMalam) {
        if (tarifPerMalam < 0) {
            System.out.println("Tarif tidak boleh negatif.");
        } else {
            this.tarifPerMalam = tarifPerMalam;
        }
    }

    public static int getJumlahReservasi() {
        return jumlahReservasi;
    }

    @Override // Meng-override method tampilkanHotel() dari class Hotel
    public void tampilkanHotel() {
        System.out.println("| Nama Hotel   : " + getNamaHotel());
        System.out.println("| Alamat Hotel : " + getAlamatHotel());
        System.out.println("| Divisi Sistem: " + getJenisLayanan());
    }

    public void tampilkanInfo() {
        System.out.println("| KODE RESERVASI : " + kodeReservasi);
        System.out.println("| No. Kamar      : " + kamar.getNomorKamar());
        System.out.println("| Tipe Kamar     : " + kamar.getTipeKamar());
        System.out.println("| Kapasitas Kasur: " + kamar.getJenisKasur());
        System.out.println("| Tarif / Malam  : Rp" + tarifPerMalam);
        System.out.println("--------------------------------------------------");
    }
}