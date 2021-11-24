import Persone.*;
import java.util.*;
import java.io.*;

public class Main 
{

	public static void main(String[] args)
	{
		BufferedWriter filewrite= null;
		try {
			filewrite = new BufferedWriter(new FileWriter("StudentiData.txt"));
			filewrite.write("");
		} catch(IOException e)
		{
			System.out.println(e);
		}
	}
}
