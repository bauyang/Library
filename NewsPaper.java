public class NewsPaper extends Periodical{
 
    private boolean blackAndWhite;

    public NewsPaper(){
        
    }

    public NewsPaper( String book, Author author, int yearPublished, int howManyCopies, String topic, int dayRegFreqPrint, boolean blackAndWhite){
        super(book, author, yearPublished, howManyCopies, topic, dayRegFreqPrint);
    
        this.blackAndWhite = blackAndWhite;
    }

        //getter
    public boolean getBlackAndWhite(){
        return blackAndWhite;
    }

    //setter
    public void setBlackAndWhite(boolean blackAndWhite){
        this.blackAndWhite = blackAndWhite;
    }
    
}