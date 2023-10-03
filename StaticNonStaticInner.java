//Inner Class and Static Inner Class Demo

public class StaticNonStaticInner
{
	public static void main(String[] args)
	{
		//using Inner Class (Approach 1)
		A a = new A();
		a.createB();

		//using Inner Class (Approach 2)
		A.B b2 = new A().new B();
		b2.show();

		//using Static Inner Class
		A.C c = new A.C();
		c.display();
	}
}

class A
{
	//Static Inner Class
	static class C
	{
		public void display()
		{
			System.out.println("hello world");
		}
	}

	public void createB()
	{
		B b = new B();
		b.show();
	}

	//Inner Class
	class B
	{
		public void show()
		{
			System.out.println("hello");
		}
	}	
}
