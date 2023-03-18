import java.util.Calendar;
import java.util.Date;

public class DateD {
    protected int DAY = 1;
    protected int MONTH = 1;
    protected int YEAR = 2017;
    protected String mName = "INDEFINIDO";

    protected int format = 0;

    protected static int MIN_YEAR = 1900;

    protected static int MAX_YEAR = 3000;

    private static String names [] = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    private static String names2 [] = {"Ene", "Feb", "Mar ", "Abr", "May", "Jun", "Jul", "Agos", "Sept", "Oct", "Nov", "Dic"};

    private String getMonthName()
    {

        if (format == 1)
        {
            return names2[MONTH-1];
        }
        else if(format == 2 )
        {
            return names[MONTH-1];
        }
        else
        {
            return names[MONTH-1];
        }

    }


    // Otro constructor

    public DateD()
    {
        /*
         Calendar now = Calendar.getInstance();
        this.DAY = now.get(Calendar.DAY_OF_MONTH);
        this.MONTH = now.get(Calendar.MONTH) + 1;
        this.YEAR = now.get(Calendar.YEAR);
         */
        this.mName = getMonthName();
        this.format = get_format();
    }


    //Constructor
    public DateD(int DAY, int MONTH, int YEAR, int format)
    {
        if (YEAR > MAX_YEAR || YEAR < MIN_YEAR){
            return;
        }

        switch (MONTH) {
            case 1, 3, 5, 7, 8, 10, 12 -> {
                this.DAY = DAY;
                this.MONTH = MONTH;
                this.YEAR = YEAR;
                this.format = format;
            }
            case 2 -> {
                if (isLeap(YEAR)) {
                    if (DAY <= 29 && DAY >= 1){
                        this.DAY = DAY;
                        this.MONTH = MONTH;
                        this.YEAR = YEAR;
                        this.mName = getMonthName();
                        this.format = format;
                    }
                } else {
                    if (DAY <= 28 && DAY >= 1){
                        this.DAY = DAY;
                        this.MONTH = MONTH;
                        this.YEAR = YEAR;
                        this.mName = getMonthName();
                        this.format = format;
                    }
                }
            }
            case 4, 6, 9, 11 -> {
                this.DAY = DAY;
                this.MONTH = MONTH;
                this.YEAR = YEAR;
                this.mName = getMonthName();
                this.format = format;
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

    public int get_format()
    {
        return format;
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

    public void setYEARMAX(int YEAR1,int YEAR2)
    {
        // Set max year
        MIN_YEAR = YEAR1;

        // Set min year
        MAX_YEAR = YEAR2;
    }
    public void setFormat(int format)
    {
        this.format = format;
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


    public boolean equals(DateD form2)
    {
        if(form2 == null)
        {
            return false;
        }
        else if(getClass() != form2.getClass())
        {
            return false;
        }
        else if(this.DAY != form2.DAY)
        {
            return false;
        }
        else if(this.MONTH != form2.MONTH)
        {
            return false;
        }
        else if(this.YEAR != form2.YEAR)
        {
            return false;
        }
        return true;
    }



    public void next()
    {
        switch (MONTH) {
            case 1, 3, 5, 7, 8, 10, 12 ->
            {
                this.DAY += 1;
                if(this.DAY > 31)
                {
                    this.DAY = 1;
                    this.MONTH += 1;
                    if(this.MONTH > 12)
                    {
                        this.MONTH = 1;
                        this.YEAR += 1;
                        this.mName = getMonthName();
                    }
                    else
                    {
                        this.MONTH = MONTH;
                        this.mName = getMonthName();
                    }

                }
                else
                {
                    this.MONTH = MONTH;
                    this.mName = getMonthName();
                }

            }
            case 2 -> {
                if (isLeap(YEAR) && DAY <= 29)
                {

                    this.DAY += 1;
                    if(this.DAY > 29)
                    {
                        this.DAY = 1;
                        this.MONTH += 1;
                    }
                    else
                    {
                        this.MONTH = MONTH;
                        this.mName = getMonthName();
                    }



                } else if(DAY <= 28)
                {
                    this.DAY += 1;
                    if(this.DAY > 28)
                    {
                        this.DAY = 1;
                        this.MONTH += 1;
                    }
                    else
                    {
                        this.MONTH = MONTH;
                        this.mName = getMonthName();
                    }
                }
            }
            case 4, 6, 9, 11 ->
            {
                this.DAY += 1;
                if(this.DAY > 30)
                {
                    this.DAY = 1;
                    this.MONTH += 1;
                }
                else
                {
                    this.MONTH = MONTH;
                    this.mName = getMonthName();
                }

            }
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
        if(format == 1)
        {
            return (this.DAY + "-" + this.mName + "-" + this.YEAR);
        }
        else if(format == 2)
        {
            return (this.DAY + " de " + this.mName + " de " + this.YEAR);
        }
        else
        {
            return (this.DAY + "/" + MONTH + "/" + this.YEAR);
        }
    }
}

