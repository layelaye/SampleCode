import java.util.Collections;// import java.util.Collections for sorting students by name
import java.util.InputMismatchException;// import the java.util.InputMismatchException to throw in the main method
import java.util.Scanner; // import the java.util.Scanner for scanning input


//define a teststudent class which extends the student's class
public class TestStudent extends Student {

	// main method for the jvm to run the code with a throw clause (inputMismatchException)
	public static void main(String[] args) throws InputMismatchException{

		double [] set1 = {83,80,84};  // declare and instantiate an array of 3 grades
		double [] set2 = {88, 79,95}; // declare and instantiate an array of 3 grades
		double [] set3 = {93,48,74}; // declare and instantiate an array of 3 grades


		Student s1 = new Student(); // declare and instantiate a no-argument student object
		Student me = new Student("Venise",3245,set1); // declare and instantiate a student object with 3 arguments
		Student you = new Student("Mark",1545,set2); // declare and instantiate a student object with 3 arguments
		Student him = new Student("John",7841,set3);// declare and instantiate a student object with 3 arguments
		Student her = new Student("Carl",0124);// declare and instantiate a student object with 2 arguments
		
		
		arrayStud.add(me); // add student me to the arrayList
		arrayStud.add(you); // add student you to the arrayList
		arrayStud.add(him);// add student him to the arrayList
		arrayStud.add(her);// add student her to the arrayList



		boolean done = false; // declare and initialize the variable to false
		
		while(!done){  // use a while loop to keep displaying the user interface
				System.out.println();
			// menu screen
			System.out.print("******** WELCOME TO THE STUDENTS' GRADES BOOK ********\n*     "
					+ "                                               *\n"+

						"*\t Enter A to Add Students                     *\n"+
						"*\t Enter B to Enter Test Grades                *\n"+
						"*\t Enter C to Display Students Records         *\n"+
						"*\t Enter D to Exit Grade Book                  *\n*    "
						+ "                                                *\n*"+
					"*****************************************************\n");

			Scanner input = new Scanner(System.in); // declare and instantiate the Scanner object
			
			String choice = input.nextLine(); // initialize the String variable choice


			// if user letter "A"
			if (choice.equalsIgnoreCase("A") ){



				Scanner add = new Scanner(System.in);// declare and instantiate the scanner object
				System.out.print("Enter student's name: ");// prompt user to enter a student's name
				String name1 = add.nextLine();				// save the name in the string variable name1
				System.out.print("Enter "+name1+"'s"+" id: ");// prompt user the enter the student's id
				int id1 = add.nextInt();					// save the id in the variable id1
				System.out.print("Enter "+name1+"'s"+" "+"1st grade or -1 for unset grade:");// prompt user the to enter 1st grade or -1 
				double test1 = add.nextDouble();          // save the grade in the variable test1
				System.out.print("Enter "+name1+"'s"+" "+"2nd grade or -1 for unset grade:");// prompt user to enter 2nd grade or -1
				double test2 = add.nextDouble();									// save the 2nd grade 
				System.out.print("Enter "+name1+"'s"+" "+"3rd grade or -1 for unset grade:");//prompt user to enter 3rd grade or -1
				double test3 = add.nextDouble();						// save the third grade

				if(name1 != null && !name1.isEmpty() && id1 != 0 ){ //if student has a valid name and id then increment the student's count by 1
					numberOfStudents++;
				}


				s1.setName(name1); // set the new student's name 
				s1.setId(id1);// set the new student's id

				double [] newArrayOfGrades = {test1,test2,test3}; //save the 3 grades in an array 
				s1.setGradeArray(newArrayOfGrades);// set the newly created array 
				System.out.println("\n");// print 2 empty lines for making output more readable
				arrayStud.add(s1);// add the newly created student into the arrayList
				System.out.println();
				System.out.println(s1.toString(s1));// display the newly created student object
				System.out.println("TOTAL NUMBER OF STUDENTS: "+numberOfStudents+"\n\n");// display the current count of student object




		// if user chose "B"
		}else if (choice.equalsIgnoreCase("B")){
				
				// prompt the user select which test he/she wants to update
				System.out.print("Enter 1, 2 or 3 for the test# you want to update: ");	
				Scanner testInput = new Scanner(System.in); // declare and instantiate a scanner object
				int testToUpdate = testInput.nextInt()-1 ;//save the number entered -1 as array index starts at zero
				int tester = numberOfStudents;// use variable instead of the static variable for the control loop variable int the for loop

						if (testToUpdate == 0){// if user chose test1 which is at index 0
								// use a for loop to retrieve student's object
								for ( int i = 1; i <= tester; ++i){
									Student currentStudent = arrayStud.get(i-1);//student at index 0
									//display the current student's info
									System.out.println("\n"+currentStudent.toString(currentStudent));
									//prompt the user to enter the new grade 
									System.out.print("Enter new grade for student#"+i+" test#1 "+ "or -1 for null:");
									double newGrade1 = testInput.nextDouble();// save the new grade
									if (newGrade1 != -1.0 ){// check if new grade is not null
										// set the new grade at the testToUpdate index
										arrayStud.get(i-1).setGrade(testToUpdate, newGrade1);
							
										// if grade entered is null then keep the grade in place
										}else{
										double current1 = arrayStud.get(i-1).getGrade(0);
										arrayStud.get(i-1).setGrade(testToUpdate,current1 );
									}
								}	

						}else if(testToUpdate == 1){// if user chose test1 which is at index 0

							
							// use a for loop to retrieve student's object
							for ( int i = 1; i <= tester; ++i){
								Student currentStudent = arrayStud.get(i-1);//student at index 1
								//display the current student's info
								System.out.println(currentStudent.toString(currentStudent));
								//prompt the user to enter the new grade
								System.out.print("Enter new grade for student#"+i+" test#2 "+ "or -1 for null:");
								double newGrade2 = testInput.nextDouble();// save the new grade
								if (newGrade2 != -1.0 ){// check if new grade is not null
									// set the new grade at the testToUpdate index
									arrayStud.get(i-1).setGrade(testToUpdate, newGrade2);
									
									// if grade entered is null then keep the grade in place
									}else{
									double current2 = arrayStud.get(i-1).getGrade(testToUpdate);
									arrayStud.get(i-1).setGrade(testToUpdate,current2 );
								}
							}	

							// if user chose test1 which is at index 0
						}else if(testToUpdate == 2){
							// use a for loop to retrieve student's object
								for ( int i = 1; i <= tester; ++i){
									Student currentStudent = arrayStud.get(i-1);//student at index 2
									//display the current student's info
									System.out.println(currentStudent.toString(currentStudent));
									//prompt the user to enter the new grade
									System.out.print("Enter new grade for student#"+i+" test#3 "+ "or -1 for null:");
									double newGrade3 = testInput.nextDouble();// save the new grade
									if (newGrade3 != -1.0 ){// check if new grade is not null
										// set the new grade at the testToUpdate index
										arrayStud.get(i-1).setGrade(testToUpdate, newGrade3);
										System.out.println("\n");
										
										// if grade entered is null then keep the grade in place
											}else{
											double current3 = arrayStud.get(i-1).getGrade(testToUpdate);
											arrayStud.get(i-1).setGrade(testToUpdate,current3 );
											System.out.println("\n");
										}	
					
									}	
								}
		// if user chose "C"
		}else if (choice.equalsIgnoreCase("C")){
				// print the total number of students
				System.out.println("TOTAL NUMBER OF STUDENTS: " + numberOfStudents+"\n" );
				
				// use a try/catch block for sort method that might cause an exception
				try {
					Collections.sort(arrayStud);// call Collections.sort() to sort the students by name
				} catch (NullPointerException e) {
					System.out.println("Check, there is an unset student's infos\n");
					
				}
				for (Student list: arrayStud )// user a for each loop to print out every student's info 
					System.out.println(list.toString(list));
		
		// if user chose "D"		
		}else if (choice.equalsIgnoreCase("D")){
				System.out.println("Exiting The Program........."); // print exiting the program
				System.exit(0);		// use system.exit(0) to exit 

			// if user enter an invalid option 
			}else{ 
				System.out.println("Invalid Option.Try agaoin!");
			}		done = false;

		}// end of while


	}// end of main	


	

}//end TestStudent class
