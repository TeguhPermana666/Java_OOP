import java.util.ArrayList;
import java.util.Collections;
public class array_list {
public static void main(String[] args) {
ArrayList <String> cars = new ArrayList<String>();
    //Add array_list
    cars.add("Gede");
    cars.add("Teguh");
    cars.add("Permana");
    //Size
    System.out.println(cars.size());

    System.out.println(cars);
    //change array_list
    cars.set(0, "Komang");
    //Get array_list
    System.out.println(cars.get(0)); 
    //Remove array_list
    cars.remove(2);
    System.out.println(cars);

    ArrayList<Integer> motor = new ArrayList<Integer>();
    motor.add(10);
    motor.add(90);
    motor.add(100);
    motor.add(30);
    //Hapus semua
    motor.clear();
    //AKses with help on lop
    for(int i=0;i<motor.size();i++){
        System.out.println(motor.get(i));
        }
    //for each
    for(String name : cars){
        System.out.println(name);
        }
    //sort array_list
    Collections.sort(motor);
    System.out.println(motor);
    }    
}
