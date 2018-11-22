class Mul
{	
	int n;
	Mul(int n)
	{
	this.n=n;		
	}					
	void getData()
	{	
	for(int i=200;i<300;i++)
	{	
	if(i%n==0)
	{
	System.out.println(i +"is 5 multiple");
	}
	}
	}
}


class TestMul
	{
	public static void main(String args[])
		{
		Mul obj=new Mul(5);
		obj.getData();
		}

	}

