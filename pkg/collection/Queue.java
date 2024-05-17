import java.util.ArrayDeque;

class stack {
    public static void main(String[] args) {
        ArrayDeque<String> Name = new ArrayDeque<>(); // FIFO
        Name.add("Surya");
        Name.add("Aaradhya");
        Name.add("Shital");

        System.out.println(Name);

        // Adding new element in LinkedList in last
        Name.add("Saigal");
        System.out.println(Name);

        // Deleting element from First index
        Name.remove();
        System.out.println(Name);

    }
}
