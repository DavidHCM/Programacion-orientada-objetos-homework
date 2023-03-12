import java.util.Calendar;

public class TestDate {
    public static void main(String[] args) {
        Date d1 = new Date(29,2,2000);
        Date d2 = new Date(22,3,1900);

        d1.setYEAR(1900,3000);
        d2.setYEAR(1900,3000);

        d1.set_day(d1.get_day());
        d1.set_month(d1.get_month());
        d1.set_year(d1.get_year());

        d2.set_day(d2.get_day());
        d2.set_month(d2.get_month());
        d2.set_year(d2.get_year());

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(d1.isValidDate(d1.get_day(), d1.get_month(), d1.get_year()));
        System.out.println(d2.isValidDate(d2.get_day(), d2.get_month(), d2.get_year()));


    }
}