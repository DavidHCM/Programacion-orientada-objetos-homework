public class TestDate {
    public static void main(String[] args) {
        DateD d1 = new DateD(1,1,2017,2);
        DateD d2 = new DateD(31,12,2016,1);
        DateD d3 = new DateD();
        DateD d4 = new DateD();
        DateD d5 = new DateD();



        d1.setYEARMAX(1900,3000);
        d2.setYEARMAX(1900,3000);


        d1.set_day(d1.get_day());
        d1.set_month(d1.get_month());
        d1.set_year(d1.get_year());

        d2.set_day(d2.get_day());
        d2.set_month(d2.get_month());
        d2.set_year(d2.get_year());

       /* d3.set_day(d3.get_day());
        d3.set_month(d3.get_month());
        d3.set_year(d3.get_year());

        d4.set_day(d4.get_day());
        d4.set_month(d4.get_month());
        d4.set_year(d4.get_year());

        d5.set_day(d5.get_day());
        d5.set_month(d5.get_month());
        d5.set_year(d5.get_year());
        */




        /*
        System.out.println(d1.isValidDate(d1.get_day(), d1.get_month(), d1.get_year()));
        System.out.println(d2.isValidDate(d2.get_day(), d2.get_month(), d2.get_year()));
        System.out.println(d3.isValidDate(d3.get_day(), d3.get_month(), d3.get_year()));

        System.out.println(d1.equals(d2));
        */

        d5.next();

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);



    }
}