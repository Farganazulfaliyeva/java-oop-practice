package books;
public class Main {
    public static void main(String[] args) {
        Books[] books = {
                new Books("Java Books", "Emil", 710),
                new Books("Clean Code", "Robert C. Martin", 431),
                new Books("The Hobbit", "J.R.R. Tolkien", 310),
                new Books("1984", "George Orwell", 328),
        };
        try {
            books[0].setPages(0);
        }catch (IllegalArgumentException e){
            System.out.println("Caught: " + e.getMessage());
        }

        for (Books b : books) {
            b.printInfo();
        }
    }
}