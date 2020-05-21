public class PublishingCompany {
    
    private String companyName;
    private Author author;

    PublishingCompany(String companyName, Author author){

    this.companyName = companyName;
    this.author = author;
    }

    //getter
    public String getCompanyName(){
        return companyName;
    }
    public Author author(){
        return author;
    }

    //setter
    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }
    public void setAuthor(Author author){
        this.author = author;
    }
}