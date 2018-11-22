//CREATE AN EMPLOYE DETAILS WITH STATIC DATA
class Staff
     {
	int IDnumber;
	String Name;
	int salary;
	static String companyName = "Mindtree";	
	//method
	Staff(int IDnumber,String Name ,int salary)
	{
	this.IDnumber=IDnumber;
	this.Name=Name;
	this.salary=salary; 
	}
	void setData()
	{
	System.out.println("Employe:-");
	System.out.println(".............");
	System.out.println("IDnumber is:"+IDnumber);
	System.out.println("Name is"+Name);
	System.out.println("Salary is"+salary);
	}
	
      }
class TestStaff
	{
	public static void main(String args[])
		{
		Staff obj1=new Staff(201,"Raju",50000);
		obj1.setData();
		Staff obj2=new Staff(205,"Ravi",55000);
		obj2.setData();
		Staff obj3=new Staff(210,"Rani",60000);
		obj3.setData();
		}
	}
