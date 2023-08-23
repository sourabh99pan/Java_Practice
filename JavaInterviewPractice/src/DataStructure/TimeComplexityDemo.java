package DataStructure;

public class TimeComplexityDemo {

	public static void main(String[] args) {

		double now=System.currentTimeMillis();
		
		TimeComplexityDemo demo = new TimeComplexityDemo();
		System.out.println(demo.findSum(999999999));
		
		System.out.println("Time taken findSum --"+(System.currentTimeMillis()-now)+"millisecs.");
		
		double now1=System.currentTimeMillis();
		
		TimeComplexityDemo demo1 = new TimeComplexityDemo();
		System.out.println(demo1.findSum1(999999999));
		
		System.out.println("Time taken findSum1 --"+(System.currentTimeMillis()-now1)+"millisecs.");
	}
	
	public int findSum(int n)
	{
		return n*(n+1)/2;
	}
	
	public int findSum1(int n)
	{
		int sum=0;
		for(int i=0;i<=n;i++)
		{
			sum=sum+i;
		}
		return sum;
	}

}
