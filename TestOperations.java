class Operations
	{
		//called method
	   static int SumOfTwoNumbers(int x,int y)
		{
			int a=x+y;
			return a;
		}
	   static int MulOfTwoNumbers(int v,int u)
		{
			int b=v*u;
			return b;
		}
	   static float DivisionOfTwoNumbers(int w,int s)
		{
			float c=(float)w/s;	
			return c;
		}
	   static double SubOfTwoNumbers(int f,int e)
		{
			double d=f-e;
			return d;
		}
	
	}
	class TestOperations
		{
		//calling method
		public static void main(String args[])
			{
			int A=Operations.SumOfTwoNumbers(10,20);
			System.out.println("A is:"+A);
			int B=Operations.MulOfTwoNumbers(30,650);
			System.out.println("B is:"+B);
			float C=Operations.DivisionOfTwoNumbers(50,20);
			System.out.println("C is:"+C);
			double D=Operations.SubOfTwoNumbers(500,220);
			System.out.println("D is:"+D);
			}
		}
