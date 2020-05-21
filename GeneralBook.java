public class GeneralBook extends Books implements Loanable{

    private String genre;

    public GeneralBook(){
    }

    public GeneralBook(String book, Author author, int yearPublished, int howManyCopies, int numpages, String genre){
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
    
    @Override
    public boolean isLoanable(){
        return true;
    }
    public Schedule schedule(){
        return Schedule.WEEKLY;
    }

}