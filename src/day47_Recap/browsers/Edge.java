package day47_Recap.browsers;

public class Edge extends browser {
    @Override
    public void close() {
        System.out.println("Close Edge");
    }

    @Override
    public void open() {
        System.out.println("Opening Edge");    }
}
