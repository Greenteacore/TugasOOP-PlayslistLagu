public class Entity {
    private String name; // Nama entitas

    public Entity(String name) {
        this.name = name; // Menginisialisasi nama entitas
    }

    public String getName() {
        return name; // Mengembalikan nama entitas
    }

    public void setName(String name) {
        this.name = name; // Mengubah nama entitas
    }

    public void play() {
        // Implementasi default untuk memutar entitas
        System.out.println("Playing entity: " + name);
    }
}
