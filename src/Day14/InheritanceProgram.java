package Day14;
class Parent
{
	void A()
	{
		System.out.println("This is parent class method");
	}
}

class child1 extends Parent
{
	void B()
	{
		System.out.println("This is child1 class method");
	}
}

class child2 extends child1
{
	void C()
	{
		System.out.println("This is child2 class method");
	}
}



public class InheritanceProgram {

	public static void main(String[] args) 
	{
		child2 obj= new child2();
		obj.A();
		obj.B();
		obj.C();
	}

}
