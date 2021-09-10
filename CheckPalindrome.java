package week1.day2;

public class CheckPalindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number=454;
		int remainder;
		int reverse=0;
		int temp;
		temp= number;
		
		
		while(number>0)
		{
			
			remainder=number%10;
			reverse= (reverse*10)+remainder;
			number=number/10;		
		}
		
		if(temp==reverse)
			System.out.println("Palindrome Number");
		else
			System.out.println("Not a palindrome Number");
		
		
		
	}

}
