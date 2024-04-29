import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Karyawan> daftarKaryawan = new ArrayList<>();

        // Tambahkan beberapa karyawan
        daftarKaryawan.add(new Manager("John", 5000));
        daftarKaryawan.add(new Programmer("Alice", 3000));
        daftarKaryawan.add(new Programmer("Bob", 2500));

        // Tampilkan daftar karyawan
        System.out.println("Daftar Karyawan:");
        for (Karyawan karyawan : daftarKaryawan) {
            System.out.println(karyawan.infoKaryawan());
        }

        // Tanyakan apakah ingin menghitung gaji karyawan
        System.out.print("\nApakah Anda ingin menghitung gaji karyawan? (ya/tidak): ");
        String jawaban = scanner.nextLine();

        if (jawaban.equalsIgnoreCase("ya")) {
            for (Karyawan karyawan : daftarKaryawan) {
                karyawan.hitungGaji();
            }
        } else {
            System.out.println("Terima kasih atas kunjungan Anda.");
        }
    }
}
