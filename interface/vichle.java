// /**
//  * vichle
//  */
// interface vechical 
// {
//     String Name="TVS";  //Public + Static + final
//     int Speed=100;  // Public + Static + Final

//     void start();   //public + abstract
//     void stop();    // public + abstract

// }
// class Customer implements vechical
// {
//     public void start()
//     {
//         System.out.println("start(): insert key and press start button");
//     }
//     public void stop()
//     {
//         System.out.println("stop(): exit key");
//     }

//     public static void main (String[] args)
//     {
//         Customer c=new Customer();
//         c.start();
//         c.stop();
//     }
// }

/**
 * vichle
 */
interface vechical {
    String Name = "TVS"; // Public + Static + final
    int Speed = 100; // Public + Static + Final

    void start(); // public + abstract

    void stop(); // public + abstract

}

class Customer implements vechical {
    public void start() {
        System.out.print("Name of vechile company " + Name);
        System.out.println("start(): insert key and press start button");
    }

    public void stop() {
        System.out.println("stop(): exit key");
    }

    public static void main (String[] args)
    {
        Customer c=new Customer();
        c.start();
        c.stop();
        System.out.println("Vechile speed is : "+ speed +"km")
    }
}