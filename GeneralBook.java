public class GeneralBook extends Books{

    private String genre;

    public GeneralBook(String book, String author, int yearPublished, int howManyCopies, int numpages, String genre){
        super(book, author, yearPublished, howManyCopies, numpages);
        this.genre = genre;
    }

    //getter
    public String getGenre(){
        return genre;
    }

    //setter
    public void setGenre(String genre){
        this.genre = genre;
    }
    
}