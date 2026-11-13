package manajemenHotel;

public class KamarTidakTersediaException extends Exception {
    public KamarTidakTersediaException(String pesan) {
        super(pesan);
    }
}