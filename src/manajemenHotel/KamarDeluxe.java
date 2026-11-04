package manajemenHotel;

class KamarDeluxe extends Kamar{
    private String Bathup = ", Bathup";
    private String Balkon = ", Balkon."; 
    
    public KamarDeluxe(String NomorKamar, String JenisKasur){
        super (NomorKamar, "Deluxe", JenisKasur);
    }
    
    public String getFasilitasKamarDeluxe(){
        return getFasilitasDasar() + Bathup + Balkon;
    }

    @Override
    public void tampilkanFasilitas(){
        System.out.println("[-] Kamar Deluxe(D201 - D205)");
        System.out.println("    Fasilitas: " + getFasilitasKamarDeluxe() + "\n");
    }
}
