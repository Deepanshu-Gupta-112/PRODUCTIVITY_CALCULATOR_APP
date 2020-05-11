package com.ncu.menu;
import java.util.*;
public class Start
{
	public void start()
	{
		int y;
		Scanner s=new Scanner(System.in);
		int x;
		Adding a=new Adding();
		Show sss=new Show();
		Updateroutine u=new Updateroutine();
		Deletefile d=new Deletefile();
		Times t=new Times();
		Deletecmd dc =new Deletecmd();
		Updatehour c=new Updatehour();
		Deleterecord w=new Deleterecord();
		System.out.println("||******************************************************************************************||");
		System.out.println("||*\t\t\tPRODUCTIVITY APP                                                   *||");
		System.out.println("||*\t\t CHOOSE WHAT YOU WANT TO DO IN THIS APP :                                  *||");
		System.out.println("||*\t\t 1. ADD                                                                    *||");
		System.out.println("||*\t\t 2. SHOW                                                                   *||");
		System.out.println("||*\t\t 3. UPDATE                                                                 *||");
		System.out.println("||*\t\t 4. DELETE FILE                                                            *||");
		System.out.println("||*\t\t 5. DELETE RECORD                                                          *||");
		System.out.println("||*\t\t 6. SHOW HOURS                                                             *||");
		System.out.println("||*\t\t                                                                           *||");
		System.out.println("||******************************************************************************************||");

		System.out.print("\t\t ---->...... ");
		x=s.nextInt();
		if(x==1)
		{			
            dc.delete();
			a.add();
		}
		else if(x==2)
		{
			dc.delete();
			sss.show();
		}
		else if(x==3)
		{
			System.out.println("                                                                              ");
			System.out.println("||***********************************************************||");
			System.out.println("||*\t\t ----PRESS 1 TO UPDATE ROUTINE----          *||");
			System.out.println("||*\t\t -----PRESS 2 TO UPDATE HOURS-----          *||");
			System.out.println("||***********************************************************||");
			y=s.nextInt();
			if(y==1)
			{
			    dc.delete();
			    u.update();
			}
			else if(y==2)
			{
				dc.delete();
				c.hour();
			}
			else
			{
				System.out.println("Invalid response...");
			}
		}
		else if(x==4)
		{
			dc.delete();
			d.deletefile();
		}
		else if(x==5)
		{
			dc.delete();
			w.record();
		}
		else if(x==6)
		{
			dc.delete();
			t.time();
		}
		else
		{
			System.out.println("Invalid response...");
		}
	} 
}