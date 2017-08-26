package BookAndAuthor;

public class Main {
    public static void main(String[] args) {
        Author tolkien = new Author("Tolkien", "email", 'm');
        System.out.println(tolkien);

        Book book = new Book("LotR", tolkien, 23.99, 6);
//        Book book2 = new Book("LotR", new Author("Tolkien", "email", 'm'), 23.99);
        System.out.println(book);
    }

}
