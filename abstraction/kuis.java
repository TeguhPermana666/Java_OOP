package OOP.abstraction;
class one extends Test{
    public void process(){
        System.out.println("Parent");
    }
}
abstract class Test{
    public abstract void process();
}
public class kuis {
    public static void main(String[] args) {
        one object = new one();
        object.process();
    }
}
