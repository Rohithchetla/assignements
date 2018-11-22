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
		return i;	
		}
	}
class TestStatc
	{
	public static void main(String args[])
		{
		int x=Evee.getData(867261477);	
		}
	}
