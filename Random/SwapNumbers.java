package Random;

public class SwapNumbers 
{
	
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 20;
		use3Variables(num1, num2);
		useAddSwap(num1,num2);
		useMultiplySwap(num1,num2);
		
		
	}

	private static void useMultiplySwap(int num1, int num2)
	{
		num1 = num1*num2;
		num2 = num1/num2;
		num1 = num1/num2;
		System.out.println("num1: "+num1+" num2: "+num2);
	}

	private static void useAddSwap(int num1, int num2)
	{
		num1 = num1+num2;
		num2 = num1-num2;
		num1 = num1-num2;
		System.out.println("num1: "+num1+" num2: "+num2);
		
	}

	private static void use3Variables(int num1, int num2) {
		int temp = num1;
		num1 = num2;
		num2 = temp;
		System.out.println("num1: "+num1+" num2: "+num2);
	}
	
}
