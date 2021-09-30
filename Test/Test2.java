import java.util.Scanner;
class Test2
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Dish Qut");
		int qty=sc.nextInt();
		System.out.println("Cost Per Dish");
		double cost=sc.nextDouble();
		System.out.println("Enter Gst ");
		double gst=sc.nextDouble();
		Test2 t=new Test2();
		double op=t.billAmout(qty,cost,gst);
		System.out.println("Final Bill Amount is"+op);

	}
	double  billAmout(int qty,double price,double gst)

	{
		double result=qty*price;
		double bill=result+gst;
		return bill;

	}
}