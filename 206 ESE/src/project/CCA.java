package project;

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
