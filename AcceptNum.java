import java.util.Scanner;

public class AcceptNum{
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		int sumof6_8 = 0;
		int sumof6_9 = 0;
		for (int i = 1; i <= 10; i++){
			System.out.printf("Enter num,%d: ",i);
			
			int num = input.nextInt();
			for (int i =6 && <= 8){
				sumof6_8 += num;
			}
			
			if(i >= 4 &&  <= 9){
				sumof4_9 += num;
			}
			int result = sumof4_9 - sumof6_8;
			System.out.printf("The resultis %d",result);
		
		}
	}
}	