package OOP.bookTask;

public class EBook extends Book {

    private final int size;
    private final int pages;

    public int getSize() {
        return size;
    }

    public int getPages() {
        readBook();
        return pages;


    }


    public EBook(String title, String type, String author, double price, int size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }
    private final void readBook(){
        System.out.println("The book  " + getTitle() +" written by "+ getAuthor()+ " is ready for reading");
    }


    @Override
    public String toString() {
       return  "This Ebook written by " + getAuthor()+ ", title " + getTitle()+" cost " + getPrice();
    }
}
