package manajemenHotel;

public class main {
    public static void main(String[] args) {

        KamarStandard Kamar101 = new KamarStandard("101", "2 orang");
        KamarStandard Kamar102 = new KamarStandard("102", "2 orang");
        KamarStandard Kamar103 = new KamarStandard("103", "2 orang");
        KamarStandard Kamar104 = new KamarStandard("104", "2 orang");
        KamarStandard Kamar105 = new KamarStandard("105", "2 orang");
        
        KamarDeluxe Kamar201 = new KamarDeluxe("201", "2 orang");
        KamarDeluxe Kamar202 = new KamarDeluxe("202", "2 orang");
        KamarDeluxe Kamar203 = new KamarDeluxe("203", "2 orang");
        KamarDeluxe Kamar204 = new KamarDeluxe("204", "2 orang");
        KamarDeluxe Kamar205 = new KamarDeluxe("205", "2 orang");

        KamarSuite Kamar301 = new KamarSuite("301", "4 orang");
        KamarSuite Kamar302 = new KamarSuite("302", "4 orang");
        KamarSuite Kamar303 = new KamarSuite("303", "4 orang");
        KamarSuite Kamar304 = new KamarSuite("304", "4 orang");
        KamarSuite Kamar305 = new KamarSuite("305", "4 orang");

        KamarPresidential Kamar401 = new KamarPresidential("401", "6 orang");
        KamarPresidential Kamar402 = new KamarPresidential("402", "6 orang");
        KamarPresidential Kamar403 = new KamarPresidential("403", "6 orang");
        KamarPresidential Kamar404 = new KamarPresidential("404", "6 orang");
        KamarPresidential Kamar405 = new KamarPresidential("405", "6 orang");
        
        Reservasi res1 = new Reservasi("2026101", Kamar101);
        Reservasi res2 = new Reservasi("2026102", Kamar102);
        Reservasi res3 = new Reservasi("2026201", Kamar203, 500000.0);
        Reservasi res4 = new Reservasi("2026401", Kamar405, 1000000.0);
        Reservasi res5 = new Reservasi("2026302", Kamar302, 750000.0);

        System.out.println("============================================================================================================================================================================");
        System.out.println("|                                                                   SISTEM MANAJEMEN KAMAR HOTEL                                                                           |");
        System.out.println("============================================================================================================================================================================\n");

        System.out.println("[ INFORMASI HOTEL ]");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("| Nama Hotel   : " + Kamar101.getNamaHotel());
        System.out.println("| Alamat Hotel : " + Kamar101.getAlamatHotel());
        System.out.println("============================================================================================================================================================================\n");

        System.out.println("[ INFORMASI FASILITAS KAMAR ]");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        Kamar101.tampilkanFasilitas();
        Kamar201.tampilkanFasilitas();
        Kamar301.tampilkanFasilitas();
        Kamar401.tampilkanFasilitas();

        System.out.println("============================================================================================================================================================================\n");
        
        System.out.println("[ DATA RESERVASI ]");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        res1.tampilkanInfo();
        res2.tampilkanInfo();
        res3.tampilkanInfo();
        res4.tampilkanInfo();
        res5.tampilkanInfo();

        System.out.println("\n[+] TOTAL RESERVASI: " + Reservasi.getJumlahReservasi());
        System.out.println("============================================================================================================================================================================\n");
    }
}
