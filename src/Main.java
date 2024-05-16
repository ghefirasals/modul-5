import java.util.ArrayList;
import java.util.Scanner;

class InputNama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> namaMahasiswa = new ArrayList<>();
        int jumlahNama = 5;

        for (int i = 1; i <= jumlahNama; i++) {
            System.out.print("Masukkan nama ke-" + i + ": ");
            String nama = scanner.nextLine().trim();

            while (nama.isEmpty()) {
                System.out.println("Nama tidak boleh kosong!");
                System.out.print("Masukkan nama ke-" + i + ": ");
                nama = scanner.nextLine().trim();
            }

            if (nama.equalsIgnoreCase("selesai")) {
                break;
            }

            namaMahasiswa.add(nama);
        }

        System.out.println("Daftar mahasiswa yang diinputkan:");
        for (String nama : namaMahasiswa) {
            System.out.println("- " + nama);
        }

        scanner.close();
    }
}