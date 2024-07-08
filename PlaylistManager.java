import java.util.ArrayList;
import java.util.List;

public class PlaylistManager {
    private List<Playlist> playlists; // Daftar semua playlist

    public PlaylistManager() {
        playlists = new ArrayList<>(); // Menginisialisasi daftar playlist
    }

    public void addPlaylist(InputHelper inputHelper) {
        // Membaca nama playlist dari pengguna
        String name = inputHelper.getInput("Enter playlist name: ");
        
        // Menambahkan playlist baru ke daftar
        playlists.add(new Playlist(name));
        
        // Menampilkan pesan sukses
        System.out.println("Playlist '" + name + "' added.");
    }

    public void addSongToPlaylist(InputHelper inputHelper) {
        // Membaca nama playlist dari pengguna
        String playlistName = inputHelper.getInput("Enter playlist name: ");
        
        // Mencari playlist berdasarkan nama
        Playlist playlist = findPlaylistByName(playlistName);

        if (playlist != null) {
            // Jika playlist ditemukan, membaca detail lagu
            String songTitle = inputHelper.getInput("Enter song title: ");
            String songArtist = inputHelper.getInput("Enter song artist: ");
            
            // Menambahkan lagu ke dalam playlist
            playlist.addSong(new Song(songTitle, songArtist));
            
            // Menampilkan pesan sukses
            System.out.println("Song added to playlist '" + playlistName + "'.");
        } else {
            // Jika playlist tidak ditemukan, menampilkan pesan error
            System.out.println("Playlist not found.");
        }
    }

    public void playSongFromPlaylist(InputHelper inputHelper, MusicPlayer musicPlayer) {
        // Membaca nama playlist dari pengguna
        String playlistName = inputHelper.getInput("Enter playlist name: ");
        
        // Mencari playlist berdasarkan nama
        Playlist playlist = findPlaylistByName(playlistName);

        if (playlist != null) {
            // Jika playlist ditemukan, membaca judul lagu yang ingin diputar
            String songTitle = inputHelper.getInput("Enter song title to play: ");
            
            // Mencari lagu dalam playlist
            Song song = findSongByTitle(playlist, songTitle);

            if (song != null) {
                // Jika lagu ditemukan, memutar lagu
                musicPlayer.play(song);
            } else {
                // Jika lagu tidak ditemukan, menampilkan pesan error
                System.out.println("Song not found in the playlist.");
            }
        } else {
            // Jika playlist tidak ditemukan, menampilkan pesan error
            System.out.println("Playlist not found.");
        }
    }

    private Playlist findPlaylistByName(String name) {
        // Mencari playlist berdasarkan nama
        for (Playlist playlist : playlists) {
            if (playlist.getName().equalsIgnoreCase(name)) {
                return playlist; // Mengembalikan playlist jika ditemukan
            }
        }
        return null; // Mengembalikan null jika tidak ditemukan
    }

    private Song findSongByTitle(Playlist playlist, String title) {
        // Mencari lagu berdasarkan judul dalam playlist
        for (Song song : playlist.getSongs()) {
            if (song.getName().equalsIgnoreCase(title)) {
                return song; // Mengembalikan lagu jika ditemukan
            }
        }
        return null; // Mengembalikan null jika tidak ditemukan
    }
}
