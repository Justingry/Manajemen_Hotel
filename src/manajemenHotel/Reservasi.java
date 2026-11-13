package manajemenHotel;

public class Reservasi extends Hotel implements Pesanable, Tagihan {
    private String kodeReservasi;
    private Kamar kamar;
    private double tarifPerMalam;
    private String tglCheckIn;
    private String tglCheckOut;
    private int lamaMenginap;
    private static int jumlahReservasi = 0;

    public Reservasi(String kodeReservasi, Kamar kamar, String tglCheckIn, String tglCheckOut, int lamaMenginap) throws KamarTidakTersediaException {
        super("Hotel Grand Nusantara", "Jl. Merdeka No. 10", "Layanan Reservasi Kamar");
        if (!kamar.isTersedia()) {
            throw new KamarTidakTersediaException("Kamar " + kamar.getNomorKamar() + " sedang tidak tersedia atau sudah dipesan.");
        }
        
        this.kodeReservasi = kodeReservasi;
        this.kamar = kamar;
        this.tarifPerMalam = kamar.getHargaPerMalam();
        this.tglCheckIn = tglCheckIn;
        this.tglCheckOut = tglCheckOut;
        this.lamaMenginap = lamaMenginap;
        
        kamar.setTersedia(false);
        jumlahReservasi++;
    }

    @Override
    public void tampilkanLayananUtama() {
        System.out.println("Fokus Layanan: Mengurus pendataan pelanggan dan tagihan.");
    }

    @Override
    public void prosesReservasi() {
        System.out.println("Status: Reservasi kode " + kodeReservasi + " berhasil dikonfirmasi ke sistem.");
    }

    @Override
    public double hitungTotalTagihan() {
        return tarifPerMalam * lamaMenginap;
    }

    public static int getJumlahReservasi() { return jumlahReservasi; }

    public void tampilkanInfo() {
        System.out.println("| KODE RESERVASI : " + kodeReservasi);
        System.out.println("| No. Kamar      : " + kamar.getNomorKamar() + " (" + kamar.getTipeKamar() + ")");
        System.out.println("| Check-in       : " + tglCheckIn);
        System.out.println("| Check-out      : " + tglCheckOut);
        System.out.println("| Lama Menginap  : " + lamaMenginap + " malam");
        System.out.println("| Total Tagihan  : Rp" + hitungTotalTagihan());
        System.out.println("--------------------------------------------------");
    }
}
