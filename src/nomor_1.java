
// package untuk akses araylist
import java.util.ArrayList;

public class nomor_1 {
    public static void main(String[] args) {
        String[] nama = { "b", "y", "a", "n" };

        // masukan data nama ke list array baru (nama2) -> bisa akses method
        ArrayList<String> nama2 = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            nama2.add(nama[i]);
        }

        // IsEmpty()
        for (int i = 0; i < nama.length; i++) {
            System.out.println("data index ke-" + i + " : " + nama2.isEmpty());
        }

    }
}
