public class EnumsInJava{
	public static void main(String[] args){
		AccountType type = AccountType.SAVINGS;
		
		switch(type){
			case SAVINGS:
			{
				System.out.println("Your saving account has been created");
			}
			break;
			
				case CHECKING:
			{
				System.out.println("Your checking account has been created");
			}
			break;
			
				case FIXED_DEPOSIT:
			{
				System.out.println("Your fixed deposit account has been created");
			}
			break;
			
		}	
	}
}