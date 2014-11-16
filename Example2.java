public class A {
    public A() {
        myMethod();
    }
    public void myMethod() {
        Date date = new Date();
    }
}

public class B extends A {
    private Date date = new Date();

    public B() {
        date = new Date();
    }

    @Override
    public void myMethod() {
        System.out.println(date);
    }

    //...
    public static void main(String[] args) {
        B sub = new B();
        sub.myMethod();
    }
}
