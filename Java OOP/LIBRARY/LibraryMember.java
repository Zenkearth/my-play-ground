import java.util.ArrayList;

public class LibraryMember {
    private String name;
    private String address;
    private String phoneNumber;
    private ArrayList<Book> borrowBooks = new ArrayList<>();

    public LibraryMember(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public void borrowBook(Book book) {
        borrowBooks.add(book);
    }

    public void returnBook(Book book) {
        borrowBooks.remove(book);
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public ArrayList<Book> getBorrowBooks() {
        return borrowBooks;
    }

    public void showBorrowBook(){
        ArrayList<String> bufferBook;

        System.out.println(this.name + " borrows list");
        System.out.println("--------------------");
        for(int i =0 ;i < borrowBooks.size();i++){
            bufferBook = borrowBooks.get(i).getDetailsToArrayList();
            System.out.print((i+1) + ". ");
            System.out.println(bufferBook.get(0));
        }
    }
}
