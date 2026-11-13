package manajemenHotel;

public class KamarDeluxe extends Kamar {
    private String bathup = "Bathup";
    private String balkon = "Balkon";

    public KamarDeluxe(String NomorKamar, String JenisKasur) {
        super(NomorKamar, "Deluxe", JenisKasur, 500000.0, "AC, TV, Kasur, Kamar Mandi");
        setFasilitas(getFasilitas() + ", " + bathup + ", " + balkon);
    }
}
