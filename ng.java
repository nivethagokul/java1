public class ng {

	public static void main(String[] args) {
		int n,n1,rev=0,rem;
		n=Integer.parseInt(args[0]);
				n1=n;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
			if(n1==rev)
			{
				System.out.println(+n1+ "is a palindrome");
			}
			else
			{
				System.out.println(+n1+ "is not a palindrome");
			}
		}
		

	}
