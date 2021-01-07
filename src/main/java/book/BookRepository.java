package book;


public class BookRepository {

    static Author[] authors = AuthorRepository.getData();
    static String[] names = {"Sasna Crer", "Harry Potter", "Hungry games"};

    public static Book[] getData() {

        Book[] books = new Book[10];
        for (int i = 0; i < books.length; i++) {
            Book book = new Book();
            book.setName(names[(int) (Math.random() * 3)]);
            book.author = authors[(int) (Math.random() * 3)];
            books[i] = book;
        }
        return books;
    }

}