
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
 class Main {
    public static void main(String[] args) {
        Scanner rayya = new Scanner(System.in);


        System.out.println("Nama: ");
        String nama = rayya.nextLine();

        System.out.println("Jenis kelamin (L/P): ");
        char jenisKelamin = rayya.next().charAt(0);

        System.out.println("Tanggal lahir (format: yyyy-MM-dd): ");
        String tanggalLahirString = rayya.next();


        LocalDate tanggaLahir = LocalDate.parse(tanggalLahirString, DateTimeFormatter.ISO_DATE);


        LocalDate now = LocalDate.now();
        Period periode = Period.between(tanggaLahir,now);
        int umurTahun = periode.getYears();
        int umurBulan = periode.getMonths();


        String jenisKelaminLengkap = (jenisKelamin == 'L' || jenisKelamin == 'P') ? "Laki-laki" : "Perempuan";
        System.out.println("\nDate Diri: ");
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + jenisKelaminLengkap);
        System.out.println("Umur anda: " + umurTahun + "tahun" + umurBulan + "bulan");

    }
}