public class BookAuthorDemo {
    public static void main(String[] args) {
        Author auth = new Author("Rai", "rai@suza.ac.tz", 'M');
        Book book = new Book("Starting out with Java 2023", 200.0, 30, auth);
        System.out.println(auth.toString());
        System.out.println(book.toString());
    }

}