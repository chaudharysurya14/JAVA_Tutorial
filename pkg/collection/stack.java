import java.util.Stack;

class stack {
    public static void main(String[] args) {
        Stack<String> Name = new Stack<>(); // LIFO
        Name.add("Surya");
        Name.add("Aaradhya");
        Name.add("Shital");

        System.out.println(Name);

        // Adding new element in LinkedList in last
        Name.push("Saigal");
        System.out.println(Name);

        // Deleting element from Last index
        Name.pop();
        System.out.println(Name);

    }
}
