// package Constructor;

// public class demo {
//     int a;
//     String name;

//     // This is the constructor that create by me
//     demo() {
//         a = 0;
//         name = null;
//     }

//     void show() {
//         System.out.print(a + " " + name);
//     }
// }

// class test {
//     public static void main(String[] args) {
//         demo ref = new demo();
//         ref.show();
//     }
// }

package Constructor;

public class demo {
    int a;
    String name;

    // This is the constructor that create by me
    // demo() {
    // a=0;
    // name = null;
    // }
    void show() {
        System.out.print(a + " " + name);
    }
}

class test {
    public static void main(String[] args) {
        demo ref = new demo();
        ref.show();
    }
}
