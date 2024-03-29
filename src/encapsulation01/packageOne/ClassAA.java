package encapsulation01.packageOne;

public class ClassAA extends ClassA{
    void runSomething() {
        def = 1;
        pro = 1;
        pub = 1;
    }

    static void runStaticThing() {
        ClassAA caa = new ClassAA();
        caa.def = 1;
//        caa.pri = 1;
        caa.pro = 1;
        caa.pub = 1;
    }
}
