package chap08.sec09;

public class ExtendsExample {
    public static void main(String[] args) {
        InterfaceCImpl impl = new InterfaceCImpl();

        InterfaceA ia = impl;
        ia.methodA();
        // ia.methodB();
        // ia.methodC();
        System.out.println();

        InterfaceB ib = impl;
        ib.methodB();
        // ib.methodA();
        // ib.methodC();
        System.out.println();

        InterfaceC ic = impl;
        ic.methodA();
        ic.methodB();
        ic.methodC();
    }
}
