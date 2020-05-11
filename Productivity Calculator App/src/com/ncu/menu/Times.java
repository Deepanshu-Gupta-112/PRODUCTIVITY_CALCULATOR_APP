package com.ncu.menu;
import java.io.*;  
import java.util.*;
public class Times
{  
	public void time()   
	{  
		String line = "";  
		String splitBy = ",";  
		int sum=0;
		String str;
		int x;
		Scanner ck=new Scanner(System.in);  
		try   
		{  
			//parsing a CSV file into BufferedReader class constructor  
			BufferedReader br = new BufferedReader(new FileReader("C:\\java programmes\\UNGUIDED PROJECT 1\\data\\Tasks.txt"));  
			while ((line = br.readLine()) != null)   //returns a Boolean value  
			{  
				String[]  time = line.split(splitBy);    // use comma as separator  
				str=time[2];
				int num=Integer.parseInt(str);
				sum+=num;
			}  
		}  
		catch (IOException e)   
		{  
		    e.printStackTrace();  
		} 
		Deletecmd dc =new Deletecmd();
        dc.delete();
		System.out.println("\t\t||****************************************************************************||"); 
		System.out.println("\t\t||*                                                                          *||"); 
		System.out.println("\t\t||*-----------------TOTAL TIME CONSUMED IN A DAY Is "+sum+" HOURS -----------------*||"); 
		System.out.println("\t\t||*                                                                          *||");
		System.out.println("\t\t||****************************************************************************||"); 
		if(sum<24)
		{
			int a=24;
			a-=sum;
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n");

			System.out.println("\t\t||**********************************************************************||");
			System.out.println("\t\t||*                                                                    *||");
			System.out.println("\t\t||*----------------YOU CAN ADD YOUR SCHEDULE BY : "+a+" Hours-------------*||");
			System.out.println("\t\t||                                                                      ||");
			System.out.println("\t\t||**********************************************************************||");

			System.out.println("------------------------------------------------------------------------------------------\n");

			System.out.println("                                                      \n"); 

			System.out.println("\t\t||****************************************************||");
	        System.out.println("\t\t||------------- PRESS 1 TO GO BACK TO START----------*||");
	        System.out.println("\t\t||*__________________________________________________*||");
	        System.out.println("\t\t||****************************************************||");
	    		
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n"); 
			Start ss=new Start();
	        x=ck.nextInt();
	        if(x==1)
	        {
	            Deletecmd d =new Deletecmd();
	            d.delete();
	            ss.start();
	        }
		}
		if(sum>24)
		{
			int a=-24;
			a+=sum;
			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n");

			System.out.println("\t\t||**********************************************************************||");
			System.out.println("\t\t||*                                                                    *||");
			System.out.println("\t\t||*-------------YOU HAVE TO CHANGE SCHEDULE BY: "+a+" Hours------------*||");
			System.out.println("\t\t||*                                                                    *||"); 
			System.out.println("\t\t||**********************************************************************||");

			System.out.println("<><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><><>\n"); 
			//calling of main menu

			System.out.println("\t\t||****************************************************||");
	        System.out.println("\t\t||------------- PRESS 1 TO GO BACK TO START----------*||");
	        System.out.println("\t\t||*__________________________________________________*||");
	        System.out.println("\t\t||****************************************************||");
	        System.out.println("                                                          \n");
	    
			
	        Start ss=new Start();
	        x=ck.nextInt();
	        if(x==1)
	        {
	            Deletecmd d =new Deletecmd();
	            d.delete();
	            ss.start();
	        }
		}
	}  
}  