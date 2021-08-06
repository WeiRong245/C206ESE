import java.util.ArrayList;



public class CCAMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 String[] strAr2 = 
		{
				 "Add Student", "Add CCA", "Add CCA category","View Student",
				 "View Students registered for a CCA","View registered parents","View all CCA",
				 "View all CCA categories","Delete Student"," Delete CCA","Delete CCA category ","Delete parent"
		 
		 };
	 
		 
		
	 
		 String[] studentArray1 = {"View as Admin", "View as Student"};
		 String[] studentArray2 = {"JOIN CCA", "Drop CCA"};
		
	        ArrayList<CCA> CCAList = new ArrayList<CCA>();
	        ArrayList<Student> Student = new ArrayList<Student>();
	        ArrayList<CCACategory> CCACate = new ArrayList<CCACategory>();  
	        Student s1 = new Student(9,"S12345D","Student1","","John","3j","Ms LUM"," Chan kai po","abc1@zzy.com",96521457);
	        Student s2 = new Student(9,"S67891E","Student2","","Maggie","2k","Mr TAN"," Yap Seng Kian","cba1@yui.com",98541246);
	        Student s3 = new Student(10,"S54321F","Student3","Student3!","Jack","6F","Ms LIM"," ","",0);
	        Student s4 = new Student(10,"S98765V","Student4","Student4!","Jane","5B","Mrs Chan"," ","",0);
	        
	        Student.add(s1);
	        Student.add(s2);
	        Student.add(s3);
	        Student.add(s4);
	        
	        
	        
	        
	        CCACategory cc0 = new CCACategory("C01","SPORTS(Little League Soccer)");    
		    CCACategory cc1 = new CCACategory("C02","DIGGING(Dig the ground)"); 
		    CCACategory cc2 = new CCACategory("C03","BAKING (Bakery)"); 
		    CCACategory cc3 = new CCACategory("C04","Making something (Jewellery Making and LEGO Expert)"); 
		    CCACate.add(cc0);
		    CCACate.add(cc1);
		    CCACate.add(cc2);
		    CCACate.add(cc3);
		    
		    
		    String[] studentCat = new String[4];
		    String[] StudentMenu = new String[2];
			 studentCat[0]= CCACate.get(0).category;
			 studentCat[1]= CCACate.get(1).category;
			 studentCat[2]= CCACate.get(2).category;
			 studentCat[3]= CCACate.get(3).category;
			 StudentMenu[0] = "Join CCA";
			 StudentMenu[1] = "SWAP CCA";	
			 
	        
	        
	        
		    System.out.println("\n");
    		System.out.println("ENTER LOGIN DETAILS: ");
			System.out.println("\n");
   
        	String username = Helper.readString("Please Enter Username: ");
        	String passWord = Helper.readString("Please Enter passWordword: ");
        	
    if(username.equals("admin") && passWord.equals("admin1!") ) 
    {
    	System.out.println("ADMIN MENU STARTS: ");
    	int adminChoice =0;
	        
    	
    	
    	
    	 if(adminChoice== 1) {
   		  int age=Helper.readInt("Please Enter Age: ");
   		  String StudentId=Helper.readString("Please Enter Student ID: ");
   		  String userName=Helper.readString("Please Enter Username: ");
   		  String passWord1=Helper.readString("Please Enter passWordword: ");
   		  String name=Helper.readString("Please Enter name: ");
   		  String grade=Helper.readString("Please Enter Grade: ");
   		  String teacher=Helper.readString("Please Enter Teacher: ");
   		  String parentName=Helper.readString("Please Enter Parents name: ");
   		  String parentEmail=Helper.readString("Please Enter Parents Email: ");
   		  int number=Helper.readInt("Please Enter Contact Number: ");
   		  Student.add(new Student(age,StudentId,userName,passWord1,name,grade,teacher,parentName,parentEmail,number));
   		  
   	 }
   	 else if (adminChoice == 2) {
   		 
   		  String title= Helper.readString("Please Enter Title: ");
   		  String description=Helper.readString("Please Enter description: ");
   		  int classSize=Helper.readInt("Please Enter ClassSize: ");
   		  String day=Helper.readString("Please Enter Day: ");
   		  String time=Helper.readString("Please Enter time: ");
   		  String venue=Helper.readString("Please Enter Venue: ");
   		  String nameOfInstructor=Helper.readString("Please Enter name of Instructor: ");
   		  String idofCCA = "SF" + (int) (Math.random() * 121212);
   		  CCAList.add(new CCA(title,description,classSize,day,time,venue,nameOfInstructor,idofCCA));
  
   	 }
   	 
   	 else if (adminChoice == 3) 
   	 {
   		 System.out.printf("%-10s%20s\n", "CCA_ID", "CCA CATEGORY");
   		 for (CCACategory obj : CCACate) {
   	            
   	         

   	            System.out.printf("%-10s%20s\n",  obj.id, obj.category );
   		 }
   	           
   		 String cid =  Helper.readString("Please Enter CCA ID: ");
   		 String category =  Helper.readString("Please Enter Category: ");
   		 CCACate.add(new CCACategory(cid,category));
	        
   	 }
	        
	        
   		 else if (adminChoice ==4) 
    	 {
    		 System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n", "AGE", "ID","USERNAME","PASSWORD"
    		 		
	        		 ,"name","GRADE"
	        		 ,"Parents name","Parents Email", "Contact Number");
    		 for (Student caty1 : Student) 
    		 {
    	          
    	         

    	            System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n",  caty1.age,caty1.studentId,caty1.userName,caty1.passWord
                                        ,caty1.name,caty1.grade,caty1.parentName,caty1.parentEmail,caty1.number);
    		 }
    	 
    	 }
    	 
    	 else if(adminChoice ==5)
    	 {
    		 int count=0;
    		 for(Student ss : Student) 
    		 {
    			 if(ss.ccaId != "")
    			 {
    				 count+=1;
    			 }
    			 
        	  }
    		 
        		 System.out.println("Number of Students Registered for CCA are "+ count);
        	 
          }
    	 
			 else if(adminChoice ==6) 
			 {
				 for (Student caty1 : Student) 
				 {
			         //displaying the elements  
			        System.out.printf("%-10s\n",
			       		 
			       		 "Registered Parents name");
			
			           System.out.printf("%-10s\n",  
			           		caty1.parentName
			           );
				 }
				 
			  }
    	 
        	 else if(adminChoice ==7) 
        	 {
        		 for (CCA cccaty : CCAList) 
        		 {
       	           
       	         System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n", "Title", "Discription"
       	        		 ,"Class size","Day","time","Venue", "Instructor"
       	        		 
       	        		 );

       	            System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n",  cccaty.title,cccaty.description,
       	            		cccaty.classSize,cccaty.day,cccaty.time,cccaty.venue,cccaty.nameOfInstructor
       	            );
        		 }
        	 
        	 }
        	 
        	 else if(adminChoice ==8)
        	 {
        		 for (CCACategory caty : CCACate) 
        		 {
       	           
       	         System.out.printf("%-10s%20s\n", "CCA_ID", "CCA CATEGORY");

       	            System.out.printf("%-10s%20s\n",  caty.id, caty.category );
       		     }
       	 
        	 }
        	 else if(adminChoice ==9)
        	 {
        		 String stuserName=Helper.readString("Please Enter name of Student to Delete: ");
        			for(Student s : Student)
        			{
        				if(s.name == stuserName) 
        				{
        					String sTest = Helper.readString("Do you really want to delete ?");
        	     					if(Helper.readBoolean(sTest))
        				Student.remove(s);
        				
        				}
        			}
        			System.out.println("Successfully Deleted");
        			System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n", "AGE", "ID","USERname","passWordWORD"
       	        		 ,"name","GRADE","Parents name","Parents Email", "Contact Number");
        			
           		 for (Student caty1 : Student)
           		 {
           	            
           	         

           	        System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n",  caty1.age,caty1.studentId,caty1.userName,caty1.passWord
                                        ,caty1.name,caty1.grade,caty1.parentName,caty1.parentEmail,caty1.number);
           		 }
           	 
        	 }
        	 
        	 else if(adminChoice ==10)
        	 {
        		 String ccaIdDel=Helper.readString("Please CCAID to Delete: ");
        		 for (CCA cccaty : CCAList) 
        		 {
        			 if(cccaty.idOfCCA ==ccaIdDel ) 
        			 {
        				 String sTest = Helper.readString("Do you really want to delete ?");
        	     					if(Helper.readBoolean(sTest))
        	     						CCAList.remove(cccaty);
        			 }
        				
        	   }
        		 System.out.println("Successfully Deleted");
        		 System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n", "Title", "Discription"
      	        		 ,"Class size","Day","time","Venue", "Instructor" );
        		 for (CCA cccaty : CCAList)
                 {
          	          
          	         

          	            System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n",  cccaty.title,cccaty.description,
          	            		cccaty.classSize,cccaty.day,cccaty.time,cccaty.venue,cccaty.nameOfInstructor
          	            );
          		 }
        	 
        	}
        	 
        	 else if(adminChoice ==11) 
        	 {
        		 String ccaIdDel=Helper.readString("Please enter CCAcID to Delete: ");
        		 for (CCACategory caty : CCACate)
        		 {
        			 if(caty.id.equals(ccaIdDel))
        			 { 
        				 String sTest = Helper.readString("Do you really want to delete ?");
        	     					if(Helper.readBoolean(sTest))
        				 CCACate.remove(caty);
        	     					
        			 }
        		 }
        	 }
        	 else if(adminChoice ==12) 
        	 {
        		 String stuserName=Helper.readString("Please Enter name of Parent to Delete: ");
     			for(Student s : Student) {
     				if(s.parentName == stuserName)
     				{
     					String sTest = Helper.readString("Do you really want to delete ?");
     					if(Helper.readBoolean(sTest))
     				Student.remove(s);
     				
     				}
     			}
     			System.out.println("Successfully Deleted");
     			for (Student caty1 : Student)
     			{
       	          //displaying the elements  
       	         System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s\n", "AGE", "ID","USERname","passWordWORD","name","GRADE"
       	        		 
       	        		 ,"Parents name","Parents Email", "Contact Number");

       	            System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n",  caty1.age,caty1.studentId,
       	            		caty1.userName,caty1.passWord
       	            		,caty1.name,caty1.grade,caty1.parentName,caty1.parentEmail,caty1.number
       	            );
       		     }
     			
        	 } 
        }
        
        
   		 
   		 
   		 
   		 
   		 
   		 
   		 
    	 int StudentChoice=Helper.getUserOption("Student MENU",StudentMenu);
		    
         if(StudentChoice == 1) {
        	
        	 
    			System.out.println("ENTER Student DETAILS TO LOG IN");
          		  int age=Helper.readInt("Please Enter Age: ");
        		  String StudentId=Helper.readString("Please Enter Student ID: ");
        		  String name1=Helper.readString("Please Enter name: ");
        		  String grade=Helper.readString("Please Enter Grade: ");
        		  String teacher=Helper.readString("Please Enter Teacher: ");
        		  String parentName=Helper.readString("Please Enter Parents name: ");
        		  String parentEmail=Helper.readString("Please Enter Parents Email: ");
        		  int number=Helper.readInt("Please Enter Contact Number: ");
        		  for(Student sec : Student)
        		  {
        			  if(sec.name.equals(name1)) 
        			  {
        				  int parentChoice=Helper.getUserOption("JOIN CCA",studentCat);
        				  if(parentChoice == 1) 
        				  {
        					  sec.ccaCat = studentCat[0];
        				  }
        				  else if(parentChoice == 2)
        				  {
        					  sec.ccaCat = studentCat[1];
        				  }
							else if(parentChoice == 3) 
							{
								sec.ccaCat = studentCat[2];					  
								        				 
							}
							else if(parentChoice == 4) 
							{
								sec.ccaCat = studentCat[3];
							}
        			  }

        		  }
              
              }
         
              
       
    	 	
    } 
    
    }
    else
    {
    	for(Student s : Student) 
    	{
    		
    		if(username.equals(s.name)) 
    		{
    			if(s.age<=9) {
    				System.out.println("PARENT MENU STARTS: ");
    				System.out.println("\n");
    				System.out.println("ENTER Student DETAILS TO LOG IN");
          		  int age=Helper.readInt("Please Enter Age: ");
        		  String StudentId=Helper.readString("Please Enter Student ID: ");
        		  String name1=Helper.readString("Please Enter name: ");
        		  String grade=Helper.readString("Please Enter Grade: ");
        		  String teacher=Helper.readString("Please Enter Teacher: ");
        		  String parentName=Helper.readString("Please Enter Parents name: ");
        		  String parentEmail=Helper.readString("Please Enter Parents Email: ");
        		  int number=Helper.readInt("Please Enter Contact Number: ");
        		  if(s.name.equals(name1))
        		  {
        			  System.out.println("There ??");
        			  int joinChoice=Helper.getUserOption("Parent Menu",studentArray2);
        			  if(joinChoice == 1)
        			  {
        				  int parentChoice=Helper.getUserOption("JOIN CCA",studentCat);
        				  if(parentChoice == 1)
        				  {
        					  s.ccaCat = studentCat[0];
        				  }
        				  else if(parentChoice == 2)
        				  {
        					  s.ccaCat = studentCat[1];
	        				  }
					else if(parentChoice == 3) 
					{
						s.ccaCat = studentCat[2];					  
						        				  
					}
					else if(parentChoice == 4) 
					{
						s.ccaCat = studentCat[3];
					}
						     String newCCAid = "SF" + (int) (Math.random() * 5555);
		        			  s.ccaId = newCCAid;
		        			  System.out.println("JOINED WITH CCA ID:  "+ newCCAid );
		        			  
	        	     }
	        			  
	        			  else if (joinChoice ==2 ) 
	        			  {
	        				  s.ccaId = "";
	        				  s.ccaCat= "";
	        				  System.out.println("DROPPED CCA" );
	        			  }
	        			  
	        			  
	        		  }
    			}	    			
    		}
   		 
   		 
    	}
    }
 }
   		 
	        
		
		
		
		

