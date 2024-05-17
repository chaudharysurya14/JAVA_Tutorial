/* protected package accessing by within class */

// package pkg;

// public class protected_package {
//     protected void show() {
//         System.out.println("suryadev chaudhary");
//     }

//     public static void main(String[] args) {
//         protected_package r = new protected_package();
//         r.show();
//     }
// }
// ==================================================================================
/* protected package accessing by within package */

// package pkg;

// class protected_package {
//     protected void show() {
//         System.out.println("suryadev chaudhary");
//     }
// }

// class B {
//     public static void main(String[] args) {
//         protected_package r = new protected_package();
//         r.show();
//     }
// }

// ===================================================================================

/* protected package accessing by outsude from package by subclass */

package pkg;

public class protected_package {
    protected void show() {
        System.out.println("suryadev chaudhary");
    }
}

