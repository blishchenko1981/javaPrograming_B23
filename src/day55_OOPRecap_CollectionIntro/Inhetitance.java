package day55_OOPRecap_CollectionIntro;

class A {
    private  int n1 = 100;
    int n2 = 200;
    protected int n3 = 300;
    public int n4 = 400;
    private void m1(){}
    void m2(){};
    protected void m3(){}
    public void m4(){}


}


public class Inhetitance extends A{
    public static void main(String[] args) {
        Inhetitance obj = new Inhetitance();
        System.out.println(obj.n2);
        System.out.println(obj.n3);
        System.out.println(obj.n4);
        obj.m2();
        obj.m3();
        obj.m4();

    }
}

class B extends  A{

}

class C extends  Inhetitance{

}

