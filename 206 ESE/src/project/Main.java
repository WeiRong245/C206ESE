package project;

import java.util.ArrayList;
import java.util.Random;
//import static org.junit.Assert.*;				
//import org.junit.Test;	

public class Main {

    public static void main(String[] args) 
    {
        String[] adminView = {"View as Admin", "View as Student"};
        String[] studentMenu = new String[2];
        
        studentMenu[0] = "Join CCA";
        studentMenu[1] = "SWAP CCA";
        
        ArrayList<CCA> CCAList = new ArrayList<CCA>();
        
        String[] adminOptions = {"Add student", "Add CCA", "Add CCA category", "View Students",
            "View Students who registered for a CCA", "View registered parents", "View all CCA",
            "View all CCA categories", "Delete student", "Delete CCA", "Delete CCA category ", 
            "Delete parent" };
        
        
        CCA cca1 = new CCA("Little League Soccer", "Soccer Playing", 20, "Wednesday", "0900-1100", "school Soccer Field", "Tan wah pow", "");
        CCA cca2 = new CCA("LEGO Expert", "Building Blocks", 40, "Wednesday", "0900-1100", "Class4N2", "Chan siam peng", "");
        CCA cca3 = new CCA("Dig the Ground", "Digging Things ", 30, "Wednesday", "0900-1100", "school Sandpit", "lim peng shan", "");
        CCA cca4 = new CCA("Bakery", "Baking Cookies", 35, "Wednesday", "0900-1100", "school Canteen", "Ng Siak Meng", "");
        CCA cca5 = new CCA("Jewellery Making", "Making jewellery", 25, "Wednesday", "0900-1100", "Lecture Room", "Tan sia penj", "");
        
        CCAList.add(cca1);
        CCAList.add(cca2);
        CCAList.add(cca3);
        CCAList.add(cca4);
        CCAList.add(cca5);

       
        String[] studentccaOptions = {"JOIN CCA", "Drop CCA"};
        String[] studentRegisterLogin = {"Register", "Login"};
        String[] ccas = {"1.Little League Soccer", "2.Dig the Ground", "3.Bakery", "4.Jewellery Making and LEGO Expert"};

        
        
        ArrayList<Student> student = new ArrayList<Student>();
        ArrayList<CCACategory> CCACate = new ArrayList<CCACategory>();
        
        
        
        //Adding Students 
        
        Student s1 = new Student(9, "S12345D", "student1", "", "John", "3j", "Ms LUM", " Chan kai po", "abc@zzy.co", 123123123, "");
        Student s2 = new Student(9, "S67891E", "student2", "", "Maggie", "2k", "Ms TAN", " Chan kai po", "abc@zzy.co", 123123123, "");
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

        ccaCat[0] = CCACate.get(0).ccaCategory;
        ccaCat[1] = CCACate.get(1).ccaCategory;
        ccaCat[2] = CCACate.get(2).ccaCategory;
        ccaCat[3] = CCACate.get(3).ccaCategory;
        
        
        studentMenu[0] = "Join CCA";
        studentMenu[1] = "SWAP CCA";

        
        int login =99;
        while (login != 0)
        {
             login = Helper.getUserOption("WELCOME", studentRegisterLogin);
            
             if(login == 0) 
             {
                 System.out.println("GOOD BYE !!");
             }

            int parentOptions = 0;
            
            if (login == 1) 
            {
                System.out.println("Register for Students <= 9 Years old");
                
                int age = 9;
                String studentId = Helper.readString("Please Enter Student ID: ");
                String name = Helper.readString("Please Enter Name: ");
                String grade = Helper.readString("Please Enter Grade: ");
                String teacher = Helper.readString("Please Enter Teacher: ");
                String parentsName = Helper.readString("Please Enter Parents Name: ");
                String parentsEmail = Helper.readString("Please Enter Parents Email: ");
                int number = Helper.readInt("Please Enter Contact Number: ");
                           
                System.out.println("Student Added and verified!");
                System.out.println("\n");
                
                while (parentOptions != 1) 
                {

                    String parentUsername = Helper.readString("Email Parent username: ");
                    String parentPassword = Helper.readString("Email Parent password: ");

                    if (parentUsername.equals("parent") && parentPassword.equals("parent1!")) 
                    {
                        Random rand = new Random();
                        System.out.println("Generating Random CCA Registeration ID ......");
                        System.out.println("\n");
                        
                        String ccaIDStud = "S" + (int) (rand.nextInt(9) * 9);
                        System.out.println("CCA Registeration ID: " + ccaIDStud);
                        System.out.println("\n");

                        String stuID = Helper.readString("Please Enter Student ID: ");
                        String stuccaID = Helper.readString("Please Enter CCA Registeration ID:");

                        
                        for (Student ss : student) 
                        {
                            if (ss.studentId.equals(stuID)) 
                            {
                            	
                                ss.ccaId = stuccaID;
                                int chose1 = Helper.getUserOption("CCA Category:", ccaCat);
                                int chose2 = Helper.getUserOption("Choose CCA: ", ccas);
                                ss.ccaCat = ccaCat[chose1 - 1];
                                ss.stuCCA = ccas[chose2 - 1];
                                System.out.println(ccas[chose2 - 1] + " Has Been Successfully Registered !");

                                parentOptions = Helper.readInt("Press 0 to go Back to Parent Login \n "
                                		+ "Press 1 to Go Back to Application Start: ");
                                if (parentOptions == 1)
                                {
                                    System.exit(0);
                                }

                            }

                        }
                    }

                }

            } 
            
            else if (login == 2) 
            {
                int adminChoice = 55;
                
                String adminUsername = Helper.readString("Please Enter Admin username: ");
                String adminPassword = Helper.readString("Please Enter Admin password: ");
                
                if (adminUsername.equals("admin") && adminPassword.equals("admin1!"))
                {
                    while (adminChoice != 0) 
                    {
                        int viewAs = Helper.getUserOption("CHOOSE TO VIEW AS: ", adminView);
                        
                        if (viewAs == 1) 
                        {
                            adminChoice = Helper.getUserOption("ADMIN MENU", adminOptions);

	                            if (adminChoice == 1) 
	                            {
	                                int age = Helper.readInt("Please Enter Age: ");
	                                
	                                
	                                String studentIdfirst = Helper.readString("Please Enter Student ID: ");
	                                String usernameOne = Helper.readString("Please Enter Username: ");
	                                String passwordOne = Helper.readString("Please Enter Password: ");
	                                String nameOne = Helper.readString("Please Enter Name: ");
	                                String gradeOne = Helper.readString("Please Enter Grade: ");
	                                String teacherOne = Helper.readString("Please Enter Teacher: ");
	                                String parentnameOne = Helper.readString("Please Enter Parents Name: ");
	                                String parentemailOne = Helper.readString("Please Enter Parents Email: ");
	                                int number = Helper.readInt("Please Enter Contact Number: ");
	                                
	                                
	                                student.add(new Student(age, studentIdfirst, usernameOne, passwordOne, nameOne, 
	                                		gradeOne, teacherOne, parentnameOne, parentemailOne, number, ""));
	                                
	                                System.out.println("Student Successfully Added ! \n\n");
	                            } 
	                            
	                            else if (adminChoice == 2) 
	                            {
	
	                                String titleSecond = Helper.readString("Please Enter title: ");
	                                String descriptionSecond = Helper.readString("Please Enter description: ");
	                                int classsizeSecond = Helper.readInt("Please Enter classSize: ");
	                                String daySecond = Helper.readString("Please Enter Day: ");
	                                String timeSecond = Helper.readString("Please Enter Time: ");
	                                String venueSecond = Helper.readString("Please Enter Venue: ");
	                                String NameOfInstructorSecond = Helper.readString("Please Enter Name of Instructor: ");
	                                String idofCCAsecond = "";
	                                
	                                CCAList.add(new CCA(titleSecond, descriptionSecond, classsizeSecond, daySecond, timeSecond, venueSecond, 
	                                		NameOfInstructorSecond, idofCCAsecond));
	                                
	                                System.out.println("CCA Successfully Added ! \n\n");
	                                System.out.println("Displaying CCA in Database: \n\n");
	                                System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n", "Title", "Description", "Class size",
	                                		"Day", "Time", "Venue", "Instructor");
	                                
	                                for (CCA ccObj : CCAList) 
	                                {
	                                    //displaying the elements                        
	                                    System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n", ccObj.title, ccObj.description,
	                                            ccObj.classSize, ccObj.day, ccObj.time, 
	                                            ccObj.venue, ccObj.nameOfInstructor);
	                                }
	
	                            } 
	                            else if (adminChoice == 3)
	                            {
	
	                                String ccaidThird = Helper.readString("Please Enter CCA ID: ");
	                                String ccacategoryThird = Helper.readString("Please Enter Category: ");
	                                
	                                CCACate.add(new CCACategory(ccaidThird, ccacategoryThird));
	                                
	                                System.out.println("CCA Category Successfully Added ! \n");
	                                System.out.println("SHowing CCA Category ID and CCA Category : \n");
	
	                                System.out.printf("%-10s%20s\n", "CCA_ID", "CCA CATEGORY");
	                                Helper.line(40,"=");
	                                
	                                for (CCACategory obj : CCACate) 
	                                {
	                                    //displaying the elements  
	                                    System.out.printf("%-10s%20s\n", obj.ccaCategoryId, obj.ccaCategory);
	                                }
	
	                            } 
	                            
	                            else if (adminChoice == 4) 
	                            {
	                                System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n", "AGE", "ID", "USERNAME", "PASSWORD", "NAME", "GRADE", 
	                                		"Parents Name", "Parents Email", "Contact Number");
	                                
	                                for (Student obj1 : student) 
	                                {
	                                    //displaying the elements  
	
	                                    System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n", obj1.age, obj1.studentId, 
	                                    		obj1.userName, obj1.userpassWord, obj1.name, obj1.grade, obj1.parentName, obj1.parentEmail, obj1.number);
	                                
	                                }
	
	                            }
	                            
	                            
	                            else if (adminChoice == 5) 
	                            {
	                                int count = 0;
	                                for (Student ss : student) 
	                                {
	                                    if (ss.ccaId != "") 
	                                    {
	                                        count += 1;
	                                    }
	                                }
	                                System.out.println("Number of Students Registered for CCA are " + count);
	
	                            } 
	                            
	                            else if (adminChoice == 6) 
	                            {
	                                System.out.printf("%-10s\n",
	                                        "Registered Parents Name");
	                                for (Student obj1 : student) 
	                                {
	                                     
	                                    System.out.printf("%-10s\n",obj1.parentName);
	                                }
	
	                            } 
	                            
	                            else if (adminChoice == 7) 
	                            {
	                                System.out.printf("%-10s%30s%30s%30s%30s%30s%30s\n", "Title", "Description", 
	                                		"Class size", "Day", "Time", "Venue", "Instructor");
	                                
	                                Helper.line(200,"=");
	                                for (CCA ccObj : CCAList) 
	                                {
	                                    //displaying the elements                        
	                                    System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n", ccObj.title, ccObj.description,
	                                            ccObj.classSize, ccObj.day, ccObj.time, ccObj.venue, ccObj.nameOfInstructor
	                                    );
	                                }
	
	                            } 
	                            else if (adminChoice == 8) {
	
	                              
	                                System.out.printf("%-10s%20s\n", "CCA_ID", "CCA CATEGORY");
	                                for (CCACategory obj : CCACate)
	                                {
	                                    //displaying the elements  
	                                    
	                                    {
	                                        System.out.printf("%-10s%20s\n", obj.ccaCategoryId, obj.ccaCategory);
	                                    }
	                                }
	
	                            } 
	                            else if (adminChoice == 9) 
	                            {
	
	                                String strStud[] = new String[student.size()];
	
	                                for (int j = 0; j < student.size(); j++)
	                                {
	
	                                    strStud[j] = student.get(j).name;
	                                }
	
	                                
	                                int del1 = Helper.getUserOption("Choose Students To Delete", strStud);
	                                for (Student s : student) {
	                                    if (s.name.equals(strStud[del1 - 1])) 
	                                    {
	                                        String sTest = Helper.readString("Do you really want to delete ?");
	                                        if (Helper.readBoolean(sTest))
	                                        {
	                                            student.remove(s);
	                                            System.out.println("Successfully Deleted");
	                                        }
	                                        else 
	                                        {
	                                            System.out.println("Not Deleted");
	                                        }
	
	                                    }
	                                }
	
	                                System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n", "AGE", "ID", "USERNAME", 
	                                		"PASSWORD", "NAME", "GRADE", "Parents Name", "Parents Email", 
	                                		"Contact Number");
	                                
	                                for (Student obj1 : student) 
	                                {
	                                    //displaying the elements  
	
	                                    System.out.printf("%-10s%20s%20s%20s%20s%20s%20s%20s%20s\n", obj1.age, obj1.studentId,
	                                    		obj1.userName, obj1.userpassWord, obj1.name, obj1.grade, obj1.parentName, obj1.parentEmail, obj1.number);
	                                }
	
	                            } 
	                            else if (adminChoice == 10)
	                            {
	
	                                // String ccaIdDel = Helper.readString("Please CCAID to Delete: ");
	                                int del2 = Helper.getUserOption("Choose CCA to Delete", ccas);
	                                for (CCA ccObj : CCAList) 
	                                {
	                                    if (ccObj.idOfCCA == "2")
	                                    {
	                                        String sTest = Helper.readString("Do you really want to delete ?");
	                                        if (Helper.readBoolean(sTest)) 
	                                        {
	                                            CCAList.remove(ccObj);
	                                        }
	                                    }
	
	                                }
	                                
	                                System.out.println("Successfully Deleted");
	                                System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n", "Title", "Discription", "Class size",
	                                		"Day", "Time", "Venue", "Instructor");
	                                
	                                for (CCA ccObj : CCAList)
	                                {
	                                    //displaying the elements  
	
	                                    System.out.printf("%-10s%20s%20s%20s%20s%20s%20s\n", ccObj.title, ccObj.description,
	                                            ccObj.classSize, ccObj.day, ccObj.time, ccObj.venue, ccObj.nameOfInstructor
	                                    );
	                                }
	                                
	                            } 
	                            else if (adminChoice == 11)
	                            {
	                                String ccaArray[] = new String[CCACate.size()];
	
	                                for (int j = 0; j < CCACate.size(); j++) 
	                                {
	
	                                    ccaArray[j] = CCACate.get(j).ccaCategory;
	                                }
	
	                                int del3 = Helper.getUserOption("Choose CCA Category to Delete", ccaArray);
	                               
	                                for (CCACategory obj : CCACate) 
	                                {
	                                    if (obj.ccaCategory == ccaArray[del3 - 1]) 
	                                    {
	                                        String sTest = Helper.readString("Do you really want to delete ?");
	                                        if (Helper.readBoolean(sTest))
	                                        {
	                                            CCACate.remove(obj);
	                                            System.out.println("Deleted Succerssfully");
	                                        } 
	                                        else
	                                        {
	                                            System.out.println("Not Deleted");
	                                        }
	                                    }
	                                }
	                            } 
	                            
	                            else if (adminChoice == 12)
	                            {
	                                String parentArray[] = new String[student.size()];
	
	                                for (int j = 0; j < student.size()-2; j++) 
	                                {
	                                    parentArray[j] = student.get(j).parentName;
	                                }
	
	                                
	                                int del4 = Helper.getUserOption("Choose Parent Name to Delete: ", parentArray);
	                                for (Student s : student) 
	                                {
	                                    if (s.parentName.equals(parentArray[del4 - 1])) 
	                                    {
	                                        String sTest = Helper.readString("Do you really want to delete ?");
	                                        if (Helper.readBoolean(sTest)) {
	                                            s.parentName = "";
	                                            s.parentEmail = "";
	                                            System.out.println("SuccessFully Deleted ");
	                                        }
	                                        else 
	                                        {
	                                            System.out.println("Not Deleted");
	                                        }
	
	                                    }
	                                }
                                
                                System.out.println("Successfully Deleted");
                                System.out.printf("%20s\n", "Parents Name");

                                for (Student obj1 : student) 
                                {
                                    //displaying the elements  
                                    System.out.printf("%20s\n", obj1.parentName);
                                }

                            }

                        }
                
            else if (viewAs == 2)
            {
                int menu = 0;
                while (menu != 1)
                {
                    int studentChoice = Helper.getUserOption("Student MENU", studentMenu);
                    if (studentChoice == 1) 
                    {
                        String susID = Helper.readString("Please Enter Student ID: ");
                        String nameStud = Helper.readString("Please Enter Student Name: ");
                        
                        for (Student ses : student)
                        {
                            if (ses.studentId.equals(susID) && ses.name.equals(nameStud)) 
                            {
                                int chose2 = Helper.getUserOption("Which CCA you want to Join: ", ccas);
                                ses.ccaId = ccas[chose2 - 1];
                                System.out.println("Sucessfully Joined!");
                            }
                           

                        }
                         menu = Helper.readInt("Press 0 to go Back to Parent Login \n Press 1 to Go Back to Application Start: ");

                    }
                    else if (studentChoice == 2)
                    {
                        String susID = Helper.readString("Please Enter Student ID: ");
                        String nameStud = Helper.readString("Please Enter Student Name: ");
                        for (Student ses : student)
                        {
                            if (ses.studentId.equals(susID) && ses.name.equals(nameStud)) {
                                int chose2 = Helper.getUserOption("Which CCA you want to SWAP: ", ccas);
                                ses.ccaId = ccas[chose2 - 1];
                                System.out.println("Sucessfully SWAPPED !");
                            }
                        }
                        menu = Helper.readInt("Press 0 to go Back to Parent Student Menu \n Press 1 to Go Back to Application Start: ");

                    }

                }    
                
            }
                        
        }
} 
                
              else 
              {
            	  
	                int quitBack = 0;
	                int tee = 0;
	                
	                
	                while (quitBack != 1)
	                {
	                    for (Student ses : student)
	                    {
	                        //System.out.println(ses.uname);
	                        if (adminUsername.equals(ses.userName) && adminPassword.equals(ses.userpassWord)) 
	                        {
	                            String studentId = Helper.readString("Please Enter Student ID: ");
	                            String studentName = Helper.readString("Please Enter Name: ");
	                            String grade = Helper.readString("Please Enter Grade: ");
	                            String teacher = Helper.readString("Please Enter Teacher: ");
	                            String parentName = Helper.readString("Please Enter Parents Name: ");
	                            String parentEmail = Helper.readString("Please Enter Parents Email: ");
	                            int number = Helper.readInt("Please Enter Contact Number: ");
	
	                            int chose1 = Helper.getUserOption("CCA Category:", ccaCat);
	                            int chose2 = Helper.getUserOption("Choose CCA: ", ccas);
	                            ses.ccaCat = ccaCat[chose1 - 1];
	                            ses.stuCCA = ccas[chose2 - 1];
	                            System.out.println(ccas[chose2 - 1] + " Has Been Successfully Registered !");
	
	                            quitBack = Helper.readInt("Press 0 to go Back to Parent Login \n Press 1 to Go Back to Application Start: ");
	
	                        }
	                        
	                       else
	                       {
	                           
	                           System.out.println("Wrong Password !");
	                           tee=2;
	                           break;
	                      }

                    }
	                    
            }
          }

       }
   }

}
