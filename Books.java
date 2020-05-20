public class Books extends LibraryItem{

    
    private int numpages;

    public Books( String book, String author, int yearPublished, int howManyCopies, int numpages){
        super(book, author, yearPublished, howManyCopies);
        this.numpages = numpages;
    }

    //getters
    public int getNumpages(){
        return numpages;
    }

    //setters
    public void setNumpages(int numpages){
        this.numpages = numpages;
    }
}
