package OOP.interfacee.penelitian;

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
    public void myobject5();
}
class temp{
    public void myobject5(){
        System.out.println("Tumpuk-Tumpuk");
    }
}
//Helper class of interface
class kasus1 extends temp implements coki1{
    public void myobject1(int a){
        System.out.println("Nilai"+a);
    }
    static int b=30;
    static void myobject4(){
        System.out.println("BISA NIH");
    }
}

class kasus2 extends temp implements coki2{
    public int myobject2(){
        int b=10;
        return b*b;
    }
    public void myobject3(){
        System.out.println("SIALAN KAU COKI");
    }
}
public class interface_coba {
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
        benda2.myobject5();

        coki1 coka = new kasus1();//constructor interface ga bisa, harus pakai construct dari subclassnya
        coka.myobject1(100);
    }
}
