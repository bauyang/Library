public class Magazine extends Periodical{
    
    private boolean picture;

    public Magazine(){
        
    }

    public Magazine( String book, Author author, int yearPublished, int howManyCopies, String topic, int dayRegFreqPrint, boolean picture){
        super(book, author, yearPublished, howManyCopies, topic, dayRegFreqPrint);
        this.picture = picture;
    }

    //getter
    public boolean getPicture(){
        return picture;
    }
    
    //setter
    public void setPicture(boolean picture){
        this.picture = picture;
    }
    

    }