package OOP.inheritency;

//Debugnya BINGUNG KARENA BANYAK MAIN LEBIH BAIK PAKAI INTERFACE UNTUK BANYAK SUPERCLASS

class object1 {//default class
    public void func1(){
        System.out.println("hallo");
        kopi opi = new kopi();
        System.out.println("hallo");
        System.out.println(opi.a);
    }
}

class object2{
    public void func1(){
        kopi opi = new kopi();
        System.out.println("hallo");
        System.out.println(opi.a);
    }
}
class kopi extends object1{
    int a=10;
    public static void main(String[] args) {
        object1 bendaa = new object1();
        bendaa.func1();
    }
}
class teh extends object2{
    int t=30;
}
public class multi {
    public static void main(String[] args) {
        object1 benda1 = new object1();
        benda1.func1();

        object2 benda2 = new object2();
        benda2.func1();

    }
    
    
}
