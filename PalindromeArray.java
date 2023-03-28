package arrys;

public class PalindromeArray 
{
	public static void main(String[] args) 
	{
		int a []= {7,1,3,4,3,1,7};
		
		
		int res[]=new int [a.length];
		int j=0;
		
		for (int i = res.length-1; i >= 0; i--) 
		{
			res[j]=a[i];
			
			j++;
		}
		
		int ct=0;
		
		for (int i = 0; i < res.length; i++) 
		{
			if (a[i]==res[i]) 
			{
				ct++;
			}
			else
			{
				break;
			}
		}
		if (ct==a.length) 
		{
			System.out.println("It is Palindrome Array");
		}
		else
		{
			System.out.println("It is not an Palindrome Array");
		}
	}
}
