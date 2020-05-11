package com.ncu.menu;
import java.io.*;
import java.util.*;
public class Updatehour
 {  
    public void hour() 
    {
        int x;
        Scanner input=new Scanner(System.in);
        Showfile h=new Showfile();
        h.show();
        System.out.println("Enter the hour you want to change :");
        String STRING_A=input.nextLine();
        String STRING_B;
        System.out.println("Enter the new hour :");
            STRING_B=input.nextLine();
        //1
        String originalFilePath = "C:\\java programmes\\UNGUIDED PROJECT 1\\data\\Tasks.txt";
        String originalFileContent = "";
        //2
        BufferedReader reader = null;
        BufferedWriter writer = null;
        //3
        try 
        {
            //4
            reader = new BufferedReader(new FileReader(originalFilePath));
            //5
            String currentReadingLine = reader.readLine();
            //6
            while (currentReadingLine != null) 
            {
                originalFileContent += currentReadingLine + System.lineSeparator();
                currentReadingLine = reader.readLine();
            }
            //7
            String modifiedFileContent = originalFileContent.replaceAll(STRING_A, STRING_B);
            //8
            writer = new BufferedWriter(new FileWriter(originalFilePath));
            //9
            writer.write(modifiedFileContent);
        } 
        catch (IOException e) 
        {
            //handle exception
        } 
        finally 
        {
            //10
            try 
            {
                if (reader != null) 
                {
                    reader.close();
                }
                if (writer != null) 
                {
                    writer.close();
                }
            } 
            catch (IOException e) 
            {
                //handle exception
            }
        }
        System.out.println("\t\t||*----------------DONE--------------*||");
        System.out.println("\t\t||****************************************************||");
        System.out.println("\t\t||------------- PRESS 1 TO GO BACK TO START----------*||");
        System.out.println("\t\t||*__________________________________________________*||");
        System.out.println("\t\t||****************************************************||");
        
        System.out.println("*********************************************************************************************************");
        Start ss=new Start();
        x=input.nextInt();
        if(x==1)
        {
            Deletecmd d =new Deletecmd();
            d.delete();
            ss.start();
        }
    }
}