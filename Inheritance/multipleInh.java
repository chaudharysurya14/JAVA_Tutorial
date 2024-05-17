// /* Multipple Inheritance */

// package Inheritance;

// /**
//  * multipleInh
//  */
// interface multipleInh1 {
//     void show();
// }

// /**
//  * multipleInh
//  */
// interface multipleInh2 {
//     void Disp();
// }

// class Multiple_inheritance implements multipleInh1, multipleInh2 {
//     public void show() {
//         System.out.println("This is interface 1.");
//     }

//     public void Disp() {
//         System.out.println("This is interface 2.");
//     }

//     public static void main(String[] args) {
//         Multiple_inheritance r = new Multiple_inheritance();
//         r.show();
//         r.Disp();

//     }
// }

/* Multipple Inheritance */

package Inheritance;

/**
 * multipleInh
 */
interface multipleInh1 {
    void show();
}

/**
 * multipleInh
 */
interface multipleInh2 {
    void show();
}

class Multiple_inheritance implements multipleInh1, multipleInh2 {
    public void show() {
        System.out.println("This is interface 1 & 2.");
    }

    public static void main(String[] args) {
        Multiple_inheritance r = new Multiple_inheritance();
        r.show();

    }
}