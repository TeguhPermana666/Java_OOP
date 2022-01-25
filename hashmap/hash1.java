package OOP.hashmap;
import java.util.HashMap;
//hahsmap digunakan untuk mengkonfigurasikan key - value
public class hash1{
    public static void main(String[] args) {
    //menyimpan item ke dalam key/value dan kamu bisa mengakses mereka
    //dari index ke satu tipe yang sama ataupun yg berbeda
    //bisa key dan value dengan tipe yang sama atau berbeda
    
    //Create object
    HashMap<String,String> object1= new HashMap<String,String>();
    //add item key - value dengan put sebagai methode
    object1.put("Denpasar", "Bali");
    object1.put("Nugini", "Papua");
    object1.put("Bandung", "Jawa Barat");
    object1.put("BABI","HARAM");
    System.out.println(object1);
    //Untuk mengakses value gunakan get dengan representasi dari key
    System.out.println(object1.get("Denpasar"));
    //Untuk menghapus sebuah value gunakan remove dengan representasi dari key
    object1.remove("BABI");
    System.out.println(object1);
    //jika ingin menghapus semua gunakan clear
    HashMap<String,String>object2= new HashMap<>();
    object2.put("Kontol", "PRIA");
    object2.put("HAI", "SALAM");
    object2.clear();
    //mengetahui size dari hashmap dengan size
    int jumlah=object1.size();
    System.out.println(jumlah);
    
    // Mencetak dengan foreach
    /*
    1. gunakan keyset untuk menampilkan key 
    2.gunaan values untuk menampilkan values
    3.gunakan keyset dan get value untuk menampilkan key dan values
    */   
    System.out.println("MENAMPILKAN KEYSET");
    for(String i : object1.keySet()){
        System.out.println(i);  
    }
    System.out.println("MENAMPILKAN VALUES");
    for(String i : object1.values()){
        System.out.println(i);
    }
    System.out.println("MENAMPILKAN KEY AND VALUES");
    for(String i : object1.keySet()){
        System.out.println("KEY : "+i+" dan Value : "+object1.get(i));
    }
    //diatas adalah contoh non-primitf cara untuk primitif adalah
    //pakai wrapper class
    /*
     int =>Integer
     char= Character
     boolean = Boolean
     double= Double
     */
    System.out.println("\n\nDifferent of type , non p - p");
    HashMap<String, Integer> object3= new HashMap<String,Integer>();
    object3.put("Teguh", 15);
    object3.put("Raden", 1);
    object3.put("Gri", 10);
        for(String i : object3.keySet()){
            System.out.println("Key : "+i+"Value : "+object3.get(i));
        }
    }
}