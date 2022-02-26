import java.util.ArrayList;

public class nomor_5 {
    public static void main(String[] args) {
        String[] nama = { "b", "y", "a", "n" };

        ArrayList<String> nama2 = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            nama2.add(nama[i]);
        }
        // data sebelum remove
        System.out.println("data sebelum di remove : ");
        for (int i = 0; i < nama.length; i++) {
            System.out.println("data index ke - " + i + " : " + nama[i]);
        }


        // remove()
        nama2.remove(0);
        System.out.println("Hasil data setelah remove 0 : " + nama2);

        // nama2.remove(3);
        // System.out.println("Hasil data setelah remove 3 : " + nama2);

        nama2.remove(2);
        System.out.println("Hasil data setelah remove 2 : " + nama2);

    }
}
