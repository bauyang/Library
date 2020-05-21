public class Periodical extends LibraryItem implements Reservable{
    
    private String topic;
    public int dayRegFreqPrint;

    public Periodical(){
        
    }

    public Periodical( String book, Author author, int yearPublished, int howManyCopies, String topic, int dayRegFreqPrint){
        super(book, author, yearPublished, howManyCopies);
        this.topic = topic;
        this.dayRegFreqPrint = dayRegFreqPrint;
    }

    //getters
    public String getTopic(){
        return topic;
    }
    public int getDayRegFreqPrint(){
        return dayRegFreqPrint;
    }

    //setters
    public void setTopic(String topic){
        this.topic = topic;
    }
    public void setDayRegFreqPrint( int dayRegFreqPrint){
        this.dayRegFreqPrint = dayRegFreqPrint;
    }

    @Override
    public boolean isReservable(){
        return true;
    }
}