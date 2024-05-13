/* Default Constructor */

class A {
    int a;
    String b;
    boolean c;

    A() // Default
    {
        a = 65;
        b = "Aaradhya";
        c = true;
    }

    void Disp() {
        System.out.print(a + " " + b + " " + c);
    }
}

class B {
    public static void main(String args[]) {
        A r = new A();
        r.Disp();
    }
}