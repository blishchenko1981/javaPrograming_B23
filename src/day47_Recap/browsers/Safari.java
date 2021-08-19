package day47_Recap.browsers;

public final class Safari extends browser {
    @Override
    public void close() {
        System.out.println("Closing Safari");
    }

    @Override
    public void open() {
        System.out.println("Opening Safari");    }
}
