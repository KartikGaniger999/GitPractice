
public class A 
{
	private int x;
	
	public int getA()
	{
		return x;
	}
	
	public void set(int x)
	{
		this.x=x;
	}
	
}

class B extends A
{
	public static void main(String[] args) 
	{
	final B b=new B();
	b.set(10);
	System.out.println(b.getA());
	}
}