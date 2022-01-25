package OOP.constructor;

public class construc1 {
    //Membuat suatu atribut kelas
    int tahun;
    String Nama;
    //Membuat suatu constructor untuk class construc1
    //Sebenarnya constructor sudah secara default ada jika suatu class dibuat
    //Tapi developer dapet membuatnya sendiri untuk keperluan
    //=>constructor build menjadi manual dengan paramter year and nama
    public construc1(int year, String nama){
        //atribut:
        tahun=year;
        Nama=nama;
    }
    public static void main(String[] args) {
        /*Constructor di call jika suatu object terbentuk dari suatu
        class yang berkaitan
        */
        construc1 myobj1= new construc1(1945,"Teguh"); //call constructor
        System.out.println(myobj1.Nama);
        System.out.println(myobj1.tahun);
    }
}
