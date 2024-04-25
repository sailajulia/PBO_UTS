public class Perpustakaan {
    public static void main(String[] args) {
        Buku buku1 = new Buku("Kisah 25 nabi dan rasul", "Erna fitriani");
        BukuFiksi buku2 = new BukuFiksi("Harry Potter", "J.K. Rowling", "Fantasi");
        BukuNonFiksi buku3 = new BukuNonFiksi("Lost islamic history", "Firas alkhateeb", "Sejarah");

        System.out.println(buku1.info());
        System.out.println(buku2.info());
        System.out.println(buku3.info());
    }
}
