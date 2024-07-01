import java.util.ArrayList;

public class Book {
    private String title;
    private String author;
    private String category;
    
    public Book(String title,String author,String category){
        this.title = title;
        this.author = author;
        this.category = category;
    }
    
    public ArrayList<String> getDetailsToArrayList(){
        ArrayList<String> details = new ArrayList<>();
        details.add(title);
        details.add(author);
        details.add(category);
        return details;
    }
    
}