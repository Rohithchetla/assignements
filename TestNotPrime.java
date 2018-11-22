class PrimeNot
{
	int a;
	PrimeNot(int a)
	{
	this.a=a;		
	}						
	void getData()
	{	
	int count=1;
	for(int i=1;i<a;i++)
		{	
			if(a%i==0)
			{
			count++;
			}
		}
	if(count==2)
	{
	System.out.println(a+"is prime number");
	}
	else
	{
	System.out.println(a+"is not prime number");
	}
	}
}


class TestNotPrime
	{
	public static void main(String args[])
		{
		PrimeNot obj=new PrimeNot(20);
		obj.getData();
		}

	}

