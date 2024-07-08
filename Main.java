import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Membuat instance PlaylistManager untuk mengelola playlist
        PlaylistManager playlistManager = new PlaylistManager();
        
        // Membuat instance MusicPlayer untuk memutar lagu
        MusicPlayer musicPlayer = new MusicPlayer();
        
        // Membuat scanner untuk membaca input dari pengguna
        Scanner scanner = new Scanner(System.in);
        
        // Membuat instance InputHelper untuk membantu membaca input
        InputHelper inputHelper = new InputHelper(scanner);

        while (true) {
            // Menampilkan menu
            System.out.println("Menu:");
            System.out.println("1. Add Playlist");
            System.out.println("2. Add Song to Playlist");
            System.out.println("3. Play Song from Playlist");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            
            // Membaca pilihan pengguna
            int choice = scanner.nextInt();
            scanner.nextLine(); // konsumsi newline

            // Menjalankan aksi berdasarkan pilihan pengguna
            switch (choice) {
                case 1:
                    // Menambah playlist baru
                    playlistManager.addPlaylist(inputHelper);
                    break;
                case 2:
                    // Menambah lagu ke dalam playlist
                    playlistManager.addSongToPlaylist(inputHelper);
                    break;
                case 3:
                    // Memutar lagu dari playlist
                    playlistManager.playSongFromPlaylist(inputHelper, musicPlayer);
                    break;
                case 4:
                    // Keluar dari program
                    System.out.println("Exiting...");
                    return;
                default:
                    // Pilihan tidak valid
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}
