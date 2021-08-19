package day47_Recap.browsers;

public final class Opera extends browser{
    @Override
    public void close() {
        System.out.println("Closing Opera");
    }

    @Override
    public void open() {
        System.out.println("Opening Opera");    }
}
