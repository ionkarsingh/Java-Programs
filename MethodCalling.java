//Call by Value and Call by Reference Methods Calling

public class MethodCalling
{
	public static void main(String[] args)
	{
		Sum s = new Sum();

		int a=10, b=20;
		System.out.println(a + " " + b);
		s.doSwap(a, b); //call by value
		System.out.println(a + " " + b);

		Num p = new Num(10);
		Num q = new Num(20);
		System.out.println(p.n + " " + q.n);
		s.doSwap(p, q); //call by reference
		System.out.println(p.n + " " + q.n);

	}
}

class Num
{
	int n;
	public Num(int t)
	{
		n = t;
	}
}

class Sum
{
	public void doSum(Num a, Num b)
	{
		System.out.println(a.n + b.n);
	}
		
	public void doSwap(int a, int b)
	{
		int c;
		c = a;
		a = b;
		b = c;
	}
	
	//method overloading doSwap already defined above with different parameters
	public void doSwap(Num a, Num b)
	{
		Num c = new Num(0);
		c.n = a.n;
		a.n = b.n;
		b.n = c.n;
	}
}