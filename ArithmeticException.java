//perform integer division

public class ArithmeticException
{
	public static void divide(int n,int d)

	{
	if (d==0)
	{
		System.out.println("Division by zero");
	}
	else
	{
	System.out.println(n / d);
	}
	}

public static void main(String[] args)
{
	divide(20,4);
}
}