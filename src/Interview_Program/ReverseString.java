package Interview_Program;

public class ReverseString {

	public static void main(String[] args) 
	{
		String A ="Yogesh";
		String B="";
		
		for (int i=A.length()-1;i>=0;i--)
		{
			B+=A.charAt(i);
		}
		System.out.println(B);
	

	}

}
