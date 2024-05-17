package File_Handling;

import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) throws IOException {
        File f=new File("C:\\Users\\acer\\Desktop\\JAVA_Tutorial\\File_Handling\\test.txt");
        if (f.createNewFile()) {
            System.out.print("File Successfully created.");
        }
        else {
            System.out.println("File already exists.");
        }
    }
}


// import java.io.File;
// import java.io.IOException;

// public class CreateFileExample {
//     public static void main(String[] args) throws IOException {
//         File file = new File("example.txt");
//         if (file.createNewFile()) {
//             System.out.println("File created successfully.");
//         } else {
//             System.out.println("File already exists.");
//         }
//     }
// }