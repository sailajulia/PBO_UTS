public class BukuNonFiksi extends Buku {
    private String topik;

    public BukuNonFiksi(String judul, String pengarang, String topik) {
        super(judul, pengarang);
        this.topik = topik;
    }

    public String getTopik() {
        return topik;
    }

    @Override
    public String info() {
        return super.info() + ", Topik: " + topik;
    }
}
