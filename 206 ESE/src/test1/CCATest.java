package test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;




public class CCATest {

    public CCATest() {
    }

    @Before
    public void setUp() throws Exception {
        
    }
    


   

    //  add test methods here.

    
    
    Main p1 = new Main();

    @Test
    public void test() {

    	int age="";
    	String studentId="";
    	String userName="";
    	String userpassWord="";
    	String name="";
    	String grade="";
    	String teacher="";
    	String parentName="";
    	String parentEmail="";
    	int number;
        String outputOne = p1.addStudentAdmin(age, studentId, userName, userpassWord, name, grade, teacher, parentName,
                parentEmail, number
        );
      
    assertEquals("Student Successfully Added ! \n\n",output);
    }
    
    
    
     @Test
    public void test2() {
   	 String title="";
    	 String description="";
    	 int classSize="";
    	 String day="";
    	 String time="";
    	 String venue="";
    	 String nameOfInstructor="";
    	 String idOfCCA="";
    	 
  
        String outputTwo = p1.addCCACategoryAdmin(title, description, classSize, day, time, venue, nameOfInstructor, idOfCCA);
         assertEquals("CCA Successfully Added ! \n\n",output);
        
         
         
         @After
         public static void tearDownClass() {
         }



         @After
         public void tearDown() throws Exception {
         }
    }
     
   //=========================================================ADD======================================================
 	
 	//testViewAllCCA
     public void testViewAllCCA() {
			
    	// Test if Item list is not null but empty, so that can add a new item
    					assertNotNull("Test if there is valid CCA  arraylist to retrieve", ccaList);
    					
    					//test if the list of cca retrieved from the C206ESE is empty
    							String alLcca = C206ESE.retrieveAllCCA(ccaList);
    							String testOutput = "";
    							assertEquals("Check that ViewAllCCA list", testOutput, allCCA);
    							
    					//Given an empty list, after adding 2 items, test if the size of the list is 2
    					C206ESE(ccaList, cca1);
    					C206ESE(ccaListList, cca2);
    					assertEquals("Test if that CCA arraylist size is 2?", 2, ccaList.size());
    					
    					//test if the expected output string same as the list of CCAList retrieved from the C206_ESE
    					allcca= C206ESE.retrieveAllChromebook(ccaList);

    					testOutput = String.format("%-10s %-30s %-10s %-10s %-20d\n","Bakery", "baking ", 0, "Friday", “3:00pm - 4:00pm”, “Lvl 2 cookroom”, “Mr Kevin Chan” );
    					testOutput += String.format("%-10s %-30s %-10s %-10s %-20d\n","Little League Soccer", " Kicking ball",  0, "Tuesdays",  “3:00pm - 4:00pm”, “School Field”, “Mr Ronald Yeo”);
    				
    					assertEquals("Check that ViewAllccaist", testOutput, allcca);
    			
    			
    			
    			
    		}
     
     //=========================================================ADD CCA DETAILS======================================================
  	
     public void testAddCCADetails()
     {
     // Item list is not null, so that can add a new item
     		assertNotNull("Check if there is a valid cca details arraylist to add to" , ccadetailsList);
     		
     		//Given an empty list, after adding 1 item, the size of the list is 1
     		C206ESE.ccadetails(ccadetailsList, c1);		
     		assertEquals("Check that the cca details arraylist is 1?", 1, ccadetailsList.size());
     		
     		//The item just added is as same as the first item of the list
     		assertSame("Test that cca details is added s1", ccadetailsList.get(0));
     		
     		//Add another item. test The size of the list is 2?
     		C206ESE.addccadetails(ccadetailsList, c1);
     		assertEquals("Test that cca details arraylist size is 2", 2, studentList.size());
                         assertEquals("Check that the  cca details arraylist is added", s2, studentList.get(1));


     		
     	}
     
   //=========================================================ADD STUDENTS TO CCA ======================================================

     public void testAddStudent()
     {
     // Item list is not null, so that can add a new item
     		assertNotNull("Check if there is a valid student arraylist to add to", studentList);
     		
     		//Given an empty list, after adding 1 item, the size of the list is 1
     		C206ESE.addstudent(studentList, s1);		
     		assertEquals("Check that the student arraylist is 1?", 1, studentList.size());
     		
     		//The item just added is as same as the first item of the list
     		assertSame("Test that student is added s1", studentList.get(0));
     		
     		//Add another item. test The size of the list is 2?
     		C206ESE.addstudent(studentList, s2);
     		assertEquals("Test that Student arraylist size is 2", 2, studentList.size());
                         assertEquals("Check that the student arraylist is added", s2, studentList.get(1));


     		
     	}
     
     //=========================================================DELETE CCA ======================================================

     
     

     


     
}
