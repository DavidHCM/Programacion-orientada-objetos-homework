import java.util.ArrayList;
import java.util.Calendar;

public class Date {
    private int DAY = -1;
    private int MONTH = -1;
    private int YEAR = -1;
    private String mName = "INDEFINIDO";

    public static int MIN_YEAR = 1900;

    public static int MAX_YEAR = 3000;

    private static String names [] = {"Enero", "Febrero", "Marzo ", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    private String getMonthName()
    {
        return names[MONTH-1];
    }

    // Otro constructor

    public Date()
    {
        Calendar now = Calendar.getInstance();
        this.DAY = now.get(Calendar.DAY_OF_MONTH);
        this.MONTH = now.get(Calendar.MONTH) + 1;
        this.YEAR = now.get(Calendar.YEAR);
        this.mName = getMonthName();
    }


    //Constructor
    public Date(int DAY,int MONTH, int YEAR)
    {
        if (YEAR > MAX_YEAR || YEAR < MIN_YEAR){
            return;
        }

        switch (MONTH) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                this.DAY = DAY;
                this.MONTH = MONTH;
                this.YEAR = YEAR;
                this.mName = getMonthName();
            }
            case 2 -> {
                if (isLeap(YEAR)) {
                    if (DAY <= 29 && DAY >= 1){
                        this.DAY = DAY;
                        this.MONTH = MONTH;
                        this.YEAR = YEAR;
                        this.mName = getMonthName();
                    }
                } else {
                    if (DAY <= 28 && DAY >= 1){
                        this.DAY = DAY;
                        this.MONTH = MONTH;
                        this.YEAR = YEAR;
                        this.mName = getMonthName();
                    }
                }
            }
            case 4, 6, 9, 11 -> {
                this.DAY = DAY;
                this.MONTH = MONTH;
                this.YEAR = YEAR;
                this.mName = getMonthName();
            }
        }

    }

    // Getters
    public int get_day()
    {
        return DAY;
    }

    public int get_month()
    {
        return MONTH;
    }

    public int get_year()
    {
        return YEAR;
    }

    // Setters
    public void set_day(int DAY)
    {
        switch (MONTH) {
            case 1, 3, 5, 7, 8, 10, 12 ->
                    this.DAY = DAY;
            case 2 -> {
                if (isLeap(this.YEAR)) {
                    if (DAY <= 29 && DAY >= 1){
                        this.DAY = DAY;
                    }
                    this.DAY = DAY;
                }
                else if (DAY <= 28 && DAY >= 1){
                    this.DAY = DAY;
                }
            }
            case 4, 6, 9, 11 ->
                    this.DAY = DAY;
        }
    }

    public void set_month(int MONTH)
    {
        switch (MONTH) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                this.MONTH = MONTH;
                this.mName = getMonthName();
            }
            case 2 -> {
                if (isLeap(YEAR) && DAY <= 29) {
                    this.MONTH = MONTH;
                    this.mName = getMonthName();
                } else if(DAY <= 28) {
                    this.MONTH = MONTH;
                    this.mName = getMonthName();
                }
            }
            case 4, 6, 9, 11 -> {
                this.MONTH = MONTH;
                this.mName = getMonthName();
            }
        }
    }

    public void set_year(int YEAR)
    {
        if (MONTH != 2) {
            if (YEAR <= MAX_YEAR && YEAR >= MIN_YEAR) {
                this.YEAR = YEAR;
            }
        }else if (isLeap(YEAR) && DAY <= 29 || DAY <= 28){
            if (YEAR <= MAX_YEAR && YEAR >= MIN_YEAR) {
                this.YEAR = YEAR;
            }
        }
    }

    public void setYEAR(int YEAR1,int YEAR2)
    {
        // Set max year
        MIN_YEAR = YEAR1;

        // Set min year
        MAX_YEAR = YEAR2;
    }

    public boolean isLeap(int YEAR) {
        if (YEAR % 4 == 0) {
            if (YEAR % 100 == 0) {
                return YEAR % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean isValidDate(int DAY,int MONTH,int YEAR)
    {
        if (YEAR > MAX_YEAR || YEAR < MIN_YEAR){
            return false;
        }

        switch (MONTH)
        {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                return true;
            }
            case 2 -> {
                if (isLeap(YEAR) && DAY <= 29) {
                    return true;
                } else if(DAY <= 28) {
                    return true;
                }
            }
            case 4, 6, 9, 11 -> {
                return true;
            }
            default -> {
                return false;
            }
        }

        return false;
    }


    @Override
    public String toString() {
        return (this.DAY + " / " + this.mName + " / " + this.YEAR);
    }
}

