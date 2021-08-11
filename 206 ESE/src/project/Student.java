package project;


public class Student 
{
	public int age;
	public String studentId;
	public String userName;
	public String userpassWord;
	public String name;
	public String grade;
	public String teacher;
	public String parentName;
	public String parentEmail;
	public int number;
	public String ccaCat;
	public String stuCCA;
	public String ccaId;
	
	
	public Student(int age, String studentId, String userName, String userpassWord, 
			String name, String grade, String teacher, String parentName, 
			String parentEmail, int number,String stuCCA)
	{
	
		this.age = age;
		this.studentId = studentId;
		this.userName = userName;
		this.userpassWord = userpassWord;
		this.name = name;
		this.grade = grade;
		this.teacher = teacher;
		this.parentName = parentName;
		this.parentEmail = parentEmail;
		this.number = number;
		this.ccaCat="";
		this.ccaId = "";
	    this.stuCCA = "";
	}



}
