package manajemenHotel;

public abstract class Hotel {
    private String namaHotel;
    private String alamatHotel;
    private String jenisLayanan;

    public Hotel(String namaHotel, String alamatHotel, String jenisLayanan){
        this.namaHotel = namaHotel;
        this.alamatHotel = alamatHotel;
        this.jenisLayanan = jenisLayanan;
    }

    public String getNamaHotel() {
        return namaHotel;
    }

    public String getAlamatHotel(){
        return alamatHotel;
    }

    public String getJenisLayanan(){
        return jenisLayanan;
    }

    public abstract void tampilkanLayananUtama();

    public void tampilkanHotel(){
        System.out.println("| Nama Hotel   : " + getNamaHotel());
        System.out.println("| Alamat Hotel : " + getAlamatHotel());
        System.out.println("| Layanan      : " + getJenisLayanan());
    }
}
