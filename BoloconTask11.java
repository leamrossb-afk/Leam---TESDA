public class BoloconTask11 {
    public static void main(String[] args) {
        Book book1 = new Book("The Lord of the Rings: The Fellowship of the Ring", "J.R.R. Tolkien", 1954, 799.99);
        Book book2 = new Book("The Lord of the Rings: The Two Towers", "J.R.R. Tolkien", 1954, 799.99);
        Book book3 = new Book("The Lord of the Rings: The Return of the King", "J.R.R. Tolkien", 1955, 799.99);

        StringBuilder b1 = new StringBuilder("\nBook 1:" + "\nTitle: " + book1.title + "\nAuthor: " + book1.author + "\nYear Published: " + book1.yearPublished + "\nPrice: " + book1.price + " pesos");
        StringBuilder b2 = new StringBuilder("\nBook 2:" + "\nTitle: " + book2.title + "\nAuthor: " + book2.author + "\nYear Published: " + book2.yearPublished + "\nPrice: " + book2.price + " pesos");
        StringBuilder b3 = new StringBuilder("\nBook 3:" + "\nTitle: " + book3.title + "\nAuthor: " + book3.author + "\nYear Published: " + book3.yearPublished + "\nPrice: " + book3.price + " pesos");

        System.out.println(b1.toString());
        System.out.println(b2.toString());
        System.out.println(b3.toString());
    }   
}

class Book {
    String title;
    String author;
    int yearPublished;
    double price;

    public Book (String title, String author, int yearPublished, double price){
        this.title = title;
        this.author = author;
        this.yearPublished = yearPublished;
        this.price = price;
    }
}