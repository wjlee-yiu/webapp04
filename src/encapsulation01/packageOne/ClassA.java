package encapsulation01.packageOne;

public class ClassA {
    private int pri;
    int def;
    protected int pro;
    public int pub;

    void runSomething() {
        pri = 1;
        this.pri = 1;
        def = 1;
        this.def = 1;
        pro = 1;
        this.pro = 1;
        pub = 1;
        this.pub = 1;
    }

    static void runStaticThing() {
        ClassA ca = new ClassA();

        ca.pri = 1;
        ca.def = 1;
        ca.pro = 1;
        ca.pub = 1;

    }
}
