package manajemenHotel;

public class KamarSuite extends Kamar {
    private String ruangTamu = "Ruang Tamu";
    private String balkon = "Balkon";
    private String bathup = "Bathup";

    public KamarSuite(String NomorKamar, String JenisKasur) {
        super(NomorKamar, "Suite", JenisKasur, 750000.0, "AC, TV, Kasur, Kamar Mandi");
        setFasilitas(getFasilitas() + ", " + ruangTamu + ", " + balkon + ", " + bathup);
    }
}
