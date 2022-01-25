package OOP.inheritency;
 class vechiles{
    protected String brand="Mustang";//vechiles atribut
    public void sound(){    //vechiles methode
        System.out.println("tut tut");
    }
 }
public class inheren1 extends vechiles {
    //meciptakan inheren1 sebagai child dari parents vechiles
    //dengan extends metode inherentcy

    private String modelname="Kijang";//private just acces with same class
    public static void main(String[] args) {
        inheren1 object= new inheren1();//
        object.sound();
        System.out.println("Barang: ="+object.brand +object.modelname);
    }
}
