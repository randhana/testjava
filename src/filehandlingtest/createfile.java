
package filehandlingtest;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class createfile {
    public static void main(String[] args) throws IOException 
    { 
        // Accept a string  jk
        String str = "File Handling in Java using "+ 
                " FileWriter and FileReader"; 
  
        // read character wise from string and write
        // into FileWriter
        try ( // attach a file to FileWriter
                FileWriter fw = new FileWriter("output.txt")) {
            // read character wise from string and write
            // into FileWriter
            for (int i = 0; i < str.length(); i++)
                fw.write(str.charAt(i));
            System.out.println("Writing successful\nDone!");
            //close the file
        } 
  
    
     int ch; 
  
        // check if File exists or not 
        FileReader fr=null; 
        try
        { 
            fr = new FileReader("output.txt"); 
        } 
        catch (FileNotFoundException fe) 
        { 
            System.out.println("File not found"); 
        } 
  
        // read from FileReader till the end of file 
        while ((ch=fr.read())!=-1) 
            System.out.print((char)ch); 
  
        // close the file 
        fr.close(); 
}
}
