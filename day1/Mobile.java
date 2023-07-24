package week1.day1;

public class Mobile {
	
	public void oppo()
	{
	System.out.println("From OPPO");
	}
	public  long makecall()
	{
		long phno=7871567689l;
	return phno;
	}
	
	
	
	public static void main(String[] args) {
		
		Mobile phone=new Mobile();
		
		phone.oppo();
		
		long makecall = phone.makecall();
		
		System.out.println(makecall);
		
		
		
	}

}
