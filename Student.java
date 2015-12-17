import java.util.*; // import the java util package

//define a class Student with extends the StudentArray class
public class Student extends StudentArray  {
	
	
	 /* declare 2 instance variables name, id, and 1 reference variable grades 
	 * and encapsulate them to be visible in student class only
	 */
		
	private String name; 
	private int id;
	private double[] grades = new double[3];

	public Student(){  // no-argument constructor used to clear student's data
		name = null;
		id = 0;
		grades[0]= -1;
		grades[1]= -1;
		grades[2]= -1;
	}

	// overloaded // constructor with 2 parameters to initialize name and idconstructor with 2 parameters to initialize name and id
	public Student(String myname, int myid){ 
		name = myname;
		id = myid;
		grades[0]= -1;
		grades[1]= -1;
		grades[2]= -1;

	// use the static variable from StudentArray Class to keep count of the number of student object
		numberOfStudents++; 
	}

	// overloaded constructor to initialize the name,id , grades array
	public Student(String myname, int myid , double[] theGradeArray){ 

		name = myname;
		id = myid;
		grades = theGradeArray;
		
	// use the static variable from StudentArray Class to keep count of the number of student object
		numberOfStudents++;
	}

	
	// getName method that return student's  name
	public String getName() {
		return name;
	}

	// setName method to set the name
	public void setName(String name) {
		this.name = name;
	}

	//getId method to return the student's id
	public int getId() {
		return id;
	}

	// setId method to set the student's id
	public void setId(int id) {
		this.id = id;
	}
	
	//setGrade method to set a test grade at a given index
	public boolean setGrade (int index, double newGrade){

		if ((index >= 0 && index <= 2) && (newGrade >= 0 && newGrade <=100)){

			grades[index] = newGrade;
			if (grades[index] == newGrade)
				return true;
			else 
				return false;
		}else{ 
			System.out.println("Please enter a valid index and grade.");
			return false;
		}

	}

	
	// getGrade method to return the student's test grade at the given index
	public double getGrade(int index) {

		if (index >= 0 && index <= 2 ){
			return grades[index];
		}else{
			System.out.println("Index must be positive and less than 3");
			return index;
		}		

	}

	// setGradeArray method to set a new grade array object 
	public boolean setGradeArray(double[] newGradeArray) {

		grades = newGradeArray;
		if (grades.equals(newGradeArray))
			return true;
		else 
			return false;

	}

	// getAverage method to return a student's current average
	public double getAverage(){

		double sum = 0.0;
		double average = 0.0;

		for (int i = 0; i < grades.length; ++i)
			sum += grades[i];
		average = sum /grades.length;
		
		String num = String.format("%.2f", average);
		double formattedNumber = Double.parseDouble(num);
		return formattedNumber;

	}
	
	// getLetterGrade method which return the student's letter grade
	public String getLetterGrade(double average){

		if (average >= 93){
			return "A";
		}else if(average >= 90 && average <= 92.9){
			return "A-";
		}else if(average >= 87 && average <= 89.9){
			return "B+";

		}else if(average >= 83 && average <= 86.9){
			return "B";
		}else if(average >= 80 && average <= 82.9){
			return "B-";

		}else if(average >= 77 && average <= 79.9){
			return "C+";
		}else if(average >= 73 && average <= 76.9){
			return "C";

		}else if(average >= 70 && average <= 72.9){
			return "C-";
		}else if(average >= 67 && average <= 69.9){
			return "D+";


		}else if(average >= 63 && average <= 66.9){
			return "D";

		}else if(average >= 60 && average <= 62.9){
			return "D-";

		}else if ( average  >= 0 && average < 60){

			return "F";
		}
		return "I";	 // I for incomplete	
	}

	
	// override the toString method in order to have nicer output 
	public  String toString(Student s){


		return "******************************************************\n*"+ 

					" Name      #"+" "+s.getName()+"\n*"+
					" id number # "+s.getId()+ "\n*"+
					" Grades    # "+s.getGrade(0)+" |"+ s.getGrade(1)+" |"+s.getGrade(2)+"\n*"+
					" Grade Average# "+ s.getAverage()+"\n*"+
					" Letter Grade # "+ s.getLetterGrade(s.getAverage())+
					"\n******************************************************\n";


	}

	// override the compareTo method from the comparable interface in order to sort students by name
	@Override
	public int compareTo(Student o) throws NullPointerException{
		String name1 = this.getName().toLowerCase();
		String name2 = o.getName().toLowerCase();
		return name1.compareTo(name2);
	}


}		


