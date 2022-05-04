package chapterFour;

public class Book {
    String title;
    String author;
    int ISBN;

    public Book(String title, String author, int ISBN) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
    }

    public Book(String title, int ISBN) {
        this(title, "Anonymous", ISBN);
    }

    public Book() {
        this(null, null, 0);
        System.out.println("Called constructor");
    }

    public static void main(String[] args) {
        Book javaBook = new Book("JAVA", "Java Kim", 3333);
        Book holyBible = new Book("Holy Bible", 1);
        Book emptyBook = new Book();

        System.out.println(javaBook.title + ' ' + javaBook.author + ' ' + javaBook.ISBN);
        System.out.println(holyBible.title + ' ' + holyBible.author + ' ' + holyBible.ISBN);
        System.out.println(emptyBook.title + ' ' + emptyBook.author + ' ' + emptyBook.ISBN);
    }
}
