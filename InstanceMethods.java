package Methods;

public class InstanceMethods {

	
	int  mutliply(int a,int b)
	{
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InstanceMethods im=new InstanceMethods();
		System.out.println(im.mutliply(3, 5));
		
		System.out.println("New line added as tester");

	}

}
