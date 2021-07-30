package date;
import java.util.Date;
public class Execise_01 {
    public static void main(String[] args) {
        Data sana=new Data();
        sana.setMillisec(100000);
        sana.setMillisec(10000000);
//        sana.setMillisec(100);
//        sana.setMillisec(1);
        Date now=new Date(10000000);
        System.out.println("sana = " + sana);
               System.out.println("sana = " + now);


    }


}
