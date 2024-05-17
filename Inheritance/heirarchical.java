package Inheritance;

class A {
    void show() {
        System.out.println("This content of super class.");
    }
}

class B extends A {
    void hold() {
        System.out.println("This content of sub class 1.");
    }
}

class C extends A {
    void disp() {
        System.out.println("This content of sub class 2");
    }
}

class heirarchical {
    public static void main(String[] args) {
        B r = new B();
        C r2 = new C();

        r.hold();
        r.show();

        r2.disp();
        r2.show();

    }
}