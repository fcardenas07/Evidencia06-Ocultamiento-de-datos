import com.date.TodaysDate;

public class TestFecha2 {
    public static void main(String[] args) {
        TodaysDate hoy = new TodaysDate();

        hoy.printDateAndTime();

//        Arroja error porque time es de tipo default
//        System.out.println(hoy.time);
//        System.out.println("hoy.day = " + hoy.day);
//        System.out.println("hoy.year = " + hoy.year);
    }
}
