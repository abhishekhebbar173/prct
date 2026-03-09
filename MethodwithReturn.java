package Methods;

public class MethodwithReturn {
	
	
	static int square(int n)
	{
		return n*n;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(square(4));
		
		int res=MethodwithReturn.square(5);
		System.out.println(res);

	}

}
