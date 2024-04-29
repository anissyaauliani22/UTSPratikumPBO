public class Manager implements Karyawan {
    private String nama;
    private int gajiPokok;
    private int tunjangan;

    public Manager(String nama, int gajiPokok) {
        this.nama = nama;
        this.gajiPokok = gajiPokok;
        this.tunjangan = 1000;
    }

    @Override
    public String infoKaryawan() {
        return "Manager: " + nama + " - Gaji Pokok: " + gajiPokok;
    }

    @Override
    public void hitungGaji() {
        int totalGaji = gajiPokok + tunjangan;
        System.out.println("Gaji " + nama + ": " + totalGaji);
    }
}
