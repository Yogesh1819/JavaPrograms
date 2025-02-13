package Day17;

public class WrapperClass {

	public static void main(String[] args) {
	
		String s="5";
		String s2="3";
		
		System.out.println(Integer.parseInt(s)+Integer.parseInt(s2));
		int A=Integer.parseInt(s)-Integer.parseInt(s2);
		System.out.println(A);
		int B=Integer.parseInt(s)*Integer.parseInt(s2);
		System.out.println(B);
		
		int C=10;
		double D=2.5;
		float E=100.5F;
		boolean F=true;
		
		
	String obj=String.valueOf(C);
	System.out.println(obj);
	
	String obj2=String.valueOf(D);
	System.out.println(obj2);
	
	String obj3=String.valueOf(E);
	System.out.println(obj3);
	
	String obj4=String.valueOf(F);
	System.out.println(obj4);
	
	String G="true";
	System.out.println(Boolean.parseBoolean(G));

	}

}
