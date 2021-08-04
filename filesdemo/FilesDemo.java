package filesdemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
//import java.io.FileWriter;
import java.io.IOException;

public class FilesDemo {
  
    public static void appendStrToFile(String fileName,String str)
    {
        try {
  
            // Open given file in append mode.
            BufferedWriter out = new BufferedWriter(
                   new FileWriter(fileName, true));
            out.write(str);
            out.close();
        }
        catch (IOException e) {
            System.out.println("exception occoured" + e);
        }
    }
  
    public static void main(String[] args)
        throws Exception
    {
        // Let us create a sample file with some text
        String fileName = "D://simple.txt";
        BufferedReader in;
        try {
        	  in = new BufferedReader(
                      new FileReader(fileName));
            String mystring;
            while ((mystring = in.readLine()) != null) {
                System.out.println(mystring);
            }
        }
        catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
  
        // Let us append given str to above
        // created file.
        String str = "This is new words";
        appendStrToFile(fileName, str);
  
        // Let us print modified file
        try {
             in = new BufferedReader(
                        new FileReader(fileName));
  
            String mystring;
            while ((mystring = in.readLine()) != null) {
                System.out.println(mystring);
            }
        }
        catch (IOException e) {
            System.out.println("Exception Occurred" + e);
        }
        
    }
}