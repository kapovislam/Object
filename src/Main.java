public class Main {
    public static void main(String[] args) {
        Author mLermontov = new Author("Михаил", "ЛЕРМОНТОВ");
        Book book = new Book("Демон", mLermontov, 1841);
        Author author1 = new Author("Иоган", "Гете");
        Book book1 = new Book("Фауст", author1, 1800);
        book.setYearPublishing(1855);
        System.out.println(book.getYearPublishing());
        System.out.println(author1);
        System.out.println(book);
        System.out.println(book1);
        System.out.println(mLermontov.equals(author1));
        System.out.println(book.equals(book1));
    }
}