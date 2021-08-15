package project;


/**
 * We declare that this code was written by us .
 * We will not copy or allow others to copy our code.
 * We understand that copying code is considered as plagiarism.
 *
 * Team 4, 10 Jul 2021 11:37:38 am
 */


import java.util.ArrayList;
import java.util.Random;
//import static org.junit.Assert.*;				
//import org.junit.Test;	

public class Main {
	static ArrayList<CCA> CCAList = new ArrayList<CCA>();
	static ArrayList<Parent> ParentList = new ArrayList<Parent>();
	static ArrayList<Student> student = new ArrayList<Student>();
	static ArrayList<CCACategory> CCACate = new ArrayList<CCACategory>();
	static String[] ccaLabels = { "Title", "Description", "Class Size", "Day", "Time", "Venue", "Instructor" };

	public static String addStudentAdmin(int age, String studentId, String userOne, String passOne, String name, String grade,
			String teacher, String parentName, String parentEmail, int number) {

		student.add(new Student(age, studentId, userOne, passOne, name, grade, teacher, parentName, parentEmail, number, ""));

		return "Student Successfully Added! \n\n";
	}

	// display CCA
	public static String displayCCA() {
		String output = "";
		output += String.format("%40s%20s%20s%20s%20s%20s%20s\n", "Title", "Description", "Class size", "Day", "Time",
				"Venue", "Instructor");

		Helper.line(200, "=");
		for (CCA ccObj : CCAList) {
			output += String.format("%40s%20s%20s%20s%20s%20s%20s\n", ccObj.title, ccObj.description, ccObj.classSize,
					ccObj.day, ccObj.time, ccObj.venue, ccObj.nameOfInstructor);
			
		}
		
		return output;

	}

	
	public static String displayCCACategory() {
		String outp = "";

		outp += String.format("%-10s%20s\n", "CCA_ID", "CCA CATEGORY");
		for (CCACategory obj : CCACate) {
			// displaying the elements
			outp += String.format("%-10s%20s\n", obj.ccaCategoryId, obj.ccaCategory);
		}

		return outp;
	}

	public static String addCCACategoryAdmin(String title, String descp, int classSize, String day, String Time,
			String venue, String NameOfInstructor, String idofCCA) {
		CCAList.add(new CCA(title, descp, classSize, day, Time, venue, NameOfInstructor, idofCCA));
		return "CCA Successfully Added ! \n\n";
	}

	public static String addParent(String pname, String pChildAge, String pChildName, String pChildGrade) {

		ParentList.add(new Parent(pname, pChildAge, pChildName, pChildGrade));
		return "Parent Successfully Added !";

	}

	public static void editCCA(int option, CCA obj) {
		String field = "";
		int intfield = 0;
		
		if (option == 1) {
			field = Helper.readString("Enter Title :");
			obj.title = field;
		} else if (option == 2) {
			field = Helper.readString("Enter Description :");
			obj.description = field;
		} else if (option == 3) {
			intfield = Helper.readInt("Enter Class Size :");
			obj.classSize = intfield;
		} else if (option == 4) {
			field = Helper.readString("Enter Day :");
			obj.day = field;
		} else if (option == 5) {
			field = Helper.readString("Enter Time :");
			obj.time = field;
		} else if (option == 6) {
			field = Helper.readString("Enter Venue :");
			obj.venue = field;
		} else if (option == 7) {
			field = Helper.readString("Enter name of instructor :");
			obj.nameOfInstructor = field;
		}

		System.out.println("Successfully Edited !");

	}

	
	

	public static String displayParentsName() {
		int cxc = 1;
		String out = "";
		out += String.format("%-10s\n", "Registered Parents Name");
	
		for (int ss = 0; ss < ParentList.size() - 2; ss++) {

			out += String.format("%-10s\n", cxc + ". " + ParentList.get(ss).pname);

			cxc += 1;
		}
		
		cxc +=1;
		for (int ss = 0; ss < ParentList.size() ; ss++) {
			out += String.format("%-10s\n", cxc + ". " + ParentList.get(ss).pname);

			cxc += 1;
		}
		return out;
	}

	
	
	
	
	
	public static void adminCCAStudentRegistered() {
		int count = 0;
		System.out.println("NAMES:");
		for (Student ss : student) {
			if (ss.stuCCA != "") {
				System.out.println(ss.name);

				count += 1;
			}
		}
		System.out.println("Number of Students Registered for CCA are " + count);
	}

	
	
	public static String addCCACategory(String id, String categ) {
		CCACate.add(new CCACategory(id, categ));
		return "CCA Category Successfully Added ! \n";
	}
	
	

	public static void main(String[] args) {
		
		Parent p1=new Parent("Chan kai po","13","John","A+");
		Parent p2=new Parent("Chan kai poi","14","Maggie","B+");
		ParentList.add(p1);
		ParentList.add(p2);
		
		
		
		String[] ccas = { "Little League Soccer", "Dig the Ground", "Bakery", "Jewellery Making and LEGO Expert" };

		String[] adminView = { "View as Admin", "View as Student" };
		String[] studentMenu = new String[2];

		studentMenu[0] = "Join CCA";
		studentMenu[1] = "SWAP CCA";

		String[] adminOptions = { "Add student", "Add CCA", "Add CCA category", "Add Parent Account",
				"View Students who registered for a CCA", "View registered parents", "View all CCA",
				"View all CCA categories", "Delete student", "Delete CCA", "Delete CCA category ", "Delete parent",
				"Update CCA details", "Update CCA category details", "Update parent details", "Drop Student from CCA" };

		CCA cca1 = new CCA(ccas[0], "Soccer Playing", 20, "Wednesday", "0900-1100", "school Soccer Field",
				"Tan wah pow", "");
		CCA cca2 = new CCA(ccas[3], "Building Blocks", 40, "Wednesday", "0900-1100", "Class4N2", "Chan siam peng", "");
		CCA cca3 = new CCA(ccas[1], "Digging Things ", 30, "Wednesday", "0900-1100", "school Sandpit", "lim peng shan",
				"");
		CCA cca4 = new CCA(ccas[2], "Baking Cookies", 35, "Wednesday", "0900-1100", "school Canteen", "Ng Siak Meng",
				"");
		CCA cca5 = new CCA(ccas[3], "Making jewellery", 25, "Wednesday", "0900-1100", "Lecture Room", "Tan sia penj",
				"");

		CCAList.add(cca1);
		CCAList.add(cca2);
		CCAList.add(cca3);
		CCAList.add(cca4);
		CCAList.add(cca5);

		String[] studentccaOptions = { "JOIN CCA", "Drop CCA" };
		String[] studentRegisterLogin = { "Register", "Login" };

		// Adding Students

		Student s1 = new Student(9, "S12345D", "student1", "", "John", "3j", "Ms LUM", "Chan kai po", "abc1@zzy.co",
				123123123, "");
		Student s2 = new Student(9, "S67891E", "student2", "", "Maggie", "2k", "Ms TAN", "Chan kai poi", "abc@zzy.co",
				123123123, "");
		Student s3 = new Student(10, "S54321F", "student3", "student3!", "Jack", "6F", "Ms LIM", " ", "", 0, "");
		Student s4 = new Student(10, "S98765V", "student4", "student4!", "Jane", "5B", "Mrs Chan", " ", "", 0, "");
		student.add(s1);
		student.add(s2);
		student.add(s3);
		student.add(s4);

		// adding Default Category
		CCACategory cc1 = new CCACategory("C01", "SPORTS");
		CCACategory cc2 = new CCACategory("C02", "DIGGING");
		CCACategory cc3 = new CCACategory("C03", "BAKING");
		CCACategory cc4 = new CCACategory("C04", "Making something");
		CCACate.add(cc1);
		CCACate.add(cc2);
		CCACate.add(cc3);
		CCACate.add(cc4);
		
		

		String[] ccaCat = new String[4];
		String[] registerMenu = { "Students age <=9 years", "Students agr >= 10 years " };
		ccaCat[0] = CCACate.get(0).ccaCategory;
		ccaCat[1] = CCACate.get(1).ccaCategory;
		ccaCat[2] = CCACate.get(2).ccaCategory;
		ccaCat[3] = CCACate.get(3).ccaCategory;

		studentMenu[0] = "Join CCA";
		studentMenu[1] = "SWAP CCA";



		int login = 99;
		while (login != 0) {
			//Helper.line(40, "=");
			System.out.println("\r\n" + "WELCOME\r\n"
					+ "================================================================================\n"
					+ "[1] Register\r\n" + "[2] Login\r\n" + "[0] Quit\r\n"
					+ "================================================================================\n" + "");
			login = Helper.readInt("Enter Choice -->");

			if (login == 0) {
				System.out.println("GOOD BYE !!");
			}

			int parentOptions = 0;

			if (login == 1) {
				int stYear = Helper.getUserOption("Registration Menu", registerMenu);
				if (stYear == 1) {

					int age = 9;
					String studentId = Helper.readString("Please Enter Student ID: ");
					String name = Helper.readString("Please Enter Name: ");
					String grade = Helper.readString("Please Enter Grade: ");
					String stuClass = Helper.readString("Please Enter your Class: ");
					String StuUsername = Helper.readString("Please Enter your Username: ");
					String stuPassword = Helper.readString("Please Enter your Password: ");
					String teacher = Helper.readString("Please Enter Teacher: ");
					// String parentsName = Helper.readString("Please Enter Parents Name: ");
					// String parentsEmail = Helper.readString("Please Enter Parents Email: ");
					int number = Helper.readInt("Please Enter Contact Number: ");

					student.add(new Student(age, studentId, StuUsername, stuPassword, name, grade, teacher, "", "",
							number, ""));

					System.out.println(
							"You have successfully registered account, Pls go and Login to access Student Menu");
					System.out.println("\n");

					while (parentOptions != 1) {

						String parentUsername = Helper.readString("Email Parent username: ");
						String parentPassword = Helper.readString("Email Parent password: ");

						if (parentUsername.equals("parent") && parentPassword.equals("parent1!")) {
							Random rand = new Random();
							System.out.println("Generating Random CCA  ID... ");
							System.out.println("\n");

							String ccaIDStud = "S" + (int) (rand.nextInt(9) * 9);
							System.out.println("CCA Registeration ID: " + ccaIDStud);
							System.out.println("\n");

							String stuID = Helper.readString("Please Enter Student ID: ");
							String stuccaID = Helper.readString("Please Enter CCA Registeration ID:");

							for (Student ss : student) {
								if (ss.studentId.equals(stuID)) {

									ss.ccaId = stuccaID;
									// int chose1 = Helper.getUserOption("CCA Category:", ccaCat);
									int chose2 = Helper.getUserOption("Choose CCA: ", ccas);
									// ss.ccaCat = ccaCat[chose1 - 1];
									String parentUsername1 = Helper.readString("Email Parent username: ");
									String parentPassword1 = Helper.readString("Email Parent password: ");

									if (parentUsername1.equals("parent") && parentPassword1.equals("parent1!")) {
										ss.stuCCA = ccas[chose2 - 1];
										System.out.println(ccas[chose2 - 1] + " Has Been Successfully Registered !");
									}

									parentOptions = Helper.readInt("Press 0 to go Back to Parent Login \n "
											+ "Press 1 to Go Back to Application Start: ");
									if (parentOptions == 1) {
										System.exit(0);
									}

								}

							}
						}

					}
				} else if (stYear == 2) {

					int age = 10;
					String studentId = Helper.readString("Please Enter Student ID: ");
					String name = Helper.readString("Please Enter Name: ");
					String grade = Helper.readString("Please Enter Grade: ");
					String stuClass = Helper.readString("Please Enter your Class: ");
					String StuUsername = Helper.readString("Please Enter your Username: ");
					String stuPassword = Helper.readString("Please Enter your Password: ");
					String teacher = Helper.readString("Please Enter Teacher: ");
					// String parentsName = Helper.readString("Please Enter Parents Name: ");
					// String parentsEmail = Helper.readString("Please Enter Parents Email: ");
					int number = Helper.readInt("Please Enter Contact Number: ");

					student.add(new Student(age, studentId, StuUsername, stuPassword, name, grade, teacher, "", "",
							number, ""));

					System.out.println(
							"You have successfully registered account, Pls go and Login to access Student Menu");
					System.out.println("\n");

				}

			}

			else if (login == 2) {
				int adminChoice = 55;

				String adminUsername = Helper.readString("Please Enter username: ");
				String adminPassword = Helper.readString("Please Enter password: ");

				if (adminUsername.equals("admin") && adminPassword.equals("admin1!")) {
					while (adminChoice != 0) {

						adminChoice = Helper.getUserOption("ADMIN MENU", adminOptions);

						if (adminChoice == 1) {
							int age = Helper.readInt("Please Enter Age: ");

							String studentIdfirst = Helper.readString("Please Enter Student ID: ");

							String nameOne = Helper.readString("Please Enter Name: ");
							String gradeOne = Helper.readString("Please Enter Grade: ");
							String teacherOne = Helper.readString("Please Enter Teacher: ");
							String parentnameOne = Helper.readString("Please Enter Parents Name: ");
							String parentemailOne = Helper.readString("Please Enter Parents Email: ");
							int number = Helper.readInt("Please Enter Contact Number: ");

							System.out.println(addStudentAdmin(age, studentIdfirst, "", "", nameOne, gradeOne,
									teacherOne, parentnameOne, parentemailOne, number

							));
						}

						else if (adminChoice == 2) {

							String titleSecond = Helper.readString("Please Enter title: ");
							String descriptionSecond = Helper.readString("Please Enter description: ");
							int classsizeSecond = Helper.readInt("Please Enter classSize: ");
							String daySecond = Helper.readString("Please Enter Day: ");
							String timeSecond = Helper.readString("Please Enter Time: ");
							String venueSecond = Helper.readString("Please Enter Venue: ");
							String NameOfInstructorSecond = Helper.readString("Please Enter Name of Instructor: ");
							String idofCCAsecond = "";

							System.out.println(addCCACategoryAdmin(titleSecond, descriptionSecond, classsizeSecond,
									daySecond, timeSecond, venueSecond, NameOfInstructorSecond, idofCCAsecond));

						} else if (adminChoice == 3) {

							String ccaidThird = Helper.readString("Please Enter CCA ID: ");
							String ccacategoryThird = Helper.readString("Please Enter Category: ");

							System.out.println(addCCACategory(ccaidThird, ccacategoryThird));

						}

						else if (adminChoice == 4) {
							System.out.println("Registered Parents: \n");
							String Pname = Helper.readString("Please Enter Parent Name:");
							String PChildName = Helper.readString("Please Enter Parent's Email: ");
							

							System.out.println(addParent(Pname, "", PChildName, ""));

						}

						else if (adminChoice == 5) {
							adminCCAStudentRegistered();

						}

						else if (adminChoice == 6) {

							System.out.println(displayParentsName());
						}

						else if (adminChoice == 7) {

							System.out.println(displayCCA());

						} else if (adminChoice == 8) {

							System.out.println(displayCCACategory());

						} else if (adminChoice == 9) {

							String strStud[] = new String[student.size()];

							for (int j = 0; j < student.size(); j++) {

								strStud[j] = student.get(j).name;
							}

						

							int del1 = Helper.getUserOption("Choose Students To Delete", strStud);
							if (del1 == 0)
								break;
							
							else {
								for (int ii = 0; ii < student.size(); ii++) {
									if (student.get(ii).name.equals(strStud[del1 - 1])) {
										
										if (Helper.readBoolean("Do you really want to delete ?")) {
											student.remove(ii);
											System.out.println("Successfully Deleted");
										} else {
											System.out.println("Not Deleted");
										}

									}
								}
							}

						} else if (adminChoice == 10) {

							// String ccaIdDel = Helper.readString("Please CCAID to Delete: ");
							int del2 = Helper.getUserOption("Choose CCA to Delete", ccas);
							if (del2 == 0)
								break;
							else {

								// String sTest = Helper.readString();
								if (Helper.readBoolean("Do you really want to delete ?")) {
									System.out.println("Successfully Deleted");
								}

							}

						} else if (adminChoice == 11) {
							String ccaArray[] = new String[CCACate.size()];

							for (int j = 0; j < CCACate.size(); j++) {

								ccaArray[j] = CCACate.get(j).ccaCategory;
							}

							int del3 = Helper.getUserOption("Choose CCA Category to Delete", ccaArray);
							if (del3 == 0)
								break;
							
							else {
								for (int jj = 0; jj < CCACate.size(); jj++) {
									if (CCACate.get(jj).ccaCategory == ccaArray[del3 - 1]) {
										// String sTest = Helper.readString();
										if (Helper.readBoolean("Do you really want to delete ?")) {
											CCACate.remove(jj);
											System.out.println("Deleted Succerssfully");
										} else {
											System.out.println("Not Deleted");
										}
									}
								}
							}
						}

						else if (adminChoice == 12) {
							String parentArray[] = new String[student.size() - 2];

							for (int j = 0; j < student.size() - 2; j++) {
								if (ParentList.get(j).pname != null || ParentList.get(j).pname!= "")
									parentArray[j] = ParentList.get(j).pname;

							}

							int del4 = Helper.getUserOption("Choose Parent Name to Delete: ", parentArray);
							if (del4 == 0)
								break;
							else {
								for (int j=0; j<ParentList.size();j++) {
									if (ParentList.get(j).pname.equals(parentArray[del4 - 1])) {
										// String sTest = Helper.readString();
										if (Helper.readBoolean("Do you really want to delete ?")) {
											ParentList.remove(j);
											System.out.println("SuccessFully Deleted ");
										} else {
											System.out.println("Not Deleted");
										}

									}
								}
							}

						} else if (adminChoice == 13) {
							Helper.line(40, "=");
							System.out.println("\r\n" + "CHOOSE WHICH CCA TO UPDATE: \r\n"
									+ "-===============================================================================\r\n"
									+ "[1] 1Little League Soccer\r\n" + "[2] Dig the Ground\r\n" + "[3] Bakery\r\n"
									+ "[4] Jewellery Making and LEGO Expert\r\n"
									+ "==================================================================================\r\n"
									+ "");
							int ccaChoose = Helper.readInt("Enter Choice -->");
							if (ccaChoose == 1) {
								for (CCA csc : CCAList) {

									if (csc.title.equals(ccas[ccaChoose - 1])) {
										Helper.line(40, "=");
										System.out.println("\r\n" + "CHOOSE TO EDIT:\r\n"
												+ "-================================================================================\r\n"
												+ "[1] Title\r\n" + "[2] Description\r\n" + "[3] Class Size\r\n"
												+ "[4] Day\r\n" + "[5] Time\r\n" + "[6] Venue\r\n"
												+ "[7] Instructor\r\n"

												+ "================================================================================\r\n"
												+ "");
										int ccaMenu1 = Helper.readInt("Enter Choice -->");
										editCCA(ccaMenu1, csc);
									}
								}
							}

							else if (ccaChoose == 2) {
								for (CCA csc : CCAList) {

									if (csc.title.equals(ccas[ccaChoose - 1])) {
										int ccaMenu1 = Helper.getUserOption("Choose to Edit:", ccaLabels);
										editCCA(ccaMenu1, csc);
									}
								}
							} else if (ccaChoose == 3) {
								for (CCA csc : CCAList) {

									if (csc.title.equals(ccas[ccaChoose - 1])) {
										int ccaMenu1 = Helper.getUserOption("Choose to Edit:", ccaLabels);
										editCCA(ccaMenu1, csc);
									}
								}
							} else if (ccaChoose == 4) {
								for (CCA csc : CCAList) {

									if (csc.title.equals(ccas[ccaChoose - 1])) {
										int ccaMenu1 = Helper.getUserOption("Choose to Edit:", ccaLabels);
										editCCA(ccaMenu1, csc);
									}
								}
							}

						}

						else if (adminChoice == 14) {
							String ccaArray[] = new String[CCACate.size()];

							for (int j = 0; j < CCACate.size(); j++) {

								ccaArray[j] = CCACate.get(j).ccaCategory;
							}

							int del3 = Helper.getUserOption("Which CCA category do you want  to edit:", ccaArray);
							if (del3 == 0)
								break;
							else {
								Helper.line(40, "=");
								System.out.println("\r\n" + "CHOOSE TO EDIT:\r\n"
										+ "-================================================================================-\r\n"
										+ "[1] Edit Category Name\r\n"

										+ "================================================================================\r\n"
										+ "");

							}
							int yrChoice = Helper.readInt("Enter Choice -->");
							String editCate = Helper.readString("Please Enter Category name: ");
							for (CCACategory g : CCACate) {
								if (g.ccaCategory.equals(ccaArray[del3 - 1])) {
									g.ccaCategory = editCate;
								}
							}
							System.out.println("Successfully Edited");

						} else if (adminChoice == 15) {
							int sees = 0;
							String parentArray[] = new String[ParentList.size()];

							for (int j = 0; j < ParentList.size(); j++) {
								sees = 1;

								parentArray[j] = ParentList.get(j).pname;
							}
							if (sees == 0)
								System.out.println("No Parents in the List");
							else {
								int edit1 = Helper.getUserOption("Choose Which Parent's Details to Edit:", parentArray);
								if (edit1 == 0)
									break;
								else {
									for (Parent pep : ParentList) {
										if (pep.pname == parentArray[edit1 - 1]) {
											Helper.line(40, "=");
											System.out.println("\r\n" + "CHOOSE TO EDIT:\r\n"
													+ "================================================================================\r\n"
													+ "[1] Parent Name\r\n" + "[2] Age of Child\r\n"
													+ "[3] Name of Child\r\n" + "[4] Child's Grade level\r\n"
													+ "================================================================================\r\n"
													+ "");
											int pchoiceA = Helper.readInt("Enter choice-->");
											String inps = "";
											if (pchoiceA == 1) {
												inps = Helper.readString("Enter Parent Name: ");
												pep.pname = inps;
											} else if (pchoiceA == 2) {
												inps = Helper.readString("Enter Age of Child: ");
												pep.pChildAge = inps;
											} else if (pchoiceA == 3) {
												inps = Helper.readString("Enter Name of Child: ");
												pep.pChildName = inps;
											} else if (pchoiceA == 4) {
												inps = Helper.readString("Enter Child's Grade level: ");
												pep.pChildGrade = inps;
											}
											System.out.println("Succesfully Edited ");
										}
									}
								}
							}

						} else if (adminChoice == 16) {
							String strStud[] = new String[student.size()];

							for (int j = 0; j < student.size(); j++) {

								strStud[j] = student.get(j).name;
							}

							// String stuName = Helper.readString("Please Enter Name of Student to Delete:
							// ");

							int del1 = Helper.getUserOption("Which student do you want to drop from a CCA:", strStud);
							if (del1 == 0)
								break;
							else {
								for (int p = 0; p < student.size(); p++) {
									if (student.get(p).name.equals(strStud[del1 - 1])) {
										student.get(p).ccaCat = "";
										student.get(p).ccaId = "";
										student.get(p).stuCCA = "";
									}
								}
								System.out.println("Student Successfully Dropped from CCA");

							}
						}

					}
				}

				else {
					int menu = 0;
					for (Student ses1 : student) {
						if (adminUsername.equals(ses1.userName) && adminPassword.equals(ses1.userpassWord)
								&& ses1.age >= 10) {
							while (menu != 1) {
								int check = 0;
								int studentChoice = Helper.getUserOption("Student MENU", studentMenu);
								if (studentChoice == 0)
									
									break;
								
								
								if (studentChoice == 1) {
									String susID = Helper.readString("Please Enter Student ID: ");
									String nameStud = Helper.readString("Please Enter Student Name: ");

									for (Student ses : student) {
										if (ses.studentId.equals(susID) && ses.name.equals(nameStud)) {
											check = 1;
											int chose2 = Helper.getUserOption("Which CCA you want to Join: ", ccas);
											ses.ccaId = ccas[chose2 - 1];
											System.out.println("Sucessfully Joined!");
										}

									}
									if (check == 0)
										System.out.println("Wrong Student ID or Name \n Please Enter Correct One \n\n");

									menu = Helper.readInt("Press 0 to go Back \n Press 1 to Go Back to Application Start: ");

								} else if (studentChoice == 2) {
									int cssCh = 0;
									String susID = Helper.readString("Please Enter Student ID: ");
									String nameStud = Helper.readString("Please Enter Student Name: ");
									for (Student ses : student) {
										if (ses.studentId.equals(susID) && ses.name.equals(nameStud)) {
											cssCh = 11;
											int chose2 = Helper.getUserOption("Which CCA you want to SWAP: ", ccas);
											if (Helper.readBoolean("Do you really want to SWAP ?")) {
												ses.ccaId = ccas[chose2 - 1];
												System.out.println("Sucessfully SWAPPED !");
											}
										}
									}
									if (cssCh == 0)
										System.out.println("Wrong Student ID or Name \n Please Enter Correct One \n\n");
									
									menu = Helper.readInt("Press 0 to go Back Student Menu \n Press 1 to Go Back to Application Start: ");

								}

							}
						}
					}

				}

			}

		}
	}

}
