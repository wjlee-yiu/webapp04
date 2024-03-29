package encapsulation01.packageOne;

public class ClassB {
    void runSomething() {
        ClassA ca = new ClassA();
        ca.def = 1;
        ca.pro = 1;
        ca.pub = 1;
    }

    static void runStaticThing() {
        ClassA ca = new ClassA();
        ca.def = 1;
        ca.pro = 1;
        ca.pub = 1;
    }
}
