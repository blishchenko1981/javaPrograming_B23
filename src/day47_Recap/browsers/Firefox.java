package day47_Recap.browsers;

public final class Firefox extends browser {

public void open(){
    System.out.println("Opening Firefox");
}

    @Override
    public void close() {
        System.out.println("Closing Firefox");
    }
}


