import java.util.LinkedList;

class surya {
    public static void main(String[] args) {
        LinkedList<String> Name = new LinkedList<String>();
        Name.add("Surya");
        Name.add("Aaradhya");
        Name.add("Shital");

        System.out.println(Name);

        // Adding new element in LinkedList in first
        Name.addFirst("Saigal");
        System.out.println(Name);

        // Adding new element in LinkedList in last
        Name.addLast("Shaumya");
        System.out.println(Name);

        // Adding element at index 2
        Name.add(2, "Bhuchan");
        System.out.println(Name);

        // Deleting element from index 0 (Default)
        Name.remove(); // Name.removeLast();
        System.out.println(Name);

        // Deleting element from index 3
        Name.remove(3);
        // System.out.println(Name);

        for (String str : Name) {
            System.out.println(str);
        }
    }
}
