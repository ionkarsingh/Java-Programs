//Anonymous Class Implementation

public class Anonymous
{
	public static void main(String[] args)
	{
		//Three approaches are there to implement Anonymous class
		//1. Extending a Class
		new X()
		{
			public void show()
			{
				System.out.println("I am Anonymous X.");
			}
		}.show();

		//2. Implementing an Interface
		new Y()
		{
			public void show()
			{
				System.out.println("I am Anonymous Y.");
			}
		}.show();
		
		//3. Passing an Anonymous class to a method
		new Z().display(
			new Y(){
				public void show()
				{
					System.out.println("I am Anonymous Z.");
				}
			}
		);
	}
}

class X
{
	public void show()
	{
		System.out.println("I am X.");
	}
}

interface Y
{
	void show();
}

class Z
{
	public void display(Y ref)
	{
		ref.show();
	}
}