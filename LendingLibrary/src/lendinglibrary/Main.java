package lendinglibrary;

public class Main {
    
    public static void main(String[] args) {
        Book[] bookCatalog = new Book[10];
        
        Book book1 = new Book(1, "An introduction to Java", "Maria Moraru", "12345");
        Book book2 = new Book(2, "Better Java", "Simona Rengescu", "23456");
        
        bookCatalog[0] = book1;
        bookCatalog[1] = book2;
        
        UI ui = new UI();
        ui.printHeader();
        ui.printBookCatalog(bookCatalog);
    }
    
}
