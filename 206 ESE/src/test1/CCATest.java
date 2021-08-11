package test1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;




public class CCATest {

    public CCATest() {
    }

    @Before
    public static void setUpClass() {
        
    }

    @After
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    
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
        
    }
}
