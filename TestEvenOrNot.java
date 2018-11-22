class EvenOrNot
{						
	void getData()
	{	
	for(int i=10;i<99;i++)
	{	
	if(i%2==0)
	{
	System.out.println(i +"is prime number");
	}
	else
	{
	System.out.println(i +"is not prime number");
	}
	}
	}
}


class TestEvenOrNot
	{
	public static void main(String args[])
		{
		EvenOrNot obj=new EvenOrNot();
		obj.getData();
		}

	}

