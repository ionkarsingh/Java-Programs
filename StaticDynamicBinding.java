//Static and Dynamic Binding Demonstration

public class StaticDynamicBinding
{
	public static void main(String[] args)
	{
		//upcasting
		Person p = new Student();

		p.doSomething();
		p.whoAmI();
	}
}

class Person
{
	//static binding always calls with Parent class reference
	public static void doSomething()
	{
		System.out.println("I am doing Something.");
	}

	//dynamic binding always class with Active Object with reference
	public void whoAmI()
	{
		System.out.println("I am Person.");
	}
}

class Student extends Person
{
	public static void doSomething()
	{
		System.out.println("I am Studying.");
	}

	public void whoAmI()
	{
		System.out.println("I am Student.");
	}
}