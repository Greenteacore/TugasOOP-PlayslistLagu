public class Song extends Entity {
    private String artist; // Nama artis

    public Song(String title, String artist) {
        super(title); // Mengatur judul lagu sebagai nama lagu menggunakan superclass
        this.artist = artist; // Menginisialisasi nama artis
    }

    public String getArtist() {
        return artist; // Mengembalikan nama artis
    }

    public void setArtist(String artist) {
        this.artist = artist; // Mengubah nama artis
    }

    @Override
    public void play() {
        // Memutar lagu
        System.out.println("Playing song: " + getName() + " by " + artist);
    }
}
