public class BukuFiksi extends Buku {
    private String genre;

    public BukuFiksi(String judul, String pengarang, String genre) {
        super(judul, pengarang);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String info() {
        return super.info() + ", Genre: " + genre;
    }
}
