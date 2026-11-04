package manajemenHotel;

class KamarStandard extends Kamar{
    public KamarStandard(String NomorKamar, String JenisKasur){
        super(NomorKamar, "Standard", JenisKasur);
    }

    public String getFasilitasKamarStandard(){
        return getFasilitasDasar();
    }

    @Override // Menandakan method ini meng-override method tampilkanFasilitas() milik class Kamar
    public void tampilkanFasilitas(){
        System.out.println("[-] Kamar Standard(101 - 105)");
        System.out.println("    Fasilitas: " + getFasilitasKamarStandard() + "\n");
    }
}