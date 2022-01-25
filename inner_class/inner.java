package OOP.inner_class;


class outter{
    int x=10;//atribut
    class innery{
        int y=10;//atribut
    }
}
class luar{
    int x=10;
    static class dalam{//static class child bisa tapi untuk parent tidak bisa 
        //yang hanya bisa public default aja
        int y=20;
    }
}

class out{
    int x=10;
    private class inn{
         int y=10;
    }
    class coba extends inn{
        int getNilai(){
            return y;
        }
        void setNilai (int nilai){
            this.y=nilai;
        }
    }
}
public class inner {
    public static void main(String[] args) {
        outter Outter = new outter();
        outter.innery myInner = Outter.new innery();
        //outter.innery adalah cerminan memanggil inner class (innery)
        //outter.new innery();=>outter. digunakan karena dia adalah default
        // modify yang hanya dapat diakses dengan object like a public
        System.out.println(Outter.x);
        System.out.println(myInner.y);

        luar.dalam object= new luar.dalam();
        //dalam dapat diakses secara langsung tanoa diakses object because is static
        System.out.println(object.y);
        

        //ecapsulation inner class
            //cara1=>subclass
        out object1= new out();
        out.coba object2= object1.new coba();
        int count=object2.y=10;
        System.out.printf("\nNilai encapsulation fungsi adalah %d\n",count);
            //cara2=>subclass +set and get->jika kalau y nya juga private
        object2.setNilai(100);
        System.out.println(object2.getNilai());

    }
}
