package Day5;

class Book {
    String name, author;
    int price;

    //constructor with arguments
    public Book(String name, String author, int price) {
        this.name = name;
        this.author = author;
        this.price = price;
    }

    //method that will print information about book

    public static void defineBook(Book firstBook) {
        System.out.println(firstBook.name);
        System.out.println(firstBook.author);
        System.out.println(firstBook.price);
    }

    public static void main(String[] args) {
        Book ourFirstBook = new Book("First book", "Oskar Wilde", 500);
        Book ourSecondBook = new Book("Second book", "Oliver Twist", 150);
        defineBook(ourFirstBook);
        defineBook(ourSecondBook);
    }
}
