class B {
    void show() {
        System.out.print("Hello Suryadev Chaudhary");
    }
}

class C extends B {
    void show() {
        super.show();
        System.out.print("I'm from Nalanda, Bihar");
    }
}

class Test {
    public static void main(String args[]) {
        C r = new C();
        r.show();
    }
}
