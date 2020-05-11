package com.ncu.menu;
import java.util.*;
import java.io.*;
public class Adding
{
	public void add()
	{
		Scanner sc = new Scanner(System.in);
		try
		{
			File f1 = new File("C:\\java programmes\\UNGUIDED PROJECT 1\\data\\Tasks.txt");  
			//if(f1.createNewFile()){
			//System.out.println("File Created with File Name : "+f1.getName());
			FileWriter fw = new FileWriter(f1,true);
			BufferedWriter bw = new BufferedWriter(fw);
			int another = 1;
			do
			{
				Showfile h=new Showfile();
				h.show();
				System.out.println("\t\t||**********************************************||");	
				System.out.println("\t\t||*                                            *||");	
				System.out.println("\t\t||*-------------ENTER ROUTINE TASK------------:*||");
				System.out.println("\t\t||*                                            *||");
				System.out.println("\t\t||**********************************************||");
				System.out.println("                                                      ");               
				String task = sc.next();
				bw.write(task+",");
				System.out.println("                                                    ");
				System.out.println("\t\t||******************************************************||");
				System.out.println("\t\t||*                                                    *||");
				System.out.println("\t\t||*--- ENTER CATEGORY (PRODUCTIVE /NON-PRODUCTIVE) :---*||");
				System.out.println("\t\t||*                                                    *||");
				System.out.println("\t\t||******************************************************||");
				System.out.println("                                                              ");
 				String category = sc.next();
 				bw.write(category+",");		
 				int time;
                System.out.println("\t\t||****************************************************||");
                System.out.println("\t\t||*                                                  *||");
                System.out.println("\t\t||*----------------ENTER TIME(HOURS) :---------------*||");
                System.out.println("\t\t||*                                                  *||");
                System.out.println("\t\t||****************************************************||");
                System.out.println("                                                            ");
				time = sc.nextInt();
				bw.write(time+"");	
 				System.out.println("\t\t||****************************************************||");	
 				System.out.println("\t\t||*-----PRESS 1 TO ADD ANOTHER TASK OR 0 TO LEAVE----*||");
 				System.out.println("\t\t||*__________________________________________________*||");
 				System.out.println("\t\t||****************************************************||");
 				System.out.println("                                                            ");
 				another = sc.nextInt();
 				bw.newLine();
			}	
	 		while(another==1);
	 		bw.close();	
		} 
		catch(IOException e1)
		{
			System.out.println("\t\t||****************************************************||");
			System.out.println("\t\t||*-------------------ERROR OCCURED------------------*||");
			System.out.println("\t\t||*                                                  *||");
			System.out.println("\t\t||****************************************************||");
			System.out.println("\t\t||                                                    ||");
			e1.printStackTrace();
		}
		int x;

	    System.out.println("\t\t||****************************************************||");
	    System.out.println("\t\t||------------- PRESS 1 TO GO BACK TO START----------*||");
	    System.out.println("\t\t||*__________________________________________________*||");
	    System.out.println("\t\t||****************************************************||");
	    
	    Start ss=new Start();
	    x=sc.nextInt();
	    if(x==1)
	    {
	    	Deletecmd d =new Deletecmd();
            d.delete();
            ss.start();
        }
	}
}