public class CardHolder {
    
    private String name;
    private String id;
    private boolean canCheckout;
    private boolean reserved;

    public CardHolder(String name, String id, boolean canCheckout, boolean reserved){
        this.canCheckout = canCheckout;
        this.reserved = reserved;
    }

    //getter
    public String getName(){
        return name;
    }
    public String getId(){
        return id;
    }
    public boolean getcanCheckout(){
        return canCheckout;
    }
    public boolean getReserved(){
        return reserved;
    }

    //setter
    public void setName(String name){
        this.name = name;
    }
    public void setId(String id){
        this.id = id;
    }
    public void setCanCheckout(boolean canCheckout){
        this.canCheckout = canCheckout;
    }
    public void setReserved(boolean reserved){
        this.reserved = reserved;
    }
}