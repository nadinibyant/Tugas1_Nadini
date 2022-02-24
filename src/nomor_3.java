import java.util.ArrayList;

public class nomor_3 {
    public static void main(String[] args) {
        String[] nama = { "b", "y", "a", "n" };

        ArrayList<String> nama2 = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            nama2.add(nama[i]);
        }

        // get()
        System.out.println("value data nama index ke-0 : " + nama2.get(0));
        System.out.println("value data nama index ke-0 : " + nama2.get(6));
        System.out.println("value data nama index ke-0 : " + nama2.get(-3));
    }
}
