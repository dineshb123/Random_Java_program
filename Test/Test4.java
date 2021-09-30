import java.util.Scanner;
class Test4
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println();
		System.out.println("Enter no");
		double no=sc.nextDouble();
		if(no>0)
		{
			if(no%2==0){

				System.out.println("Given no is Positive and Even");
				no++;
				System.out.println(no);

			}
			else
			{
				System.out.println("Given No is positive and odd");
			}
		}
		else

		{
			System.out.println("You Enter Negative no");
		}

		
	}
}