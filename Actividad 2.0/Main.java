import javax.swing.JOptionPane;

class Main {
    public static void main(String[] args) {
        //JOptionPane.showInternalMessageDialog(null, "hola", "title", JOptionPane.INFORMATION_MESSAGE);
        date d1 = new date(29,2,2000);
        date d2 = new date(22,3,1900);
        date d3 = new date();

        d1.setDay(d1.getDay());
        d1.setMonth(d1.getMonth());
        d1.setYear(d1.getYear());

        d2.setDay(d2.getDay());
        d2.setMonth(d2.getMonth());
        d2.setYear(d2.getYear());

        // Fecha
        System.out.println(d1);
        System.out.println(d2);

        // Validacion de la fecha:

        System.out.println(d1.isValidDate(d1.getDay(), d1.getMonth(), d1.getYear()));
        System.out.println(d2.isValidDate(d2.getDay(), d2.getMonth(), d2.getYear()));

        System.out.println(d1.equals(d1.getYear(),d2.getYear()));



        //Getters

        //Getters

    /*

    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        setYear(year);
        setMonth(month);
        setDay(day);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >= 1900 && year <= 3000) {
            this.year = year;
        } else {
            throw new IllegalArgumentException("Year value is out of range");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month >= 1 && month <= 12) {
            this.month = month;
        } else {
            throw new IllegalArgumentException("Month value is out of range");
        }
    }

    */
    }
}