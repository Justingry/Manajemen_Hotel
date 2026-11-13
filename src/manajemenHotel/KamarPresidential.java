package manajemenHotel;

public class KamarPresidential extends Kamar {
    private String jacuzzi = "Jacuzzi";
    private String kamarTerpisah = "Kamar Terpisah";
    private String miniBar = "Mini Bar";
    private String ruangMakan = "Ruang Makan";
    private String ruangTamu = "Ruang Tamu";
    private String walkInCloset = "Walk In Closet";
    private String balkon = "Balkon";

    public KamarPresidential(String NomorKamar, String JenisKasur) {
        super(NomorKamar, "Presidential", JenisKasur, 1000000.0, "AC, TV, Kasur, Kamar Mandi");
        setFasilitas(getFasilitas() + ", " + jacuzzi + ", " + kamarTerpisah + ", " + miniBar + ", " + ruangMakan + ", " + ruangTamu + ", " + walkInCloset + ", " + balkon);
    }
}
