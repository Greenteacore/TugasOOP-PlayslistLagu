import java.util.ArrayList;
import java.util.List;

public class Playlist extends Entity {
    private List<Song> songs; // Daftar lagu dalam playlist

    public Playlist(String name) {
        super(name); // Memanggil konstruktor superclass untuk mengatur nama playlist
        this.songs = new ArrayList<>(); // Menginisialisasi daftar lagu
    }

    public List<Song> getSongs() {
        return songs; // Mengembalikan daftar lagu dalam playlist
    }

    public void addSong(Song song) {
        songs.add(song); // Menambahkan lagu ke dalam playlist
    }

    @Override
    public void play() {
        // Memutar semua lagu dalam playlist
        System.out.println("Playing playlist: " + getName());
        for (Song song : songs) {
            song.play(); // Memutar setiap lagu dalam playlist
        }
    }
}
