/* Example of private member  */

package pkg;

public class private_package {
    private void show() {
        System.out.println("package tutorial are going to completed.");
    }

    public static void main(String[] args) {
        private_package r = new private_package();
        r.show();
    }
}