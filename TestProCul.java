class Evee
	{
	static int getData(int i)
		{
		if (i%2==0)
			{	
			System.out.println("Number is even");
			}	
		else
		{
		System.out.println("Number is  odd");
		}	
		}
	}
class TestProCul
	{
	public static void main(String args[])
		{
		int x=Evee.getData(20);	
		}
	}
