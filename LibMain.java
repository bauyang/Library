public class LibMain {
    public static void main(String[] args) {
        
        // LibraryItem myItem = new LibraryItem();

        //Factory
        LibraryItem myItem2 = LibraryItemFactory.CreateLibItem(LibraryItemType.GENERALBOOK);

        myItem2.setGetBook("Hello");
        System.out.println(myItem2.getBook());

    }
}