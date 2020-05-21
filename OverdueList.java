import java.util.Collection;

public class OverdueList<T> {
    private Collection<T> overdueList ;

public OverdueList(Collection<T> somebook){
    this.overdueList = somebook;
}

//getter
public Collection<T> getSomebook(){
    return this.overdueList;
}

//setter
public void setSomebook(Collection<T> somebook){
    this.overdueList = somebook;
}

}