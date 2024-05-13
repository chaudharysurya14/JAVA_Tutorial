// /* Parameterized Constructor */

// class B {
//     int x, y;

//     B(int a, int b) {
//         x = a;
//         y = b;
//     }

//     void show() {
//         System.out.println(x + " " + y);
//     }
// }

// class C {
//     public static void main(String[] args) {
//         B r = new B(100, 200);
//         r.show();
//     }
// }

/* Parameterized Constructor */

class B {
    int x, y;

    B(int a, int b) // parameterized
    {
        x = a;
        y = b;
    }

    B(int a, String b) // parameterized
    {
        System.out.println(a + " " + b);
    }
    void show() 
    {
        System.out.println(x + " " + y);
    }
}

class C {
    public static void main(String[] args) {
        B r = new B(100, 200);
        B ref = new B(10, "Surya"); 
        r.show();
    }
}