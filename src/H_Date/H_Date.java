package H_Date;

import java.text.SimpleDateFormat;
import java.util.Date;

public class H_Date {
    public static void main(String[] args) {
        Date date = new Date();
//        E - day
//        a - AM or PM
//        G -AD
//        W - week
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("E dd/MM/YY");
        System.out.println(simpleDateFormat.format(date));
    }
}
