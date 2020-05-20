public class LibraryItem {

    private String book, author;
    private int yearPublished, howManyCopies;

    //constructor with all properties
    public LibraryItem( String book, String author, int yearPublished, int howManyCopies){
        this.book = book;
        this.author = author;
        this.yearPublished = yearPublished;
        this.howManyCopies = howManyCopies;
    }

    //getters
    public String getBook(){
        return book;
    }
    public String getAuthor(){
        return author;
    }
    public int getYearPublished(){
        return yearPublished;
    }
    public int getHowManyCopies(){
        return howManyCopies;
    }

    //setters
    public void setGetBook(String book){
        this.book = book;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setYearPublished(int yearPublished){
        this.yearPublished = yearPublished;
    }
    public void setHowManyCopies(int howManyCopies){
        this.howManyCopies = howManyCopies;
    }

}