import java.util.Calendar;
import java.time.LocalTime;

public class DateTime extends DateD
{
    private int SECONDS = 5;

    private int MINUTES = 28;

    private int HOURS = 12;

    protected int FORMAT = get_format();

    //████████████████████████████████████████████████████████
    public DateTime(int HOURS,int MINUTES,int SECONDS,int DAY,int MONTH,int YEAR)
    {

        super(DAY,MONTH,YEAR);
        if(HOURS >= 1 && HOURS <= 23)
        {
            this.HOURS = HOURS;
        }
        if(MINUTES >= 1 && MINUTES <= 59)
        {
            this.MINUTES = MINUTES;
        }
        if(SECONDS >= 1 && SECONDS <= 59)
        {
            this.SECONDS = SECONDS;
        }
    }

    //████████████████████████████████████████████████████████
    public DateTime(int HOURS,int MINUTES,int SECONDS)
    {
        super();
        if(HOURS > 0 && HOURS < 23)
        {
            this.HOURS = HOURS;
        }

        if(MINUTES > 0 && MINUTES < 59)
        {
            this.MINUTES = MINUTES;
        }

        if(SECONDS > 0 && SECONDS < 59)
        {
            this.SECONDS = SECONDS;
        }

    }

    //████████████████████████████████████████████████████████
    public DateTime()
    {
        super();
        toSystemTime();
    }

    //████████████████████████████████████████████████████████
    public DateTime(DateD d)
    {
        super(d.get_day(),d.get_month(),d.get_year());
        toSystemTime();
    }
    //████████████████████████████████████████████████████████

    // Getters
    public int getSeconds()
    {
        return SECONDS;
    }

    public int getMinutes()
    {
        return MINUTES;
    }

    public int getHours()
    {
        return HOURS;
    }

    public int getFORMAT()
    {
        return FORMAT;
    }


    //████████████████████████████████████████████████████████

    // Setters

    public void setSeconds(int SECONDS)
    {
        if(SECONDS > 0 && SECONDS < 59)
        {
            this.SECONDS = SECONDS;
        }
    }

    public void setMinutes(int MINUTES)
    {
        if(MINUTES > 0 && MINUTES < 59)
        {
            this.MINUTES = MINUTES;
        }
    }

    public void setHours(int HOURS)
    {
        if(HOURS > 0 && HOURS < 23)
        {
            this.HOURS = HOURS;
        }
    }

    public void setFORMAT(int FORMAT)
    {
        this.FORMAT = FORMAT;
        setFormat(FORMAT);
    }

    //████████████████████████████████████████████████████████
    public void toSystemTime()
    {
        LocalTime cTime = LocalTime.now();
        this.HOURS = cTime.getHour();
        this.MINUTES = cTime.getMinute();
        this.SECONDS = cTime.getSecond();
    }

    //████████████████████████████████████████████████████████
    public boolean equals(DateTime o)
    {
        if(o == null)
        {
            return false;
        }
        else if(getClass() != o.getClass())
        {
            return false;
        }
        else if(this.SECONDS != o.SECONDS)
        {
            return false;
        }
        else if(this.MINUTES != o.MINUTES)
        {
            return false;
        }
        else if(this.HOURS != o.HOURS)
        {
            return false;
        }
        else if(this.DAY != o.DAY)
        {
            return false;
        }
        else if(this.MONTH != o.MONTH)
        {
            return false;
        }
        else if(this.YEAR != o.YEAR)
        {
            return false;
        }
        return true;

    }

    //████████████████████████████████████████████████████████

    public DateTime clone(DateTime obj1)
    {
        DateTime cloned = new DateTime(this.HOURS, this.MINUTES, this.SECONDS, this.DAY, this.MONTH, this.YEAR);
        cloned.setFORMAT(this.getFORMAT());
        return cloned;

    }




    //████████████████████████████████████████████████████████
    public void next()
    {

        this.SECONDS += 1;
        if(SECONDS > 59)
        {
            this.SECONDS = 0;
            this.MINUTES += 1;
            if(MINUTES > 59)
            {
                this.MINUTES = 0;
                this.HOURS += 1;
                if(HOURS > 23)
                {
                    this.HOURS = 1;
                    super.next();
                }
            }
        }

    }
    //████████████████████████████████████████████████████████
    public DateD toDate()
    {
        return new DateD();
    }
    //████████████████████████████████████████████████████████

    @Override
    public String toString()
    {
        if(this.format == 1)
        {
            if(HOURS < 12)
            {
                return "[" + this.HOURS + ":" + this.MINUTES + ":" + this.SECONDS + " AM] "  + this.DAY + "-" + this.mName + "-" + this.YEAR;
            }
            else
            {
                return "[" + this.HOURS + ":" + this.MINUTES + ":" + this.SECONDS + " PM] "  + super.toString();
            }
        }
        else if(this.format == 2)
        {
            if(HOURS < 12)
            {
                return "[" + this.HOURS + ":" + this.MINUTES + ":" + this.SECONDS + " AM] "  + this.DAY + " de " + this.mName + " de " + this.YEAR;
            }
            else
            {
                return "[" + this.HOURS + ":" + this.MINUTES + ":" + this.SECONDS + " PM] "  + super.toString();
            }

        }
        else
        {
            return "[" + this.HOURS + ":" + this.MINUTES + ":" + this.SECONDS + "] "  + super.toString();
        }
    }

}