import java.util.ArrayList;
public class date {


    private int day = -1;

    private int month = -1;

    private int year = -1;

// Constructor

    private static ArrayList<Integer> months31 = new ArrayList<Integer>();
    private static ArrayList<Integer> months30 = new ArrayList<Integer>();

    public date() {

    }

    public boolean isLeap(int year) {
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
            return false;
        }
    }

    public date(int day, int month, int year){
        months31.add(1);
        months31.add(3);
        months31.add(5);
        months31.add(7);
        months31.add(8);
        months31.add(10);
        months31.add(12);
        months30.add(4);
        months30.add(6);
        months30.add(9);
        months30.add(11);

        if (year > 3000 || year < 1900){
            return;
        }

        if (month >= 1 && month <= 12){
            if(months31.contains(month)){
                if (day <= 31 && day >= 1){
                    this.day = day;
                    this.month = month;
                    this.year = year;
                }
            }else if (months30.contains(month)){
                if (day <= 30 && day >= 1){
                    this.day = day;
                    this.month = month;
                    this.year = year;
                }
            }else if (isLeap(year)){
                if (day <= 29 && day >= 1){
                    this.day = day;
                    this.month = month;
                    this.year = year;
                }
            }else{
                if (day <= 28 && day >= 1){
                    this.day = day;
                    this.month = month;
                    this.year = year;
                }
            }
        }
    }

    // Destructor


    // Getters
    public int getDay()
    {
        return day;
    }

    public int getMonth()
    {
        return month;
    }

    public int getYear()
    {
        return year;
    }

    // Setters

    public void setDay(int day){
        if (months31.contains(this.month)){
            if (day <= 31 && day >= 1){
                this.day = day;
            }
        }else if(months30.contains(this.month)){
            if (day <= 30 && day >= 1){
                this.day = day;
            }
        }else if(isLeap(this.year)){
            if (day <= 29 && day >= 1){
                this.day = day;
            }
        }else if (day <= 28 && day >= 1){
            this.day = day;
        }
    }

    public void setMonth(int month){
        if(months31.contains(month)){
            if (month <= 12 && month >= 1){
                this.month = month;
            }
        }else if (months30.contains(month)){
            if(day <= 30){
                if (month <= 12 && month >= 1){
                    this.month = month;
                }
            }
        }else if (isLeap(year) && day <= 29){
            if (month <= 12 && month >= 1){
                this.month = month;
            }
        }else if(day <= 28){
            if (month <= 12 && month >= 1){
                this.month = month;
            }
        }
    }

    public void setYear(int year){
        if (month != 2) {
            if (year <= 3000 && year >= 1900) {
                this.year = year;
            }
        }else if ((isLeap(year) && day <= 29) || day <= 28){
            if (year <= 3000 && year >= 1900) {
                this.year = year;
            }
        }
    }


    public boolean isValidDate(int day,int month,int year)
    {
        if (year > 3000 || year < 1900){
            return false;
        }

        if (month >= 1 && month <= 12){
            if(months31.contains(month)){
                if (day <= 31 && day >= 1){
                    return true;
                }
            }else if (months30.contains(month)){
                if (day <= 30 && day >= 1){
                    return true;
                }
            }else if (isLeap(year)){
                if (day <= 29 && day >= 1){
                    return true;
                }
            }else{
                if (day <= 28 && day >= 1){
                    return true;
                }
                else{
                    return false;
                }
            }
        }
        return false;
    }
    
    public boolean equals(int year, int year2)
    {
        if(year == year2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    

    @Override
    public String toString() {
        return ("day: " + this.day + ", month: " + this.month + ", year: " + this.year);
    }

}
