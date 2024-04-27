
public class XYZ_COMPny {
	
	String address;;
	int pincode;;
	
	XYZ_COMPny(String address,int pincode)
	{
		this.address=address;
		this.pincode=pincode;
	}
	
	public void printCompany()
	{
		System.out.println("Address :"+address);
		System.out.println("PIncode :"+pincode);
	}
	
	

}
