//Local Nested Class (Inside Method or Local Scope)

public class LocalInner
{
	public static void main(String[] args)
	{
		new A().show();
	}
}

//Enclosing Class
class A
{
	int x = 10;
	public void show()
	{
		int y = 20;
		
		//Local Class defined in a Method with Local Scope
		class B
		{
			int z = 30;
			public void display()
			{
				System.out.println("hello world");
				System.out.println(x);
				System.out.println(y);
				System.out.println(z);
			}
		}

		//using Local Class in same scope
		B b = new B();
		b.display();
	}
}