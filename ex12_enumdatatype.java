package oops;

// enum is a derived data type
// we cannot define numbers
//

enum days
{
	mon,tue,wed,fri,sat,sun
}

public class ex12_enumdatatype {
	public static void main(String args[])
	{
		days d=days.fri;
		System.out.println("day is "+d);
		System.out.println(d.ordinal()+7); //ordinal gives us the index of the enum
		
		for(days x:days.values())
			System.out.println(x);
	}
}
