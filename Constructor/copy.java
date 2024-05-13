
class copyA {
    int a;
    String b;

    copyA() {
        a = 10;
        b = "Surya";
        System.out.print(a + " " + b);
    }

    copyA(copyA ref) {
        a = ref.a;
        b = ref.b;
        System.out.print(a + " " + b);
    }
}

class copyB {
    public static void main(String[] args) {
        copyA r = new copyA();
        copyA r2 = new copyA();
    }
}