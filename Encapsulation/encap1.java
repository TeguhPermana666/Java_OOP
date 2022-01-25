package OOP.Encapsulation;

public class encap1 {
    public static void main(String[] args) {
        person obj1 = new person();
        //obj1.nama;->error nama is not visible because the encaplusation methode
        
        //Write dengan pass argument ke parameter melalui this.nama
        //meng write nilai  visiblity private nama
        obj1.setName("TEGUH");

        //meng read visibility private nama
        System.out.println(obj1.getName());
        
    }    
}
