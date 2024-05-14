// /* Instance vs Static Block */

// class E {
//     static {     // static block
//         System.out.print("Suryadev Chaudhary");
//     }
//     public static void main (String[] args) {

//     }
// }

/* Staic block can access only static variable */
// class E {
//     int a=10; 
//     static int b=20;
//     static {
//         System.out.print(a + " " +b);
//     }
//     public static void main (String[] args){

//     }
// }
//+++++++++++++++++++++++++++++++++++++
// class E {
//     int a=10; 
//     static int b=20;
//     static {
//         System.out.print(b);
//     }
//     public static void main (String[] args){

//     }
// }

/* Instance block can access both variable */
class E {
    int a = 10;
    static int b = 20;
    {
        System.out.print(a + " " + b);
    }

    public static void main(String[] args) {
        E r = new E(); // without object we can't be access any variable
    }
}