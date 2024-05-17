/* We can handle exception through these two method */

// package File_Handling;

// import java.io.FileReader;
// import java.io.IOException;

// public class readFile {
//     public static void main(String[] args) {
//         try {
//             FileReader r=new FileReader("C:\\Users\\acer\\Desktop\\JAVA_Tutorial\\File_Handling\\test.txt");
//             try {
//                 int i;
//                 while((i=r.read())!=-1) {
//                     System.out.print((char)i);
//                 }
//             }
//             finally {
//                 r.close();
//                 System.out.println("File Closed.");
//             }
//         }
//         catch(IOException e) {
//             System.out.println("Exception Handled....!");
//         }
//     }
// }

package File_Handling;

import java.io.FileReader;
import java.io.IOException;

public class readFile {
    public static void main(String[] args) throws IOException {

        FileReader r = new FileReader("C:\\Users\\acer\\Desktop\\JAVA_Tutorial\\File_Handling\\test.txt");
        try {
            int i;
            while ((i = r.read()) != -1) {
                System.out.print((char) i);
            }
        } finally {
            r.close();
            System.out.println("File Closed.");
        }
    }
}
