package OOP.ENUM;
//enum is for string data
enum nilai{
    AKU,
    SAYANG,
    KAMU;
}
public class num {
/*ENUM DIGUNAKAN UNTUK MEMBUAT SUATU ATRIBUT VALUE YANG TIDAK BISA DIGANTIKAN
Bedanya dengan final, enum dapat menggrupkan atribut atau methode yang akan di enumarisasi statis
Enum berbeda dengan class tidak dapat digunakan untuk membuat object
Enum dipanggil dengan dot dimana ada suatu variabel sebagai penampung nilai enum yang dipanggil

*/
public static void main(String[] args) {
    //switch
    nilai key = nilai.AKU;
    switch (key) {
        case AKU:
            System.out.println("aku is me");
            break;
        case SAYANG:
            System.out.println("CIUS?");
            break;
        case KAMU:
            System.out.println("ZONK");
            break;
        default:
        System.out.println("WRONG");
            break;
        }
        //for each
        for(nilai kay:nilai.values()){
            System.out.println(kay);
        }
        //normal acces
        nilai acces = nilai.SAYANG;
        System.out.println(acces);
    }
}
