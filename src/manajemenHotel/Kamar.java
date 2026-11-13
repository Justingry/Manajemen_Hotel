package manajemenHotel;

public class Kamar extends Hotel {
    private String NomorKamar;
    private String TipeKamar;
    private String JenisKasur;
    private double hargaPerMalam;
    private String fasilitas;
    private boolean isTersedia;
    private static int totalKamar = 0;

    public Kamar(String NomorKamar, String TipeKamar, String JenisKasur, double hargaPerMalam, String fasilitas) {
        super("Hotel Grand Nusantara", "Jl. Merdeka No. 10", "Layanan Kamar & Menginap");
        this.NomorKamar = NomorKamar;
        this.TipeKamar = TipeKamar;
        this.JenisKasur = JenisKasur;
        this.hargaPerMalam = hargaPerMalam;
        this.fasilitas = fasilitas;
        this.isTersedia = true;
        totalKamar++;
    }

    @Override
    public void tampilkanLayananUtama() {
        System.out.println("Fokus Layanan: Menyediakan kenyamanan penginapan dan fasilitas kamar.");
    }

    public static int getTotalKamar() { return totalKamar; }
    public String getNomorKamar() { return NomorKamar; }
    public String getTipeKamar() { return TipeKamar; }
    public String getJenisKasur() { return JenisKasur; }
    public double getHargaPerMalam() { return hargaPerMalam; }
    public void setHargaPerMalam(double hargaPerMalam) { this.hargaPerMalam = hargaPerMalam; }
    public String getFasilitas() { return fasilitas; }
    public void setFasilitas(String fasilitas) { this.fasilitas = fasilitas; }
    public boolean isTersedia() { return isTersedia; }
    
    public void setTersedia(boolean isTersedia) { 
        this.isTersedia = isTersedia; 
        if(!isTersedia) totalKamar--; else totalKamar++;
    }

    public void tampilkanFasilitas() {
        System.out.println("[-] Kamar " + TipeKamar + " (" + NomorKamar + ")");
        System.out.println("    Fasilitas: " + fasilitas);
        System.out.println("    Harga: Rp" + hargaPerMalam + " | Status: " + (isTersedia ? "Tersedia" : "Dipesan") + "\n");
    }
}
