package project;

/**
 * We declare that this code was written by us .
 * We will not copy or allow others to copy our code.
 * We understand that copying code is considered as plagiarism.
 *
 * Team 4, 10 Jul 2021 11:37:38 am
 */



public class CCA 
{
	public String title;
	public String description;
	public int classSize;
	public String day;
	public String time;
	public String venue;
	public String nameOfInstructor;
	public String idOfCCA;
	
	public CCA(String title, String description, int classSize, 
			String time,String day, String venue, 
			String nameOfInstructor,String idOfCCA)
	
	{
	    this.title = title;
	    this.description = description;
	    this.classSize = classSize;
	    this.time = time;
	    this.venue = venue;
	    this.day = day;
	    this.nameOfInstructor = nameOfInstructor;
	    this.idOfCCA = idOfCCA;
	}

    public String CCAcategory()
	{
	   return this.description;
	}


}
