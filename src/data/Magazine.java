package data;

/**
 * Created by Daniel on 08.08.2017.
 */
public class Magazine extends Publications {
    private int month;
    private int day;
    private String language;

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Magazine(String title, String publisher, String language, int year, int month, int day){
        super(title, publisher, year);
        this.setMonth(month);
        this.setDay(day);
        this.setLanguage(language);
    }

    @Override
    public String toString() {
        return getTitle() + " : "+ getPublisher() + " ; " + getYear()+ " - "+ getMonth()+ " - " + getDay()+ " - "+ " ;"
                + getLanguage();
    }
}
