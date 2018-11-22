class OddOrEven 
	{
	static void getData(int i)
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
class TestNumber
	{
	public static void main(String args[])
		{
		OddOrEven.getData(507);		
		}
	}
