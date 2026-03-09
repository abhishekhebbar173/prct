package Methods;

public class MethodCallinganotherMethod {
	
	
	static void display()
	{
		System.out.println("Inside display method");
	}
	
	static void show()
	{
		display();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		show();
	

	}

}
