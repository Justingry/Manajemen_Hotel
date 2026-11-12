package manajemenHotel;

class Kamar extends Hotel{
    private String NomorKamar;
    private String TipeKamar;
    private String JenisKasur;
    private static int totalKamar;;

    public Kamar(String NomorKamar, String TipeKamar, String JenisKasur){
        super("Hotel Grand Nusantara", "Jl. Merdeka No. 10", "Layanan Kamar & Menginap");
        this.NomorKamar = NomorKamar;
        this.TipeKamar = TipeKamar;
        this.JenisKasur = JenisKasur;
    }

    public static void kurangiTotalKamar(){
        if (totalKamar > 0){
            totalKamar--;
        }
    }

    public static int getTotalKamar(){
        return totalKamar;
    }

    public String getNomorKamar(){
        return NomorKamar;
    }

    public String getTipeKamar() {
        return TipeKamar;
    }

    public String getJenisKasur() {
        return JenisKasur;
    }

    public String getFasilitasDasar() {
        return "AC, TV, Kasur, Kamar Mandi";
    }

    // Method induk yang akan di-OVERRIDE oleh KamarStandard, Deluxe, Suite, dan Presidential
    public void tampilkanFasilitas(){
        System.out.println("Fasilitas Dasar Kamar: " + getFasilitasDasar());
    }
}