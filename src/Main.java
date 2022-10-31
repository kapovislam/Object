public class Main {
    public static void main(String[] args) {
        Author mLermontov = new Author("Михаимл", "ЛЕРМОНТОВ");
        Book book = new Book("Демон", mLermontov, 1841);
        Book book1 = new Book("Фауст", new Author("Иоган", "Гете"), 1800);
        book.setYearPublishing(1855);
        System.out.println(book.getYearPublishing());
        System.out.println(book1.getTitle());
    }
}