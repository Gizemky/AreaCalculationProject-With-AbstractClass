import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		String Transactions = "1- Calculating Square Area \n"
				             +"2- Calculating Triangle Area \n"
				             +"3- Calculating Circle Area \n"
				             +"4- Calculating Rectangular Area \n"
				             +"Exit : q";
		
		System.out.println(Transactions);
		while (true) {
			
			System.out.println("*****************************************");
			System.out.print("Please enter a transaction number : ");
			String operation = scanner.nextLine();
			
			Figure figure= null;
			
		if (operation.equals("q"))	{
			
			System.out.print("The program is exiting!");
			
		 break;
		 
		}
		
		else if (operation.equals("1")) {
			
			System.out.print("Edge of the square : ");
			int edge = scanner.nextInt();
			scanner.nextLine();
			
			figure = new Square ("Square", edge);
			
			figure.area_calculation();
			
			
		}
		
		else if (operation.equals("2")) {
			
			System.out.print("First side of the triangle : ");
			int a = scanner.nextInt();
			
			System.out.print("Second side of the triangle : ");
			int b = scanner.nextInt();
			
			System.out.print("Third side of the triangle : ");
			int c = scanner.nextInt();
			scanner.nextLine();
			
            figure = new Triangle ("Triangle", a, b, c);
            
            figure.area_calculation();
			
			
		}
		
		else if (operation.equals("3")) {
			
			System.out.print("Enter the radiuse : ");
			int radius = scanner.nextInt();
			scanner.nextLine();
			
			figure = new Circle ("Circle", radius);
			
			figure.area_calculation();
		   
			}
		
		
		else if (operation.equals("4")) {
			
			System.out.print("Enter long edge: ");
			int long_edge = scanner.nextInt();
			
			System.out.print("Enter short edge: ");
			int short_edge = scanner.nextInt();
			scanner.nextLine();
			
			figure = new Rectangle ("Rectangle", long_edge, short_edge);
			
			figure.area_calculation();
		   
			}
		
		else {
			
			System.out.println("You entered the wrong transaction number.");
		}
		
		
		}

	}

}
