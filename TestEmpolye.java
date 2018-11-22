//DSESIGN OF A EMPOLYE DETAILS
      class Empolye
	{
	  //instance of empolye data
		int    empno;
		String name;
		String town;
		double basic;
		double hra;
		double da;
	//constructor 
		Empolye(int a,String b,String c,double d,double e,double f)
		{
 			this.empno=a;
			this.name=b;
			this.town=c;
			this.basic=d;
			this.hra=e;
			this.da=f;
		}
		//create an employe id
		void Empolye1()
		   {
		      System.out.println("Empolye-1");
		      System.out.println("................");
		      System.out.println("empno is:"+empno);
		      System.out.println("name  is:"+name);
		      System.out.println("town  is:"+town);
		     System.out.println("total salary is:"+(basic+hra+da));
		    }
		void Empolye2()
		   {
		      System.out.println("Empolye-2");
		      System.out.println("................");
		      System.out.println("empno is:"+empno);
		      System.out.println("name  is:"+name);
		      System.out.println("town  is:"+town);
		     System.out.println("total salary is:"+(basic+hra+da));
		    }
		void Empolye3()
		     {
		       System.out.println("Empolye-3");
		      System.out.println("................");
		      System.out.println("empno is:"+empno);
		      System.out.println("name  is:"+name);
		      System.out.println("town  is:"+town);
	     System.out.println("total salary is:"+(basic+hra+da));		
		   }
	}
	                class TestEmpolye
		{
		 	public static void main(String args[])
			{
 		Empolye obj=new Empolye(100,"anil","warangal",10000,1500,1000);
			     obj.Empolye1();
		Empolye obj1=new Empolye(200,"rohith","Delhi",10000,1500,1000);
			     obj1.Empolye2();
	Empolye obj2=new Empolye(300,"ramesh","Rajesthan",10000,1500,1000);
			     obj2.Empolye3();
			    
			}

		}


