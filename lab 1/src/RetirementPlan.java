import java.util.Scanner;

public class RetirementPlan 
{
	public static void main(String[]args)
	{
		Scanner scan = new Scanner(System.in);
		
		//years retired
		int reYears = 0;
		System.out.println("How many years of retirement do you plan on taking?\n");
		reYears = scan.nextInt();
		
		//retirement interest
		double reInterest = 0;
		System.out.println("What is the interest rate from your annuity after retirement, between 0% and 3%?\n");
		reInterest = scan.nextDouble();
		while(reInterest < 0 || reInterest > 3)
		{
			System.out.println("Choose value between 0% and 3%.\n");
			reInterest = scan.nextDouble();
		}
		
		//annuity partial payment
		double partPay = 0;
		System.out.println("What is your estimated monthly income needs?\n");
		partPay = scan.nextDouble();
		
		//Social security payments
		double ssi = 0;
		System.out.println("What is your monthly social security payment expected to be?\n");
		ssi = scan.nextDouble();
		
		//annuity amount needed
		double annu = 0;
		
		annu = (partPay-ssi)*((1-Math.pow((1+((reInterest/100)/12)), (0-(reYears*12))))/((reInterest/100)/12));
		System.out.println(annu + "\n");
		
		
		
		//years working
		int worYears = 0;
		System.out.println("How many years do you plan on working?\n");
		worYears = scan.nextInt();
		
		//work annuity interest
		double worInterest = 0;
		System.out.println("What is your initial annuity interest rate, between 0% and 20%?\n");
		worInterest = scan.nextDouble();
		while(reInterest < 0 || worInterest > 20)
		{
			System.out.println("Choose value between 0% and 20%.\n");
			worInterest = scan.nextDouble();
		}
		
		//amounted needed saved each month
		double save = 0;
		
		save = annu/(((Math.pow((1+((worInterest/100)/12)), (worYears*12))-1)/((worInterest/100)/12)));
		System.out.println(save + "\n");
	}
}
