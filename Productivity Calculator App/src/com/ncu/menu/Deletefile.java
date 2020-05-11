package com.ncu.menu;
import java.io.*;
import java.util.*;
public class Deletefile
{
	public void deletefile()
	{
		Scanner s=new Scanner(System.in);
		int x;
		x=1;
	    File file=new File("C:\\java programmes\\UNGUIDED PROJECT 1\\data\\Tasks.txt");
	    System.out.println("\t\t||****************************************************||");
	    System.out.println("\t\t||*-------- ENTER THE FILE YOU WANT TO DELETE -------*||");
	    System.out.println("\t\t||*__________________________________________________*||");
	    System.out.println("\t\t||****************************************************||");
	    String source;
	    source=s.nextLine();
	    String g;
	    int flag=0,ab=0,i;
	    try
	    {
	        FileReader z = new FileReader(file); 
	   	    BufferedReader b = new BufferedReader(z);
	   	    while((g=b.readLine())!=null)
	   	    {
	   	    	flag++;
	   	    }
	   	    b.close();
	   	}
	   	catch(Exception e)
	   	{
	   		System.out.println(e);
	   	}
	    flag--;
	    //System.out.println(flag);
	    String [] data= new String[flag];
	    try
	    {
	    	FileReader a = new FileReader(file);
    		BufferedReader c = new BufferedReader(a);
    		BufferedWriter w= new BufferedWriter(new FileWriter(file));
    		{
    			String hell;
    			while((hell=c.readLine())!=null)
    			{
    				System.out.println(hell);
    				String[] data0 = hell.split(",");
    				if((data0[0].equals(source))==false)
    				{
    					for(i=0;i<flag;i++)
    					{
    				     	data[i]=hell;
    				     	System.out.println(data[i]);
    						w.write(data[i]);
    					}
    				}
    			}
    		}
    		w.close();
    		c.close();
	    }
	    catch(Exception e)
	    {
	    	System.out.println(e);
	    }
	    System.out.println("\t\t||-----------DONE-----------\n");

	    System.out.println("\t\t||****************************************************||");
	    System.out.println("\t\t||------------- PRESS 1 TO GO BACK TO START----------*||");
	    System.out.println("\t\t||*__________________________________________________*||");
	    System.out.println("\t\t||****************************************************||");
	    
	    if(x==1)
	    {
	    	Start ss=new Start();
	    	ss.start();
	    }
	}
}