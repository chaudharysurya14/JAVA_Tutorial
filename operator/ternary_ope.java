package operator;

public class ternary_ope {
    public static void main (String[] surya) {
        int a=40, b=50, c=30, r;
        r = (a>b)?(a>c?a:c):(b>c?b:c);
        System.out.println("Heighest no is "+r);
    }
}
