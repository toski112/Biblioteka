package data;

/**
 * Created by Daniel on 08.08.2017.
 */
public class Liblary {
    public final static int MAX_BOOKS = 1000;
    public final static int MAX_MAGAZINES = 1000;
    private Magazine[] magazines;
    private Book[] books;
    private int booksNumber;
    private int magazineNumber;

    public Magazine[] getMagazines() {
        return magazines;
    }

    public void setMagazines(Magazine[] magazines) {
        this.magazines = magazines;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    public int getBooksNumber() {
        return booksNumber;
    }

    public void setBooksNumber(int booksNumber) {
        this.booksNumber = booksNumber;
    }

    public int getMagazineNumber() {
        return magazineNumber;
    }

    public void setMagazineNumber(int magazineNumber) {
        this.magazineNumber = magazineNumber;
    }
    public Liblary(){
    books = new Book[MAX_BOOKS];
    magazines = new Magazine[MAX_MAGAZINES];

    }

    void addBook(Book book){
        if(booksNumber < MAX_BOOKS){
            books[booksNumber] = book;
            booksNumber++;
        }else {
            System.out.println("Maksymalna liczba ksiazek !");
        }
    }

    void addMagazine(Magazine magazine){
        if(magazineNumber < MAX_MAGAZINES){
            magazines[magazineNumber] = magazine;
            magazineNumber++;
    }else {
            System.out.println("Maksymalna liczba magazynów !");
        }
    }

    void printBooks() {
        if (booksNumber == 0) System.out.println("Brak książek");
        for (int i = 0; i < booksNumber; i++) {
            System.out.println(books[i]);
        }
    }
    void printMagazines(){
        if(magazineNumber == 0) System.out.println("Brak czasopism");
        for(int i = 0 ; i < magazineNumber ; i++){
            System.out.println(magazines[i]);
        }
    }
}
