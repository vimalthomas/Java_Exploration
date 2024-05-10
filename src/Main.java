class C {
    public int foo(C x) { return 0; }
}

class D extends C {
    public int foo(C x) { return 1; }
    public int foo(D x) { return 2; }
}

public class Main {
    public static void main(String[] args) {
        C p = new D();
        C q = new D();
        int i = p.foo(q);
        System.out.println("Result of p.foo(q): " + i);
    }
}
