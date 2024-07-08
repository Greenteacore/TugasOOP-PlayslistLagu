import java.util.Scanner;

public class InputHelper {
    private Scanner scanner; // Scanner untuk membaca input dari pengguna

    public InputHelper(Scanner scanner) {
        this.scanner = scanner; // Menginisialisasi scanner
    }

    public String getInput(String prompt) {
        // Menampilkan prompt ke pengguna
        System.out.print(prompt);
        
        // Membaca input dari pengguna
        return scanner.nextLine();
    }
}
