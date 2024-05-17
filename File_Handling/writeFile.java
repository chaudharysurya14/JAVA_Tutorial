
package File_Handling;

import java.io.FileWriter;
import java.io.IOException;

/**
 * writeFile
 */
public class writeFile {

    public static void main(String[] args) {
        try {
            FileWriter f = new FileWriter("C:\\Users\\acer\\Desktop\\JAVA_Tutorial\\File_Handling\\test.txt");
            try {
                f.write("Java programming is the best language..");
            } finally {
                f.close();
            }
            System.out.println("Data wrote successfully in the file.");
        } catch (IOException i) {
            System.out.println(i);
        }
    }
}