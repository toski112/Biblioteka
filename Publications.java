package data;

/**
 * Created by Daniel on 08.08.2017.
 */
public class Publications {
    private int year;
    private String title;
    private String publisher;

    protected Publications(String title, String publisher, int year){
        setTitle(title);
        setPublisher(publisher);
        setYear(year);
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Publications that = (Publications) o;

        if (year != that.year) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return publisher != null ? publisher.equals(that.publisher) : that.publisher == null;
    }

    @Override
    public int hashCode() {
        int result = year;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (publisher != null ? publisher.hashCode() : 0);
        return result;
    }
}
