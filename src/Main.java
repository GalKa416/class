import lesson1.Author;
import lesson1.Book;

public class Main {
    public static void main(String[] args) {
    System.out.println("Hello world!");
    Author threeMusketeers = new Author();
    threeMusketeers.fullName = "Александр Дюма";
    System.out.println("threeMusketeers.fullName = " + threeMusketeers.fullName);
    Book threeMusketeer = new Book();
    threeMusketeer.nameBook = "Три мушкетера";
        System.out.println("threeMusketeer.nameBook = " + threeMusketeer.nameBook);
    threeMusketeer.publicationDateBooK = 1844;
    }
    }
