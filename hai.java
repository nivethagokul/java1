public class hai {

	
	public static void main(String[] args) {
		
		if(args.length==0)
		{
			System.out.println("an integer number as argument is expected");
		}
		int x;
		
		x=Integer.parseInt(args[0]);
		 if(x==0)
		{
			System.out.println(+x+ "is neither negative nor positive");
			
		}
		else if(x<0)
		{
			
			System.out.println(+x+ "is negative");
		}
		else
		{
			
		
					System.out.println(+x+ "is positive");
		}
	}
	}
