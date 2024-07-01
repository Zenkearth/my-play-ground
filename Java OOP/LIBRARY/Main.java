public class Main {

    static Book TheDragonBorn = new Book("The Dragon born","P.Peter","Novel");
    public static void main(String[] args) {
        LibraryMember john = new LibraryMember("John Smith","73 Baker St.","(800) 394 2043");
        john.borrowBook(TheDragonBorn);
        john.showBorrowBook();
    }   
}
