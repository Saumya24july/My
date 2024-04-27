
public class Employee  extends  XYZ_COMPny
{
	
String name;
int eid;
String empid;
long phone;

Employee(String address,int pincode,String name,int eid,String empid,long phone)
{
	super(address,pincode);
	this.name=name;
	this.eid=eid;
	this.empid=empid;
	this.phone=phone;
	
}

public boolean  printEmployee()
{
	System.out.println("Address :" +address);
	System.out.println("PIncode :" +pincode);
	System.out.println("Name :"+name);
	System.out.println("EID :"+eid);
	System.out.println("Empid  :"+empid);
	System.out.println("Phone :"+phone);
	return false;
	
}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		XYZ_COMPny from=new Employee("baigan badia",757105,"Soumya",12345,"Soumya@1234",82089142);
		
	
		
		Employee i= (Employee)from;
		
		System.out.println(i.printEmployee());
		
	}

}
