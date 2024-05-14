class C {
    C() {
        System.out.print("Suryadev Chaudhary");
    }

    C(int a) {
        this(); // this parameter use for called itself class
        System.out.println(a);
    }

    public static void main(String[] args) {
        C r = new C(100);
    }
}
