package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		// input=13; this is not divisible by any number other than 1 and 13
				
				int input=2;
				 boolean flag=false;
				 if(input==0 || input==1)
					 System.out.println("It's a Prime Number");
				 else
				 {
				for(int i=2; i< input; i++)
				{
					if(input%i==0)
					{
						System.out.println("Not a Prime Number");
						flag=true;
					break;
					}
						
				}
				if(flag==false)
					System.out.println("It's a Prime Number");
				
			}
				 }

}
