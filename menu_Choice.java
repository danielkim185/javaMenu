import java.util.Scanner;
import java.util.Random;

//enum Choice{ COUNT, CALCULATOR, RANDOMNUM }

public class menu_Choice
{
	
	//Choice choice;
	public static void main(String []args)
	{
	Scanner scanner = new Scanner(System.in);
	System.out.println("Welcome to the menu select! What option would you like to choose? (Count, Calculator, RandomNum)");
	String userInput = scanner.nextLine();
	switch (userInput)
	{
		case "COUNT":
		{
			System.out.println("What number would you like me to count to?");
			int counter = scanner.nextInt();
			for (int i = 1; i <= counter; i++)
			{
				System.out.println(i);
			}
			break;
		}
		case "CALCULATOR":
		{
			System.out.println("Enter first number.");
			int num1 = Integer.parseInt(scanner.nextLine());
			System.out.println("Enter second number.");
			int num2 = Integer.parseInt(scanner.nextLine());
			System.out.println("What operation would you like to perform?");
			String operation = scanner.nextLine();
			switch (operation)
			{
				case "Add":
				{
					int total = num1 + num2;
					System.out.println(total);
					break;
				}
				case "Subtract":
				{
					int total = num1 - num2;
					System.out.println(total);
					break;
				}
				case "Multiply":
				{
					int total = num1 * num2;
					System.out.println(total);
					break;
				}
				case "Divide":
				{
					int total = num1 / num2;
					System.out.println(total);
					break;
				}
				default:
				{
					System.out.println("This case should never happen.");
					break;
				}
			}
			break;
		}
		case "RANDOMNUM":
		{
			Random rand = new Random();
			System.out.println(rand.nextInt(1000));
		}
	}
	}
}

