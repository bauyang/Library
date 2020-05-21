public class ReferenceBook extends Books {
    
    private String subject;

    public ReferenceBook(){
        
    }

    public ReferenceBook(String book, Author author, int yearPublished, int howManyCopies, int numpages, String subject){
        super(book, author, yearPublished, howManyCopies, numpages);
        this.subject = subject;
    }
    
    //getter
    public String getSubject(){
        return subject;
    }

    //setter
    public void setSubject(String subject){
        this.subject = subject;
    }
}