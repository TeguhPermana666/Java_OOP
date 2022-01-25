package OOP.interfacee;

//Interface
/**
 digunakan untuk secara spesifik dalam pengelompokan multiple karena dengan
 inheritencey itu tidak terlalu di suport untuk multiple superclass
 pada interface superclassnya itu bisa banyak dalam mendeklarasi methode,atribut,constructor
 kalau intheritencey itu lebih enak dia 1 superclass dan bisa untuk banyak subclass.
 */
interface coki1{
    public void myobject1(int a);
}

interface coki2{
    public int myobject2();
    public void myobject3();
}

//Helper class of interface
class kasus1 implements coki1{
    public void myobject1(int a){
        System.out.println("Nilai"+a);
    }
    static int b=30;
    static void myobject4(){
        System.out.println("BISA NIH");
    }
}

class kasus2 implements coki2{
    public int myobject2(){
        int b=10;
        return b*b;
    }
    public void myobject3(){
        System.out.println("SIALAN KAU COKI");
    }
}
public class interfacee1 {
/*
Interface digunakan untuk mengelompokan bebera fungsi sebagai deklarasi 
atau mengumpulkan methode without body yang akan di implements ke suatu class 
dimana suatu kelas ini berisikan boddy mirip seperti bahasa c tentang
prototipe dan fungsinya   
*/
    public static void main(String[] args) {
        kasus1 benda1 = new kasus1();
        benda1.myobject1(20);
        System.out.println(kasus1.b);
        kasus1.myobject4();

        kasus2 benda2 = new kasus2();
        benda2.myobject2();
        benda2.myobject3();
    }
}
