package menu;
import java.util.*;
public class lanch {
public static void main(String[] args) {
			Scanner s=new Scanner(System.in);
			System.out.println("enter your name");
			String a1=s.next();
			System.out.println("enter your contact no");
			String a2=s.next();
			System.out.println("MENU");
			System.out.println("1.Dosa------50/-");
			System.out.println("2.Idly------30/-");
			System.out.println("3.Vada------30/-");
			System.out.println("4.Tea ------10/-");
			int grandtotal=0;
			int subtotal=0;
			int p=0;
			List arr=new ArrayList();
	char c='Y';
	while(c=='Y')
	{
		System.out.println("enter the item no");
		int id=s.nextInt();
		System.out.println("enter the Quentity id");
		int quantity=s.nextInt();
		String iname="";
		switch(id)
		{

		case 1:
			iname="Dosa";
			 p=50;
			 subtotal=p*quantity;
			 arr.add(id+ "  "+iname + "  "+p + "  "+quantity + "  "+subtotal);
			break;
		case 2:
			 iname="Idly";
			 p=30;
			 subtotal=p*quantity;
			 arr.add(id+ "  "+ iname + "  "+p + "  "+quantity + "  "+subtotal);
			break;
		case 3:
			iname="Vada";
			 p=30;
			 subtotal=p*quantity;
			 arr.add(id+ "  "+ iname + "  "+p + "  "+quantity + "  "+subtotal);
			break;
		case 4:
		iname="Tea";
			 p=10;
			 subtotal=p*quantity;
			 arr.add(id+  "  "+iname + "  "+p + "  "+quantity + "  "+subtotal);
			break;
			default:
				System.out.println("enter a valid item");
				
		}
		grandtotal += subtotal;
		System.out.println("do u want to continue?(y/n)");
		 String c1=s.next();
		 c1=c1.toUpperCase();
		 c=c1.charAt(0);
		
		
	}
	System.out.println("------------------------------------------------------------------------------");
	System.out.println("Name:"+a1);
	System.out.println("Contact No:"+a2);
	System.out.println("------------------------------------------------------------------------------");
	
	 System.out.println("------------------------------------------------------------------------------");
	for(int i=0;i<arr.size();i++)
	{
		System.out.println(arr.get(i));
	}
	 System.out.println("------------------------------------------------------------------------------");
	System.out.println("the grandtotal :"+grandtotal);
	System.out.println("------------------------------------------------------------------------------");
	
}
}
