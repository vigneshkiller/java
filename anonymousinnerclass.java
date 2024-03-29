package anonymous;

class kalees
{
	void test()
	{
		System.out.println("adding");
	}
}

public class anonymousinnerclass  {
	
	public void test()
	{
		System.out.println("testing");
	}
	
	
	public static void main(String args[])
	{
		anonymousinnerclass am=new anonymousinnerclass();
		kalees t=new kalees();
		am.test();
		t.test();
	}
	
}
/*
{
kalees t=new kalees()
		{
	public void test()
	{
		
		System.out.println("testing");
	}
	
	};
	
	t.test();
	///t.test1();//never ever a obj of this class.
	
	



}
*/