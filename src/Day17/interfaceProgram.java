package Day17;

interface I1
{
	int X=3;
	
	void m1();
	
	default void A1()
	{
		System.out.println("This is a deafult method from interface I1..");
	}
	
	static void B1()
	{
		System.out.println("This is a static method from interface I1..");
	}
}
interface I2 extends I1
{
	int Y=2;
	void m2(); 
	
	default void A2()
	{
		System.out.println("This is a default method from interface I2..");
	}
	
	static void B2()
	{
		System.out.println("This is static method from interface I2..");
	}
}



public class interfaceProgram 
{
	
	


}
