//implementing upcasting/ downcasting, hierarchical inheritance, overriding, run time polymorphism, dynamic method dispatch

public class Inheritance
{
	public static void main(String[] args)
	{
		Parent p;

		p = new Parent();
		p.showEducation();
		p.showReligion();

		//upcasting Parent Reference connecting Child Object
		p = new Child1();
		p.showEducation();
		p.showReligion();

		//Down Casting due to few methods not defined in Parent Class
		//So cannot call methods with Parent reference
		Child1 c1;
		c1 = (Child1) p;
		c1.showJob();

		//upcasting Parent Reference connecting another Child Object
		p = new Child2();
		p.showEducation();
		p.showReligion();

		Child2 c2;
		c2 = (Child2) p;
		c2.showBusiness();
	}
}

class Parent
{
	public void showEducation()
	{
		System.out.println("B.A.");
	}	
	final public void showReligion()
	{
		System.out.println("Hinduism");
	}
}

class Child1 extends Parent
{
	public void showEducation()
	{
		System.out.println("B.Tech");
	}
	public void showJob()
	{
		System.out.println("Doing job");
	}
}

class Child2 extends Parent
{
	public void showEducation()
	{
		System.out.println("MBA");
	}
	public void showBusiness()
	{
		System.out.println("Doing Business");
	}
}