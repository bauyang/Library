public class Books extends LibraryItem{

    
    private int numpages;

    public Books(){
        
    }

    public Books( String book, Author author, int yearPublished, int howManyCopies, int numpages){
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
