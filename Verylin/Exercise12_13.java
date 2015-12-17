// import all class from the java util package
import java.util.*;  

// import all class from the java io package
import java.io.*;    

public class Exercise12_13 {

    
    // main method will throw an FileNotFoundException
    public static void main(String[] args) throws FileNotFoundException {

        // create a File object which will take the user command line input as it's fileName
        File fileName = new File(args[0]); 

        // declare and initialize the variable lines of type int to zero
        int lines = 0;
        // declare and initialize the variable numbOfWords of type int to zero
        int numbOfWords = 0;
        // declare and initialize the variable numbOfCharacter of type int to zero
        int numbOfCharacter = 0;

        // declare a variable text of type string
        String text;

        // put the code that can cause exception inside the try block using java 7 feature
        // create scanner object which will read the file
        try (Scanner input = new Scanner(fileName)) { 

            // use an outer while loop to count # of lines while there there is a line left
            while (input.hasNextLine()) {

                // increate the lines count by 1
                lines++;

                // initialize the text string with the line read by the input.nextLine()
                text = input.nextLine(); 
                
                // create a new scanner object that will be used to read each line
                Scanner takeInput = new Scanner(text);

                // use an inner while loop to count the # of word in each line
                while (takeInput.hasNext()) {

                    // increament  the numbOfWords by 1
                    numbOfWords++;             
                    
                    // store each word read by takeInput.next() and store it into the variable word 
                    String word = takeInput.next();
                    
                    // use the length method from the string class to get the # of character in each word
                    // and store it into the numbOfCharacter variable 
                    numbOfCharacter += word.length();
                }

                // close the inner while loop scanner object reader
                takeInput.close();  

            }

            // print the file name inputted by the user 
            System.out.println("\nThe File " + args[0] + " has");
            
            // print the # of character in the file
            System.out.println(numbOfCharacter + " ->" + " Characters");
            
            // print the # of words in the file
            System.out.println(numbOfWords + " ->" + " words");
            
            // print the # of line in the file
            System.out.println(lines + " ->" + " lines");

            // close the file  
            input.close();
        }


    }
}


