
class Test1
{
	public static void main(String[] args)
	 {
		Test1 t=new Test1();
		int relust1=t.minToSec(1);
		int result2=t.secToMin(60);
		System.out.println("Min To second"+relust1);
		System.out.println("Sec to min"+result2);


		
	}


public int minToSec(int min)
{
 int result=min*60;
 return result;

}

public int secToMin(int sec)
{
	int result=sec/60;
	return result;
} 
}