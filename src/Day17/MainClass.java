package Day17;

public class MainClass implements I1,I2
{
	public void m1()
	{
		System.out.println(X);
	}
	
	public void m2()
	{
		System.out.println(Y);
	}

	public static void main(String[] args) 
	{
		MainClass obj= new MainClass();
		obj.A1();
		obj.A2();
		obj.m1();
		obj.m2();
		I1.B1();
		I2.B2();
	
		

	}

}
