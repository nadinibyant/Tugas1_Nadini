import java.util.ArrayList;

public class nomor_2 {
    public static void main(String[] args) {
        String[] nama = { "b", "y", "a", "n" };

        ArrayList<String> nama2 = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            nama2.add(nama[i]);
        }

        // size()
        System.out.println("size dari data nama adalah : " + nama2.size());
    }
}
