package OOP.Atribut;


public class atribut1 {
    /*
    x,depan,tengah,belakang,f adalah atribut
    atribut adalah sebuah variabel di dalam sebuah class
    */
    int x=20;
    String depan="I Gede";
    String tengah="Teguh";
    String belakang="Permana";
    final int f=30;//Cant to modify
    public static void main(String[] args) {
        atribut1 obj1=new atribut1();
        atribut1 obj2= new atribut1();

        //Acces biasa
        System.out.println(obj1.x);

        //modify atribut
        obj1.x=100;
        System.out.println(obj1.x);//100
        System.out.println(obj2.x);//stay to 20

        //cant to modify if modifer is final
            //obj1.f=200;
        System.out.println(obj1.f);

        //multiple atribut
        System.out.println(obj1.depan);
        System.out.println(obj1.tengah);
        System.out.println(obj2.belakang);
    }    
}
