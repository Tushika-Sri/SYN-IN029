import java.util.*;
class PrimeNumber{
	public static boolean isPrime(int n)
	{
		if (n <= 1)
			return false;
        //Loop from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(n); i++)
		{
			//If number is divisible by any i, it is not a prime
			if (n % i == 0)
				return false;
		}
		//If no divisors are found, number is prime
        return true;
	}
    public static void main(String args[])
	{
		Scanner Sc=new Scanner(System.in);
        int n=Sc.nextInt();
        if (isPrime(n))
			System.out.println("Prime no.");
		else
			System.out.println("Not prime no.");
	}
}
