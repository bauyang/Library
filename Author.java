public class Author {

    private String name; 
    private String birthday;
    private PublishingCompany publishingCompany;
    
    Author (String name, String birthday) 
    { 
        this.name = name; 
        this.birthday = birthday;
    } 
    
    //getter
    public String getname(){
        return name;
    }
    public String getBirthday(){
        return birthday;
    }
    public PublishingCompany getPublishingCompany(){
        return publishingCompany;
    }


    //setter
    public void setname(String name){
        this.name = name;
    }
    public void setBirthday(String birthday){
        this.birthday = birthday;
    }
    public void setPublishingCompany(PublishingCompany publishingCompany){
        this.publishingCompany = publishingCompany;
    }
}