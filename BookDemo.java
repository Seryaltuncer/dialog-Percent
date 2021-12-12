public class BookDemo {
    public static void main(String[] args) {
        Book book1 = new Book("Starting out with Java",
                        "Gaddis", "Pearson", 12000);
        
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPublisher());
        System.out.println("Sold copies: " + 
                            book1.getCopiesSold());
        
        book1.setPublisher("McGrow Hill");
        
        System.out.println(book1.getTitle());
        System.out.println(book1.getAuthor());
        System.out.println(book1.getPublisher());
        System.out.println("Sold copies: " + 
                            book1.getCopiesSold());
    }
}
