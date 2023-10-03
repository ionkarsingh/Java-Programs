//Program to Implement Pure Run Time Polymorphism

public class RunTimePolymorphism
{
	public static void main(String[] args)
	{
		Shape s ;
		
		s = new Shape();
		s.show();

		//getting random shape Circle/ Square
		s = s.getShape();
		s.show();
	}
}

class Shape
{
	public Shape getShape()
	{
		Shape s;
		int r;
		java.util.Random rn = new java.util.Random();
		r = rn.nextInt(6); //0 - 5 Range
		if(r % 2 == 0)
			s = new Circle();
		else
			s = new Square();
		return s;		
	}

	public void show()
	{
		System.out.println("I am random shape");
	}
}

class Circle extends Shape
{
	public void show()
	{
		System.out.println("I am Circle.");
	}
}

class Square extends Shape
{
	public void show()
	{
		System.out.println("I am Square.");
	}
}