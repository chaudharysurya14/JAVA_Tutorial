package operator;

public class logical_opt {
    public static void main (String args[]) {

        int r, a =10, b =20;
        System.out.println(a == b && a <= b);
        System.out.println(a<=b && b>=a);
        System.out.println(a<=b || b==a);
        System.out.println(a>=b || b<=a);
        System.out.println(!(a == b));
    }
}

