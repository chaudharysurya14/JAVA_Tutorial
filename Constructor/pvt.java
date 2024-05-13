public class pvt {
    int a;
    double b;
    String c;

    private pvt() {
        a = 10;
        b = 65.50;
        c = "suryadev";
        System.out.print(a + " " + b + " " + c);
    }

    public static void main(String args[]) {
        pvt r = new pvt();
    }
}
