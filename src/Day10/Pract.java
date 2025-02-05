package Day10;

import java.lang.reflect.Constructor;

public class Pract 
{
	
	int Id;
	String Name;
	
	void EmployeeData()
	{
		System.out.println("This is Employee Data");
	}
	

 /*
	{
		System.out.println("This is no params but return value");
		return Name;

	}*/
 
	
	/*void EmployeeData2(String name)
	{
		Name=name;
		System.out.println(name);
	}*/
	
	
	String EmployeeData3(String name)
	{
		System.out.println(name);
		return name;	
	}
	
	Pract()
	{
		System.out.println("This is Default Constructor");
	}
	
	Pract(int Id,String Name)
	{
		this.Id=Id;
		this.Name=Name;
	//	System.out.println(Id+" "+Name);
		System.out.println("This Is Parameterized Constructor");
		
	}
	
	
}
