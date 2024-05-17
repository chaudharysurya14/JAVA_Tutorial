package pkg.collection;

import java.util.ArrayList;

class firstpublic {
    public static void main(String[] args) {
        ArrayList<String> Name = new ArrayList<String>();
        Name.add("Surya");
        Name.add("Aaradhya");
        Name.add("Shital");

        System.out.println(Name);

        /* Adding new Array */
        Name.add("Saigal");
        System.out.println(Name);

        /* Adding Element on Index 1 */
        Name.add(1, "Shoumya");
        System.out.println(Name);

        /* Adding Element on Index 0 */
        Name.add(0, "Bhuchan");
        System.out.println(Name);

        /* Adding Element from Index 4 */
        Name.remove(4);
        System.out.println(Name);

        /* Replace Element from Index 3 */
        Name.set(3, "shaswati");
        System.out.println(Name);

        /* Print any one particular element from Array */
        System.out.println(Name.get(3));

        /* Delete all element from Array */
        Name.clear();
        System.out.println(Name);

    }
}
