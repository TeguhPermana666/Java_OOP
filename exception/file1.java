package OOP.exception;



public class file1 {
    public static void main(String[] args) {
        int array[]={1,2,3,4};
        try{
            System.out.println(array[10]);
        }catch(Exception e){
            System.out.println("OUT OUR LIMIT BOSQU!!\n"+e.getMessage());
        }finally{
            System.out.println("\n\n=>>>TRY AND CATCH DONE BRO<<<=");
        }
        //throw =>memungkinkan mengcustom error dengan exception type
        //=>ArithmeticException,ArrayIndexOutOfBoundsException
        //=>FileNotFoundException,SecurityException,
        sim(10);
        sim(30);

        
    }
    static void sim(int value){
        if(value<18){
            throw new ArithmeticException("ACCES DINED->ANDA BOCIL GA CUKUP UMUR CUK");
        }
        else{
            System.out.println("HATI HATI YA BEB");
        }   
    }
}
