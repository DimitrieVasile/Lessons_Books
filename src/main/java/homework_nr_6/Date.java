package homework_nr_6;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if (day > 0 && day < 31) {
            this.day = day;
        } else {
            System.out.println("Incorrect input of the day!");
        }
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month > 0 && month < 12) {
            this.month = month;
        } else {
            System.out.println("Incorrect input of the month!");
        }
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void DisplayDate() {
        System.out.println(day + "/" + month + "/" + year);
    }
}
