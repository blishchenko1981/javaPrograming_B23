package OOP.bookTask;

public class AudioBook extends Book{
    private  final int length;
    private  final int narrator;

    public AudioBook(String title, String type, String author, double price, int length, int narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }

    public  void listen()  {
        System.out.println( " the book " + getTitle() + " is ready for listening.");
    }

    public String toString(){
        return "the Audiobook from " + getAuthor() + " " + getTitle() + " for this price " + getPrice()+ "is ready for listenning";

    }


}
