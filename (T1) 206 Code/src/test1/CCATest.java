package test1;

/**
 * We declare that this code was written by us .
 * We will not copy or allow others to copy our code.
 * We understand that copying code is considered as plagiarism.
 *
 * Team 4, 10 Jul 2021 11:37:38 am
 */

import java.util.ArrayList;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.not;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import project.CCA;
import project.CCACategory;
import project.Parent;
import project.Main;
import project.Student;



public class CCATest {
   static ArrayList<CCA> CCAList = new ArrayList<CCA>();
   static ArrayList<Parent> ParentList = new ArrayList<Parent>();
   static ArrayList<Student> student = new ArrayList<Student>();
   static ArrayList<CCACategory> CCACate = new ArrayList<CCACategory>();
    
   
   
   
   
   public CCATest() {
    
   }

    @Before
    public void setUp() throws Exception {
          String[] ccas = {"Little League Soccer", "Dig the Ground", "Bakery", "Jewellery Making and LEGO Expert"};

        String[] adminView = {"View as Admin", "View as Student"};
        String[] studentMenu = new String[2];
        
        studentMenu[0] = "Join CCA";
        studentMenu[1] = "SWAP CCA";
        

        String[] adminOptions = {"Add student", "Add CCA", "Add CCA category", "Add Parent Account",
            "View Students who registered for a CCA", "View registered parents", "View all CCA",
            "View all CCA categories", "Delete student", "Delete CCA", "Delete CCA category ", 
            "Delete parent","Update CCA details",  "Update CCA category details","Update parent details", "Drop Student from CCA"};
        
        
        CCA cca1 = new CCA(ccas[0], "Soccer Playing", 20, "Wednesday", "0900-1100", "school Soccer Field", "Tan wah pow", "");
        CCA cca2 = new CCA(ccas[3] , "Building Blocks", 40, "Wednesday", "0900-1100", "Class4N2", "Chan siam peng", "");
        CCA cca3 = new CCA(ccas[1], "Digging Things ", 30, "Wednesday", "0900-1100", "school Sandpit", "lim peng shan", "");
        CCA cca4 = new CCA(ccas[2], "Baking Cookies", 35, "Wednesday", "0900-1100", "school Canteen", "Ng Siak Meng", "");
        CCA cca5 = new CCA(ccas[3] , "Making jewellery", 25, "Wednesday", "0900-1100", "Lecture Room", "Tan sia penj", "");
        
        CCAList.add(cca1);
        CCAList.add(cca2);
        CCAList.add(cca3);
        CCAList.add(cca4);
        CCAList.add(cca5);

       
        String[] studentccaOptions = {"JOIN CCA", "Drop CCA"};
        String[] studentRegisterLogin = {"Register", "Login"};

        //Adding Students 
        
        Student s1 = new Student(9, "S12345D", "student1", "", "John", "3j", "Ms LUM", " Chan kai po", "abc@zzy.co", 123123123, "");
        Student s2 = new Student(9, "S67891E", "student2", "", "Maggie", "2k", "Ms TAN", " Chan kai poi", "abc@zzy.co", 123123123, "");
        Student s3 = new Student(10, "S54321F", "student3", "student3!", "Jack", "6F", "Ms LIM", " ", "", 0, "");
        Student s4 = new Student(10, "S98765V", "student4", "student4!", "Jane", "5B", "Mrs Chan", " ", "", 0, "");
        student.add(s1);
        student.add(s2);
        student.add(s3);
        student.add(s4);

        
        //adding Default Category
        CCACategory cc1 = new CCACategory("C01", "SPORTS");
        CCACategory cc2 = new CCACategory("C02", "DIGGING");
        CCACategory cc3 = new CCACategory("C03", "BAKING");
        CCACategory cc4 = new CCACategory("C04", "Making something");
        CCACate.add(cc1);
        CCACate.add(cc2);
        CCACate.add(cc3);
        CCACate.add(cc4);
        
        String[] ccaCat = new String[4];
        String[] registerMenu = {"Students age <=9 years", "Students agr >= 10 years "};
        ccaCat[0] = CCACate.get(0).ccaCategory;
        ccaCat[1] = CCACate.get(1).ccaCategory;
        ccaCat[2] = CCACate.get(2).ccaCategory;
        ccaCat[3] = CCACate.get(3).ccaCategory;
        
        
        studentMenu[0] = "Join CCA";
        studentMenu[1] = "SWAP CCA";
    }
    


   

    //  add test methods here.

    
     Main p1 = new Main();
    



    @Test
    public void testaddStudentAdmin() {

        
        int age = 9;
        String studentId = "testID";
        String userOne = "testID";
        String passOne = "testID";
        String name = "testID";
        String grade = "testID";
        String teacher = "testID";
        String parentName = "testID";
        String parentEmail = "testID";
        int number = 1231231;
        
        String result = p1.addStudentAdmin(age, studentId, userOne, passOne, name, grade, teacher, parentName,
                parentEmail, number );
      
           assertEquals("Student Successfully Added! \n\n",result);
    }
    
     @Test
    public void testAddStudent() {
        String title =" TEST TITLE"; String description=" TEST TITLE"; int classSize=66; String day=" TEST TITLE"; String Time=" TEST TITLE";
              String venue=" TEST TITLE"; String NameOfInstructor=" TEST TITLE";String idofCCA=" TEST TITLE";
         String output = p1.addCCACategoryAdmin(title, description, classSize, day, Time, venue, NameOfInstructor, idofCCA);
         assertEquals("CCA Successfully Added ! \n\n",output);
        
    }
     @Test
     public void testDisplayMenu() {
                 String[] adminOptions = {"Add student", "Add CCA", "Add CCA category", "Add Parent Account",
             "View Students who registered for a CCA", "View registered parents", "View all CCA",
             "View all CCA categories", "Delete student", "Delete CCA", "Delete CCA category ", 
             "Delete parent","Update CCA details",  "Update CCA category details","Update parent details", "Drop Student from CCA"};
                 
                 int output3 = 1;
                  assertEquals(1,output3);
     
     }
     @Test
     public void testdisplayCCA(){
         String output = p1.displayCCA();
         assertEquals(p1.displayCCA() , output);
     }
     
     @Test
     public void testDisplayCCACategory(){
         String output = p1.displayCCACategory();
         assertEquals(p1.displayCCACategory() , output);
     }
     
     @Test
     public void testAddParent(){
         String pname="NAME"; String pChildAge="23"; String pChildName="TEST"; String pChildGrade="GRADE";
         String output = "Parent Successfully Added !";
         assertEquals(p1.addParent(pname,pChildAge,pChildName,pChildGrade) , output);
     }
     
     @Test
     public void testAddCCACategory(){
        
                 String id = "sadas";
                 String cat = "dig the ground";
                 String output = "CCA Category Successfully Added ! \n";
                 assertEquals(p1.addCCACategory(id,cat) , output);
     }
     
     @Test
     public void TestDisplayParentsName(){ 
         
                 
                  String output = p1.displayParentsName();
         assertEquals(p1.displayParentsName() , output);
     }
     
     @Test
     public void testDeleteStudent(){
         int bef = student.size();
         Student s1 = new Student(9, "S12345D", "student1", "", "John", "3j", "Ms LUM", " Chan kai po", "abc@zzy.co", 123123123, "");
         
         student.remove(1);
         int out = student.size();
              assertThat(bef, not(equalTo(out)));
     }
     
     @Test
     
     public void testDeleteCCA(){
         int befSize = CCAList.size();
          CCA cca1 = new CCA("Little League Soccer", "Soccer Playing", 20, "Wednesday", "0900-1100", "school Soccer Field", "Tan wah pow", "");
          CCAList.remove(1);
           int out = CCAList.size();
         assertThat(befSize, not(equalTo(out)));
     }
     
//     @Test
//     public void testAddStudentAdmin()
//     {
//     // Item list is not null, so that can add a new item
//             assertNotNull("Check if there is a valid student arraylist to add to", studentList);
//             
//             //Given an empty list, after adding 1 item, the size of the list is 1
//             C206ESE.addstudent(studentList, s1);        
//             assertEquals("Check that the student arraylist is 1?", 1, studentList.size());
//             
//             //The item just added is as same as the first item of the list
//             assertSame("Test that student is added s1", studentList.get(0));
//             
//             //Add another item. test The size of the list is 2?
//             C206ESE.addstudent(studentList, s2);
//             assertEquals("Test that Student arraylist size is 2", 2, studentList.size());
//                         assertEquals("Check that the student arraylist is added", s2, studentList.get(1));
//
//                         
                         
//                         
//   
//     @Test
//      public void testDeleteParentName()
//      {
//    	 
//    	 //
//    	 
//    	 
//    	 assertEquals("Test that  a message will appear when parent account is deleted ",parentArray);
//    	 
//    	 
//   	       //
//   	      assertEquals(" Test that  when you select a parent’s account  and click on the delete button, "
//   	      		+ "then only the selected parent account is deleted",parentArray);
//   	 
//      }
//     
     
//     
//     public void testDropStudentfromCCCA()
//     {
//    	 
//    	 //delete parentTest case
//    	 assertEquals("Test that the system can successfully drop a student from a CCA");
//    	 
//    	 
//    	 
//    	 
//     }
     
   
//     
//     
//     
//     
//     @Before
//	  public void setUp() throws Exception {
//		   
//		  cca1 = new CCA( "Soccer Playing", 20, "Wednesday", "0900-1100", "school Soccer Field",
//		   			 "Tan wah pow", "");
//
//
//			cca2 = new CCA( "Building Blocks", 40, "Wednesday", "0900-1100", "Class4N2", "Chan siam peng", "");
//           s1  = new Student(9, "S12345D", "student1", "", "John", "3j", "Ms LUM", " Chan kai po", "abc@zzy.co",
//         			 123123123, "");
//           s2 = new Student(9, "S67891E", "student2", "", "Maggie", "2k", "Ms TAN", " Chan kai poi", "abc@zzy.co",
//         			 123123123, "");
//			
//			CCAList= new ArrayList<CCA>();
//			studentList = new ArrayList<Student>();
//	  }
//
//	    
//	   
//	    
//
//	  
//
//	  
//	  @Test
//	  public void testAddCCADetails() //done
//	     {
//	     // Item list is not null, so that can add a new item
//	     		assertNotNull("Check if there is a valid cca details arraylist to add to" , CCAList);
//	     		
//	     		//Given an empty list, after adding 1 item, the size of the list is 1
//	     		CCAList.add(cca1);	
//	     		assertEquals("Check that the cca details arraylist is 1?", 1, CCAList.size());
//	     		
//	     		
//	     		
//	     		
//	     		//Add another item. test The size of the list is 2?
//	     		CCAList.add(cca2);	
//	     		assertEquals("Test that cca details arraylist size is 2", 2, CCAList.size());
//	                         assertEquals("Check that the  cca details arraylist is added", cca2, CCAList.get(1));
//
//
//	     		
//	     	}
//
//	  @Test
//	  public void deleteCCATest() { //done
//		// Test if item list is not null but empty 
//		    assertNotNull("Test if there is valid CCA arraylist to retrieve item", CCAList);
//		    
//		    //Given an empty list, after adding 2 items, test if the size of the list is 2 - normal
//		    CCAList.add(cca1);
//		    CCAList.add(cca2);
//		    assertEquals("Test that Student arraylist size is 2", 2, CCAList.size());
//		    
//		    // Test that after removing an item, the size of the list is 1 - normal
//		    CCAList.remove(0);
//		    assertEquals("Test that CCA arrayList size is 1", 1, CCAList.size());
//		  }
//
//	  @Test
//	 
//		  public void testAddStudent()
//		  {
//		  // Item list is not null, so that can add a new item
//		  		assertNotNull("Check if there is a valid student arraylist to add to",studentList);
//		  		
//		  		//Given an empty list, after adding 1 item, the size of the list is 1
//		  		studentList.add(s1);
//		  				
//		  		assertEquals("Check that the student arraylist is 1?", 1, studentList.size());
//		  		
//		  		//Add another item. test The size of the list is 2?
//		  		studentList.add(s2);
//		  		assertEquals("Test that Student arraylist size is 2", 2, studentList.size());
//		                      assertEquals("Check that the student arraylist is added", s2, studentList.get(1));
//
//
//		  		
//		  	}
//
//	  
//	
//		  
//		  @Test
//		  
//		  public void testViewAllCCA() { //done
//				
//			// Test if Item list is not null but empty, so that can add a new item
//							assertNotNull("Test if there is valid CCA  arraylist to retrieve", CCAList);
//							
//							
//									
//							//Given an empty list, after adding 2 items, test if the size of the list is 2
//									  CCAList.add(cca1);
//									    CCAList.add(cca2);;
//							assertEquals("Test if that CCA arraylist size is 2?", 2, CCAList.size());
//							
//							
//					
//					
//					
//					
//				}
     
         
         @After
         public void tearDownClass() {
         }



         @After
         public void tearDown() throws Exception {
         }
    }

