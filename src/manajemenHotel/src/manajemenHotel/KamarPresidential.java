package manajemenHotel;

class KamarPresidential extends Kamar {
    private String Jacuzzi = ", Jacuzzi";
    private String KamarTerpisah = ", Kamar Terpisah";
    private String MiniBar = ", Mini Bar";
    private String RuangMakan = ", Ruang Makan";
    private String RuangTamu = ", Ruang Tamu";
    private String WalkInCloset = ", Walk In Closet";
    private String Balkon =  ", Balkon.";
    
    public KamarPresidential(String NomorKamar, String JenisKasur){
        super (NomorKamar, "President", JenisKasur);
    }
    
    public String getFasilitasKamarPresident(){
        return getFasilitasDasar() + Jacuzzi + KamarTerpisah + MiniBar + RuangMakan + RuangTamu + WalkInCloset + Balkon;
    }

    @Override
    public void tampilkanFasilitas(){
        System.out.println("[-] Kamar Presidential(P401 - P405)");
        System.out.println("    Fasilitas: " + getFasilitasKamarPresident() + "\n");
    }
}
