package week1.day2;

public class CheckArmstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int input=153;
		int calculated=1;
		int remainder,original=153;
		
		
		while(input>0)
		{
			
			remainder =input%10;
			input = input/10;
			calculated = (calculated+(remainder*remainder*remainder));
			
			if(calculated==original)
				System.out.println(calculated + "  " + " is an Armstrong number");
		}
		
		
		

	}

}
