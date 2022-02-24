import java.util.ArrayList;

public class nomor_4 {
    public static void main(String[] args) {
        String[] nama = { "b", "y", "a", "n" };

        ArrayList<String> nama2 = new ArrayList<>();
        for (int i = 0; i < nama.length; i++) {
            nama2.add(nama[i]);
        }

        // indexof()
        System.out.println("index dari elemen a : " + nama2.indexOf("a"));
        System.out.println("index dari elemen c : " + nama2.indexOf("c"));
        System.out.println("index dari elemen q : " + nama2.indexOf("q"));
        // -1 = tidak terdapat pada array
    }
}