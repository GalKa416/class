package lesson1;

public class Book {
   private Author authorBook;
    private String nameBook;
    private int publicationDateBook;




    public Book( String nameBook, int publicationDateBook) {
    this.nameBook = nameBook;
    this.publicationDateBook = publicationDateBook;
    this.authorBook = authorBook;
    }
    public Author getAuthorBook (){
        return this.authorBook;
    }
    public String getNameBook() {
        return this.nameBook;
    }
    public int getPublicationDateBooK() {
        return this.publicationDateBook;
    }
}




