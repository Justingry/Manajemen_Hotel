package manajemenHotel;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.UUID;

public class Main {
    static ArrayList<Kamar> daftarKamar = new ArrayList<>();
    static ArrayList<Reservasi> daftarReservasi = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Inisialisasi Data Awal - 3 Kamar per Tipe
        
        // Kamar Standard
        daftarKamar.add(new KamarStandard("101", "2 orang"));
        daftarKamar.add(new KamarStandard("102", "2 orang"));
        daftarKamar.add(new KamarStandard("103", "2 orang"));

        // Kamar Deluxe
        daftarKamar.add(new KamarDeluxe("201", "2 orang"));
        daftarKamar.add(new KamarDeluxe("202", "2 orang"));
        daftarKamar.add(new KamarDeluxe("203", "2 orang"));

        // Kamar Suite
        daftarKamar.add(new KamarSuite("301", "4 orang"));
        daftarKamar.add(new KamarSuite("302", "4 orang"));
        daftarKamar.add(new KamarSuite("303", "4 orang"));

        // Kamar Presidential
        daftarKamar.add(new KamarPresidential("401", "6 orang"));
        daftarKamar.add(new KamarPresidential("402", "6 orang"));
        daftarKamar.add(new KamarPresidential("403", "6 orang"));
        
        boolean isRunning = true;
        
        while (isRunning) {
            try {
                System.out.println("\n================================");
                System.out.println("| SISTEM MANAJEMEN KAMAR HOTEL |");
                System.out.println("================================");
                System.out.println("1. Login Customer");
                System.out.println("2. Login Admin");
                System.out.println("3. Keluar");
                System.out.print("Pilihan: ");
                
                int pilihan = input.nextInt();
                input.nextLine();

                if (pilihan == 1) {
                    menuCustomer();
                } else if (pilihan == 2) {
                    menuAdmin();
                } else if (pilihan == 3) {
                    isRunning = false;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Input harus berupa angka.");
                input.nextLine(); 
            } catch (Exception e) {
                System.out.println("\n[ERROR] Terjadi kesalahan: " + e.getMessage());
            } finally {
                System.out.println("\nMemuat antarmuka...");
            }
        }
    }

    static void menuCustomer() {
        while (true) {
            try {
                System.out.println("\n--- MENU CUSTOMER ---");
                System.out.println("1. Lihat Kamar Tersedia");
                System.out.println("2. Pesan Kamar");
                System.out.println("3. Kembali");
                System.out.print("Pilih: ");
                int pil = input.nextInt();
                input.nextLine();

                if (pil == 1) {
                    for (Kamar k : daftarKamar) {
                        if (k.isTersedia()) {
                            k.tampilkanFasilitas();
                        }
                    }
                } else if (pil == 2) {
                    System.out.print("Nomor Kamar yang dipesan: ");
                    String noKamar = input.nextLine();
                    
                    Kamar kamarDipilih = null;
                    for (Kamar k : daftarKamar) {
                        if (k.getNomorKamar().equals(noKamar)) {
                            kamarDipilih = k;
                            break;
                        }
                    }

                    if (kamarDipilih == null) {
                        throw new Exception("Nomor kamar tidak ditemukan dalam sistem.");
                    }

                    System.out.print("Tanggal Check-In (DD/MM/YYYY): ");
                    String tglIn = input.nextLine();
                    System.out.print("Tanggal Check-Out (DD/MM/YYYY): ");
                    String tglOut = input.nextLine();
                    System.out.print("Lama Menginap (Malam): ");
                    int lama = input.nextInt();
                    input.nextLine();

                    String kodeRes = UUID.randomUUID().toString().substring(0, 6).toUpperCase();
                    
                    Reservasi res = new Reservasi(kodeRes, kamarDipilih, tglIn, tglOut, lama);
                    res.prosesReservasi();
                    daftarReservasi.add(res);
                    
                } else if (pil == 3) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Masukkan data angka yang valid.");
                input.nextLine();
            } catch (KamarTidakTersediaException e) {
                System.out.println("\n[ERROR RESERVASI] " + e.getMessage());
            } catch (Exception e) {
                System.out.println("\n[ERROR] " + e.getMessage());
            } finally {
                System.out.println("Selesai memproses sesi Customer.");
            }
        }
    }

    static void menuAdmin() {
        while (true) {
            try {
                System.out.println("\n--- MENU ADMIN ---");
                System.out.println("1. Rekap Data Reservasi");
                System.out.println("2. Lihat Semua Kamar");
                System.out.println("3. Edit Fasilitas Kamar");
                System.out.println("4. Ubah Harga Kamar");
                System.out.println("5. Kembali");
                System.out.print("Pilih: ");
                int pil = input.nextInt();
                input.nextLine();

                if (pil == 1) {
                    System.out.println("\n[ DATA RESERVASI ]");
                    for (Reservasi r : daftarReservasi) {
                        r.tampilkanInfo();
                        r.tampilkanLayananUtama();
                    }
                    System.out.println("Total Reservasi Aktif: " + Reservasi.getJumlahReservasi());
                } else if (pil == 2) {
                    for (Kamar k : daftarKamar) {
                        k.tampilkanFasilitas();
                    }
                    System.out.println("Kamar Tersedia Saat Ini: " + Kamar.getTotalKamar());
                } else if (pil == 3) {
                    System.out.print("Masukkan Nomor Kamar: ");
                    String no = input.nextLine();
                    for (Kamar k : daftarKamar) {
                        if (k.getNomorKamar().equals(no)) {
                            System.out.print("Fasilitas Baru: ");
                            k.setFasilitas(input.nextLine());
                            System.out.println("Fasilitas berhasil diperbarui.");
                        }
                    }
                } else if (pil == 4) {
                    System.out.print("Masukkan Tipe Kamar (Standard/Deluxe/Suite/Presidential): ");
                    String tipe = input.nextLine();
                    System.out.print("Harga Baru per Malam: ");
                    double harga = input.nextDouble();
                    input.nextLine();
                    
                    for (Kamar k : daftarKamar) {
                        if (k.getTipeKamar().equalsIgnoreCase(tipe)) {
                            k.setHargaPerMalam(harga);
                        }
                    }
                    System.out.println("Harga berhasil diperbarui.");
                } else if (pil == 5) {
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("\n[ERROR] Masukkan pilihan menu berupa angka.");
                input.nextLine();
            } finally {
                System.out.println("Selesai memproses sesi Admin.");
            }
        }
    }
}
