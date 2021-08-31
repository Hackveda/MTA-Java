package Abstraction_code;

public class C 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		A a = new B();
		a.changeGear(12);
		((B) a).printStates();

	}

}
