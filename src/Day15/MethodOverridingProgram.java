package Day15;

class A
{
	int A=10;
    int B=5;
	
  void ArithmaticOperation()
	{
		System.out.println(A+B);
	}
}

class B extends A
{
  

	void ArithmaticOperation() // Method Override 
	{
		System.out.println(super.A-super.B);
		super.ArithmaticOperation();
	}
	
		
}

class C extends A
{
	void ArithmaticOperation() // Method Override
	{
		System.out.println(A*B);
	}
}

public class MethodOverridingProgram 
{

	public static void main(String[] args)
	{

      	B obj = new B();
	    obj.ArithmaticOperation();

		
	}
}
