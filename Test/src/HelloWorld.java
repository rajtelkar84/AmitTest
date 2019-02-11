
public  class HelloWorld {
	
	int i =10;
	
	public static class abc{
		
		static void pqt()
				{
					System.out.println("pqt");
				}
		
	}
	
	
	public class cde
	{
		void wqr()
		{
			System.out.println("wqr");
		}
	}
	public static void main(String args[])
	{
		abc a = new abc();
		HelloWorld hw = new HelloWorld();
		HelloWorld.cde c =  hw.new cde();
		c.wqr();
		
		a.pqt();
		System.out.println("Hello World");
	}

}

