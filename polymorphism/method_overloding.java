/* method_overloding */

package polymorphism;

class A {
    int add() {
        int a = 10;
        int b = 20;
        int c;
        c = a + b;
        return c;

    }

    void add(int x, int y) {
        int c;
        c = x + y;
        System.out.println(c);
    }

    void add(int x, double y) {
        double c;
        c = x + y;
        System.out.println(c);
    }

    public static void main(String[] args) {
        A r = new A();
        r.add(100, 200);
        r.add(50, 45, 32);
        int add = r.add();
        System.out.println(add);
    }
}
