package day55_OOPRecap_CollectionIntro;

public class Encapsulation {
    private String bookName;

    public String getBookName(){
        return bookName;
    }

    public void setBookName(String bookName){
        if(bookName.isEmpty()){
            throw new RuntimeException("Book name can not be empty");
        }
        this.bookName = bookName;
    }
}

class Test{
    public static void main(String[] args) {
        Encapsulation obj = new Encapsulation();

        obj.setBookName("Java");
        System.out.println(obj.getBookName());
    }
}
