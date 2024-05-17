// /* Default package accessing by within class */

// package pkg;

// class default_package {
//     void show() {
//         System.out.println("suryadev chaudhary");
//     }    
//     public static void main(String[] args) {
//         default_package r=new default_package();
//         r.show();
//     }
// }

//=====================================================================

/* Default package accessing by withinn package */

package pkg;

class default_package {
    void show() {
        System.out.println("suryadev chaudhary");
    }
}

class B {
    public static void main(String[] args) {
        default_package r = new default_package();
        r.show();
    }
}
