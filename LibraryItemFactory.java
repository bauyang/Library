public class LibraryItemFactory {
    public static LibraryItem CreateLibItem(LibraryItemType type){
        LibraryItem x = null;

        switch(type){
            case GENERALBOOK:
                x = new GeneralBook();
                break;
            case MAGAZINE:
                x = new Magazine();
                break;
            case NEWSPAPER:
                x = new NewsPaper();
                break;
            case REFERENCEBOOK:
                x = new ReferenceBook();
                break;
            default:
                return null;
        }
        return x;
    }
}