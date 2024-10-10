import java.util.InputMismatchException;
import java.util.Scanner;

public class Boolean
{
public static Boolean getBoolean()
	{
		
	Scanner scan = new Scanner(System.in);
	System.out.println("Please input a Boolean");
	try
	{
		return scan.nextBoolean();
	}
	//return scan.nextBoolean();
	//catch block for InputMismatchException which returns null
	catch (InputMismatchException e)
	{
		return null;
	}
	finally
	{
		scan.nextLine();
	}
	}
	public static void main(String [] args)
	{
		System.out.println(getBoolean());
	}
}	