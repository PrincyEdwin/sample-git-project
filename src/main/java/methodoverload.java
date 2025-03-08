
public class methodoverload {

	
	void sum (int a, int b)
	{
		System.out.println(a+b);
	}
	
	void sum(int a, int b,int c)
	{
		System.out.println(a+b+c);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		methodoverload obj = new methodoverload();
		obj.sum(12, 45);
		obj.sum(10, 25,39);
	}

}

// when you have 2 functions or methods with same name you need to have different parameters.
// this is called method overload.