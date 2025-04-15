import java.util.Scanner;
public class MethodOverLoading{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Calculate Perimeter of different shapes");
		System.out.println("Eneter 1 to calculate primeter of a square");
		System.out.println("Eneter 2 to calculate primeter of a rectangle");
		System.out.println("Eneter 3 to calculate primeter of a circle");
		System.out.println();
		
		System.out.print("Enter your choice");
		int choice = input.nextInt();
		
		switch(choice){
			case 1:
			{
				System.out.println("Eneter the lenght of the square: ");
				int lenghtOfSquare = input.nextInt();
				
				
				MethodOverLoading.shape(lenghtOfSquare);
			}
			break;
			
			case 2:
			{
				System.out.println("Eneter the lenght of the rectangle: ");
				int lenghtOfRectangle = input.nextInt();
				
				System.out.println("Eneter the breadth of the rectangle: ");
				int breadthOfRectangle = input.nextInt();
				
				MethodOverLoading.shape(lenghtOfRectangle,breadthOfRectangle);
			}
			break;
			
			case 3:
			{
				System.out.println("Eneter the lenght of the rectangle: ");
			    double radiusOfCircle = input.nextDouble();
				
				MethodOverLoading.shape(radiusOfCircle);
			}
			break;
			
		}
			
	}
	
	public static void shape(int length){
		int perimeterOfSquare = 4 * length;
		
		System.out.printf("The perimeterOfSquare is %d%n",perimeterOfSquare);
		
	}
	public static void shape(int length, int breadth){
		int perimeterOfRectangle = 2*(length + breadth);
		
		System.out.printf("The perimeter of rectangle is %d%n", perimeterOfRectangle);
	}
		public static void shape(double radius){
	    double perimeterOfCircle= 2 * Math.PI * radius;
		
	System.out.printf("The perimeter of circle is %f%n", perimeterOfCircle);
		}
	
}
