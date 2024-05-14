class B {
    int a;

    B(int a) {
        this.a = a;
    }

    void show() {
        System.out.print(a);

    }

    public static void main(String[] args) {
        B r = new B(100);
        r.show();
    }
}
