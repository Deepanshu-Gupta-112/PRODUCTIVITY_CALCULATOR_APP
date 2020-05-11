package com.ncu.menu;
import java.io.*;
import java.util.*;
public class Showfile
{
    public void show()
    {
        //For opening file
        File fname= new File("C:\\java programmes\\UNGUIDED PROJECT 1\\data\\Tasks.txt");   
        System.out.println("||^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^||\n");
        System.out.println("||***************************************************************************||");
        System.out.println("||*                                                                         *||");

        // this will reference only one line at a time 
        String line = null;
        try
        {
            /* FileReader reads text files in the default encoding */
            FileReader fileReader = new FileReader(fname);

            /* always wrap the FileReader in BufferedReader */
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null)
            {
                System.out.println(line);
            }

            /* always close the file after use */
            bufferedReader.close();
        }
        catch(IOException ex)
        {
            System.out.println("ERROR IN READING FILE NAMED " + fname + "'");
        }
        System.out.println("||*                                                                         *||");
        System.out.println("||***************************************************************************||");
        System.out.println("||^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^||\n");
        
    }   
}