package Day12;

public class PolymorphismProgram 
{
	
	int A;
	int B;
	
	
	void Add()
	{
		System.out.println(A+B);
	}
	
	void Add (int a, int b)
	{
		System.out.println("Addition Of A and B :"+(a+b));
	}
	
	void Add (int a, double b)
	{
		System.out.println("Addition of Two Number:"+ (a+b));
	}
	
	void Add(double a, int b)
	{
		System.out.println("Addition of two number :"+a+b);
	}

}
