package PracticeProgram;

public class Practice {

	public static void main(String[] args)
	{
		
	// Reverse String Program..................
		/*
		String A ="Yogesh";
		String B="";
		
		for (int i=A.length()-1;i>=0;i--)
		{
			B+=A.charAt(i);
			
		}
		System.out.println(B);
	
*/
		
	int B[]= new int [3];
	B[0]=100;
	B[1]=200;
	B[2]=300;
	
	System.out.println(B[2]);
	
	
	int[] A= {1,2,3,4};
	System.out.println(A[3]);
	
	
	
	int [][] C= new int [2][3];
	C[0][0]=100;
	C[0][1]=200;
	C[0][2]=300;
	
	C[1][0]=400;
	C[1][1]=500;
	C[1][2]=600;
	
	System.out.println(C[1][2]);
	
	int D[][]= 
		{
			
				{100,200},
				{300,400},
				{500,600},
				{700,800}
			
	   }; 


	System.out.println(D[0][0]);
	System.out.println(D.length);
	System.out.println(B.length);
	System.out.println(C.length);
	}
	
	
	
	

}
