package example1;

public class Fib {
	
	public int fib(int n)
	{
		if(n>=3)
		{
			return fib(n-1)+fib(n-2);
		}
		else
			return 1;
	}

}
