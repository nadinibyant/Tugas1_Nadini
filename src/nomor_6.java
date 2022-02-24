import java.util.ArrayList;

public class nomor_6 {
    public static void main(String[] args) {
        String[] nama = { "b", "y", "a", "n" };

        ArrayList<String> nama2 = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            nama2.add(nama[i]);
        }

        // add()
        nama2.add(0, "e");
        System.out.println("Hasil setelah add (0,e) : " + nama2);

        nama2.add(2, "f");
        System.out.println("Hasil setelah add (2,f) : " + nama2);

        nama2.add(3, "g");
        System.out.println("Hasil setelah add (3,g) : " + nama2);

        nama2.add(4, "h");
        System.out.println("Hasil setelah add (4,h) : " + nama2);

        nama2.add(6, "h");
        System.out.println("Hasil setelah add (6,h) : " + nama2);

        nama2.add(-3, "j");
        System.out.println("Hasil setelah add (-3,j) : " + nama2);

    }
}