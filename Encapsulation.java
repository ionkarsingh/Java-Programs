//Encapsulation with two steps process.
//Step 1. Data Hiding
//Step 2. Getter/ Setter

public class Encapsulation
{
	public static void main(String[] args)
	{
		Person p = new Person();
		//p.age = -700; //can't access
		p.setAge(-700);
		//above wrong value has been set but still showing 18 value
		System.out.println(p.getAge());
	}
}

class Person
{
	//data hiding
	private	int age;

	//getter and setter defined for private members
	public void setAge(int a)
	{
		if(a >= 18 && a <= 60)
			age = a;
		else
			age = 18;
	}

	public int getAge()
	{
		return age;
	}
}