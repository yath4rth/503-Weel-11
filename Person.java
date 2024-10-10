public class Person 
{
	
	String name;
	Integer age;
	
	//complete the constructor here
	public Person(String name, int age) throws InvalidAgeException
	{
		if(age<0 || age>150)
		{
			throw new InvalidAgeException("Out of Range");
		}
		this.name = name;
		this.age = age;
	}
	public static void main(String[] args)
	{
		try
		{
		    Person bob = new Person("bob",50);
		    System.out.println("name = "+bob.name+"\n"+"age = "+bob.age);
		}
		catch(InvalidAgeException e)
		{
		    System.out.println(e.getMessage());
		}
	}
}