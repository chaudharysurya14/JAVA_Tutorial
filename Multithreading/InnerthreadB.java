// package Multithreading;

// class threadA extends Thread {
//     public void run() {

//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Surya");
//         }
//     }
// }

// /**
//  * InnerthreadA
//  */
// class InnerthreadB {
//     public static void main(String[] args) {
//         threadA r = new threadA();
//         r.start();

//         for (int i = 1; i <= 5; i++) {
//             System.out.println("Saigal sainy");
//         }
//     }
// }
// ==============================================================
package Multithreading;

class threadA extends Thread {
    public void run() {
        try {
            for (int i = 1; i <= 5; i++) {
                System.out.println("Surya");
                Thread.sleep(1000);
            }
        } catch (InterruptedException i) {

        }
    }
}

/**
 * InnerthreadA
 */
class InnerthreadB {
    public static void main(String[] args) throws InterruptedException {
        threadA r = new threadA();
        r.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("Saigal sainy");
            Thread.sleep(1000);
        }
    }
}
