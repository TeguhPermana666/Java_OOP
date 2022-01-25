package OOP.abstraction;

abstract class data{//abstrak class, tidak bisa di objeckan
    static int a=10;
    static void kontol(){
        System.out.println("kamu kontol");
    }
    abstract void babi();//abstrak methode harus di akses pada inherited class
    public void regular(){
        System.out.println("HAI");
    }
}
class prog extends data{
    public void babi(){//pengaksesan abstrak only acces jika class pada suatu sub class dan satu package
        System.out.println("YOU ARE BABI");
    }
}

public class abstrak {
    public static void main(String[] args) {
        prog object= new prog();
        object.regular();
        object.babi();
        int nilai=prog.a;
        System.out.println(nilai);
        System.out.println(prog.a);
        prog.kontol();
    }
    

}
