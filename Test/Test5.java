import java.util.Scanner;
class Test5
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Amount");
		double amt=sc.nextDouble();
		Test5 t=new Test5();
		double result=t.si(amt);
		System.out.println("Simple Interest is"+result);
	}

	

double si(double pr)
{
	double result=(pr*5*3)/100;
	return result;
}
}