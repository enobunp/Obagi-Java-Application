//TypeCasting
public class TypeCasting{
	public static void main(String[] args){
	//Widening Tyoe casting 
	double weight = 678;
	System.out.printf("Your weight is %f%n", weight);
	
	//Narrowing TypeCasting
	char alpha = '?';
	
	int asciicode = (int)alpha;
	System.out.printf("The ASCII code for ? is %d%n",asciicode);
	
	double height = 5.8;
	int MyHeight =(int)height;
	System.out.printf("My faculty's height is %d",MyHeight);
	}
}