package data;


public class Book extends Publications{
    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private String author;
    private int pages;
    private String isbn;

    public  Book(String title, String author, int year, int pages, String publisher, String isbn){
        super(title,publisher,year);
        this.setAuthor(author);
        this.setIsbn(isbn);
        this.setPages(pages);

    }

}
