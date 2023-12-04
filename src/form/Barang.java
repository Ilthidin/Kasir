package form;

public class Barang {
    private String kodeBarang;
    private String namaBarang;
    private String merkBarang;
    private String jenisBarang;
    private int harga;
    private int stock;

    public Barang() {
    }

    public Barang(String kodeBarang, String namaBarang, String merkBarang, String jenisBarang, int harga, int stock) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.merkBarang = merkBarang;
        this.jenisBarang = jenisBarang;
        this.harga = harga;
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Barang{" +
                "kodeBarang='" + kodeBarang + '\'' +
                ", namaBarang='" + namaBarang + '\'' +
                ", merkBarang='" + merkBarang + '\'' +
                ", jenisBarang='" + jenisBarang + '\'' +
                ", harga=" + harga +
                ", stock=" + stock +
                '}';
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }

    public String getNamaBarang() {
        return namaBarang;
    }

    public void setNamaBarang(String namaBarang) {
        this.namaBarang = namaBarang;
    }

    public String getMerkBarang() {
        return merkBarang;
    }

    public void setMerkBarang(String merkBarang) {
        this.merkBarang = merkBarang;
    }

    public String getJenisBarang() {
        return jenisBarang;
    }

    public void setJenisBarang(String jenisBarang) {
        this.jenisBarang = jenisBarang;
    }

    public int getHarga() {
        return harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
