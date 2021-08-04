import java.util.ArrayList;

public class CCAMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		public static void loginMenu() {
			Helper.line(30, "-");
			System.out.println("FLIGHT SCHEDULER - LOGIN");
			Helper.line(30, "-");
		}

		public static void staffMenu() {

			Helper.line(30, "-");
			System.out.println("FLIGHT SCHEDULER - STAFF");
			Helper.line(30, "-");

		
		while (true) {

			CCAMain.loginMenu();
			
			int studentId = Helper.readInt("Enter student name: ");
			
			int ccaRegistrationID = Helper.readInt("Enter password: ");
			
			
			

			boolean isStaff = CCAMain.doStaffLogin(staff, uName, uPassword);
			
			
			if (isStaff == false) 
			{
				System.out.println("Either your001 0i incorrect. Please try again!");
			}

			
			
/*========================================================================================================================================================================
 =========================================================================================================================================================================
 =========================================================================================================================================================================
 */
 
		
		   //Student
			
			String students =Helper.readString("Student Name:  ");
  
		    
			
			//CCA Details
		
			String ccaDetails =Helper.readString("CCA Details:  ");
			
			
//little league soccer, LEGO expert, dig the ground, bakery, jewellery making 
			
			
			//CCA Category
			
			String ccaCategory =Helper.readString("CCA Category:  ");
			
			
		
		
		
		
		
		
		
		
		
		}
		
	}

}
