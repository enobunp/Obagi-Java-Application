import java.util.Scanner;
public class NestedIfElse{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter name: ");
		String name= input.nextLine();
		
		System.out.print("Enter mark: ");
		int mark = input.nextInt();
		
		if(mark > 100){
			System.out.println("Mark cannot be greater than 100");
		}
		else{
			
		if(mark >= 80){
			System.out.printf("Candidate name: %s" ,name);
			System.out.printf("Candidate mark: %d" ,mark);
			System.out.printf("Candidate Grade: %c" ,'A');
		}
		else if(mark >= 70){
			System.out.printf("Candidate name: %s" ,name);
			System.out.printf("Candidate mark: %d" ,mark);
			System.out.printf("Candidate Grade: %c" ,'B');
		}
		else if(mark >= 60){
			System.out.printf("Candidate name: %s" ,name);
			System.out.printf("Candidate mark: %d" ,mark);
			System.out.printf("Candidate Grade: %c" ,'C');
		}
		else if(mark >= 50){
			System.out.printf("Candidate name: %s" ,name);
			System.out.printf("Candidate mark: %d" ,mark);
			System.out.printf("Candidate Grade: %c" ,'D');
		}
		else if(mark >= 40){
			System.out.printf("Candidate name: %s" ,name);
			System.out.printf("Candidate mark: %d" ,mark);
			System.out.printf("Candidate Grade: %c" ,'A');
		}
		else{
			System.out.printf("Candidate name: %s" ,name);
			System.out.printf("Candidate mark: %d" ,mark);
			System.out.printf("Candidate Grade: %c" ,'A');
		}
		} 
	}
}	