package OOP.date;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class date1 {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.now();
        //acces class API adala static
        //jadi ga usah diakses melalui object, diakses secara dircely pada class
        System.out.println(date1);

        LocalTime waktu = LocalTime.now();
        //acces class API adala static
        //jadi ga usah diakses melalui object, diakses secara dircely pada class
        System.out.println(waktu);

        LocalDateTime object = LocalDateTime.now();
         //acces class API adala static
        //jadi ga usah diakses melalui object, diakses secara dircely pada class
        System.out.println(object);

        LocalDateTime myDateObj = LocalDateTime.now();
        System.out.println("Before formatting: " + myDateObj);
        DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        //T-nya di hilangkan

        String formattedDate = myDateObj.format(myFormatObj);
        System.out.println("After formatting: " + formattedDate);
        }
}
