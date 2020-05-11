package com.ncu.validators;
import com.ncu.exceptions.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.io.*;
import java.util.*;
public class NameValidator 
{
	public boolean nameValidator(String username)
	{
		//System.out.println("user name is: "+username);
	    boolean b;
	    Properties prop = new Properties();
        FileInputStream input=null;
		try
		{
			input = new FileInputStream("C:\\java programmes\\UNGUIDED PROJECT 1\\configs\\constants\\exceptions.properties");
            prop.load(input);
            MissSpecialCharacter(username);
			EmptyFileName(username);
            UserLength(username);
		}
		catch(MissSpecialCharacterException e)
		{
			String s =prop.getProperty("missSPcharacterMessage");
			System.out.println(s);
			return false;
		}
		catch(EmptyFileNameException e)
		{
			String s =prop.getProperty("emptyNameMessage");
			System.out.println(s);
			return false;
		}
		catch(UserLengthException e)
		{
			String s =prop.getProperty("shortNameMessage");
			System.out.println(s);
			return false;
		}
		catch(Exception e)
		{
			System.out.println(e);
			return false;
		}

	    return true;
	}
	private void MissSpecialCharacter(String username) throws MissSpecialCharacterException
	{
		Pattern costPattern = Pattern.compile("[@]");
        Matcher costMatcher = costPattern.matcher(username);
        boolean value = costMatcher.find();
        if (value==false)
        	throw new MissSpecialCharacterException("Miss Special Character Exception");
	}
	private void EmptyFileName(String username) throws EmptyFileNameException
    {
    	if(username=="")
    		throw new EmptyFileNameException("Empty User Name Exception");
    }
    private void UserLength(String username) throws UserLengthException
    {
		int fileLength=8;
		if(username.length()<=fileLength)
			throw new UserLengthException("User Length Exception");
	}
}
