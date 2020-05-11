package com.ncu.menu;
import java.io.*;
import java.util.*;
public class Show
{
public void show()
{
    //For opening file
    File fname= new File("C:\\java programmes\\UNGUIDED PROJECT 1\\data\\Tasks.txt"); 
    System.out.println("<|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||>");
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
        System.out.println("--------ERROR IN READING FILE NAMED---------- " + fname + "'");
    }
     System.out.println("||*                                                                         *||");
     System.out.println("||***************************************************************************||");
     System.out.println("<|||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||||>");
     System.out.println("                                                                               ");
     int x;
        
        System.out.println("\t\t||****************************************************||");
        System.out.println("\t\t||------------- PRESS 1 TO GO BACK TO START----------*||");
        System.out.println("\t\t||*__________________________________________________*||");
        System.out.println("\t\t||****************************************************||");
        
        Start ss=new Start();
        Scanner  ob=new Scanner(System.in);
        x=ob.nextInt();
        if(x==1)
        {
            Deletecmd d =new Deletecmd();
            d.delete();
            ss.start();
        }
}
}