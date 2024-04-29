public class Programmer implements Karyawan {
    private String nama;
    private int gajiPokok;

    public Programmer(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    @Override
    public String infoKaryawan() {
        return "Programmer: " + nama + " - Gaji Pokok: " + gajiPokok;
    }

    @Override
    public void hitungGaji() {
        System.out.println("Gaji " + nama + ": " + gajiPokok);
    }
}
