package com.ncu.main;
import com.ncu.menu.*;
import com.ncu.validators.*;
import com.ncu.exceptions.*;
import java.util.*;
public class pmain
{
    public static void main(String[] args) 
    {
    	int x;
	    Scanner s=new Scanner(System.in);
        System.out.println("*******************************************************************************************");
        System.out.println("$#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#$");
        System.out.println("$#                                                                                       #$");
        System.out.println("$#         %        %  %%%%%%%%  %%      %%%%%%%  %%%%%%%%    %%  %%    %%%%%%%          #$");
        System.out.println("$#          %  %   %   %%%%      %%      %%       %%    %%   %  %   %   %%%%             #$");
        System.out.println("$#           %%  %%    %%%%%%%%  %%%%%%  %%%%%%%  %%%%%%%%  %        %  %%%%%%%          #$");
        System.out.println("$#                                                                                       #$");
        System.out.println("$#                               %%%%%%%%%%   %%%%%%%%%%                                 #$");
        System.out.println("$#                                   %%       %%  . . %%                                 #$");
        System.out.println("$#                                   %%       %%   ^  %%                                 #$");
        System.out.println("$#                                   %%       %%%%%%%%%%                                 #$");
        System.out.println("$#                                                                                       #$");
        System.out.println("$#                                 %%%         %%%%%%%   %%%%%%%                         #$");
        System.out.println("$#                               %%   %%       %%   %%   %%   %%                         #$");
        System.out.println("$#                             %%   %   %%     %%%%%     %%%%%                           #$");
        System.out.println("$#                           %%           %%   %%        %%                              #$");
        System.out.println("$#                                                                                       #$");
        System.out.println("$#                              PRODUCTIVITY CALCULATOR APP                              #$");
        System.out.println("$#                                                         IN PROCESS.......             #$");
        System.out.println("$#@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@#$");
        System.out.println("*******************************************************************************************");
        System.out.println("\n");
	    NameValidator n=new NameValidator();
	    String user,pass;
	    boolean b;
	    while(1<2)
	    {
	    	while(1<2)
	    	{
	    		System.out.println("\t\t||****************************************************||");
	    		System.out.println("\t\t||*--------------------------------------------------*||");
     	        System.out.println("\t\t||*--------------- ENTER THE USERNAME :--------------*||");
     	        System.out.println("\t\t||*--------------------------------------------------*||");
     	        System.out.println("\t\t||****************************************************||");
	            user=s.nextLine();
	            b=n.nameValidator(user);
	            if(b==true)
	            {
	            	break;
	            }
	        }
	        while(1<2)
	    	{   
	    		System.out.println("\t\t||****************************************************||");
	    		System.out.println("\t\t||*--------------------------------------------------*||");
	            System.out.println("\t\t||*--------------ENTER THE PASSWORD :----------------*||");
	            System.out.println("\t\t||*--------------------------------------------------*||");
	            System.out.println("\t\t||****************************************************||");
	            pass=s.nextLine();
	            b=n.nameValidator(pass);
	            if(b==true)
	            {
	            	break;
	            }
	        }
	        if(user.equals("usern@me12") && pass.equals("p@ssword6"))
	        {
	        	Deletecmd d =new Deletecmd();
                d.delete();
	        	System.out.println("\t\t||****************************************************||");
		        System.out.println("\t\t||------------------WELCOME TO THE APP ---------------||");
		        System.out.println("\t\t||____________________________________________________||");
		        System.out.println("\t\t||****************************************************||");
		        x=1;
		        break;
            }
	        else
	            {
	            	System.out.println("\t\t||****************************************************||");
			        System.out.println("\t\t||----------------INVALID SO TRY AGAIN ---------------||");
			        System.out.println("\t\t||____________________________________________________||");
			        System.out.println("\t\t||****************************************************||");
			        System.out.println("                                                            ");
			        /*Deletecmd d =new Deletecmd();
	                d.delete();*/
			        x=0;
	        }
	    }
	    //Deletecmd d =new Deletecmd();
        //d.delete();
	   Start t=new Start();
	    if(x==1)
	    {
	        t.start();
	    }
	}
}
