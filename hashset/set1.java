package OOP.hashset;

import java.util.HashSet;

public class set1 {
    //hashset adalah menyimpan sebuah data dengan metode hash setiap set data
    //dapat menyimpan satu set data sesuai tipe data dari object set
    //berbeda dnegan map yang konfigurasinya key-value
    public static void main(String[] args) {
    // create object
    HashSet<Integer>object1= new HashSet<>();
    //add items gunakan add
    object1.add(10);
    object1.add(20);
    object1.add(30);
    object1.add(40);

    System.out.println(object1);
    //Check item gunakan contains
    System.out.println(object1.contains(10));
    System.out.println(object1.contains(0));
    //remove item gunakan remove
    System.out.println(object1.remove(40));
    System.out.println(object1);
    //Hapus semua data
    HashSet<String>object2= new HashSet<>();
    object2.add("aku");
    object2.add("Kamu");
    object2.add("Love");
    object2.clear();
    System.out.println(object2);
    //untuk mengetahui size gunakan size
    System.out.println(object1.size());
    //loop for akses
        for (int i : object1){
            System.out.println(i);
        }
        
    }
}
