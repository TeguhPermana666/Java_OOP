package OOP.INPUT;

import java.util.*;
public class input1 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String nama = userInput.nextLine();
        System.out.println(nama);

        int angka= userInput.nextInt();
        System.out.println(angka);

        float pecahan = userInput.nextFloat();
        System.out.println(pecahan);
        userInput.close();
    }    
}
