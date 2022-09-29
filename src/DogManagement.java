/*--------------------------------------------
Program 5: MPLS Dog Management System
**Programs 5 and 6 will be similar in functionality.**
The MPLS Dog Boarding company would like for you to create an application that allows for a care attendant to be able 
to create, retrieve and update dog records from the system. MPLS Dog Boarding can only have 12 dogs in their care at a time. When you select the option to **create** a dog record.  You will 
enter the dog's id, dog's name, weight and dog's age  Once information is entered for a dog, the program will display
entered information and reprompt the care attendent to select an option to exit, display, create or update dog records.  When the **update** option
is selected the care attendant will be presented with option to enter the dog's id number and reassign information
pertaining to dog.  When the **retrieve** option is selected, the user will be able to enter the dog's id and be presented
with dog information.

**Hints**
- Consider the use of parallel arrays to store dog Data.  **Declare your arrays at the class level and not in the main method.**
- Consider commenting your code and writing the code in the main method before modularizing the program.
 
#### Listed below is a detailed explanation of the requirements needed to complete the dog management system.  

## Requirement 1 (5 Points) 
Variables are properly declared and initialized; Use of Scanner Object to read input from console. Make use of constant final variables. 
Whenever possible, make sure to declare all variables that will hold data along with declaring final variables that will not change during runtime.
Proper structure used for allowing the end-user to continously select menu option until a sentinel value is entered.

## Requirement 2 (5 Points) 
Input/Output of all necessary information for each item entry; Program properly makes use of arrays/multi-dimensional arrays to structure data;
Program only accepts dog id numbers that have been entered.

## Requirement 3 (5 Points) 
The program should consist of a minimum of 5 methods.  
    1) A welcome method that describes the program.  
    2) A method to display the selection prompt
    3) A method that allows the care attendant to enter a record.  
    4) A method that allows the care attendant to update a record and 
    5) A method that allows the care attendant to retrieve an existent record.

## Requirement 4 (5 Points) 
Style - Proper use of comments, spacing, in program; use of descriptive variable names

## Requirement 5 (5 Points) 
Program is submitted by the due date listed and pushed to assigned GitHub Repository; Repository contains a minimum of three commits.

	
    
    Course: COMP 170, Fall 1 2022
    System: Visual Studio Code, macOS 11.2.1
    Author: Emma Dean
*/

import java.util.Scanner; //Importing Scanner Class
public class DogManagement {
    /*
     * Global Declaration for parallel arrays and Scanner Object
     */
    //DECLARING PARALEL ARRAYS OUTSIDE OF MAIN METHOD TO HOLD DOG DATA use the static keyword
    final static int dogArraysCapacity = 12;

    static int[] dogIDArray = new int[dogArraysCapacity];
    static String[] dogNameArray = new String[dogArraysCapacity];
    static double[] dogWeightArray = new double[dogArraysCapacity];
    static int[] dogAgeArray = new int[dogArraysCapacity];
    
    static int menuChoice;
    static int dogArraysSize = 0;  //this will increment inside CREATE and UPDATE methods


    //DECLARING SCANNER OBJECT
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        //call welcome()
        welcome();

        //LOOP?
        do {
            //call displayPrompt() and assign returned menuOption to menuChoice
            menuChoice = displayPrompt();
                //if menuChoice = 1,2,3 call corresponding method
                if (menuChoice == 1) {
                    dogArraysSize = createDog(dogArraysCapacity, dogArraysSize);
                }
                else if (menuChoice == 2) {
                    displayDog();
                }
                else if (menuChoice == 3) {
                    //FIXME call update
                }
                //if menuChoice != 1,2,3,4, print "Invalid menu option" and re-call displayPrompt()
                else if (menuChoice != 4) {
                    System.out.println("Invalid menu option.");
                }
        //if menuChoice = 4, print "Program has ended!" and throw exception
        } while (menuChoice != 4); // sentinel value
        
        //end
        System.out.println("Program has ended!");
       
        

    }

    //WELCOME METHOD
    public static void welcome(){
        System.out.println("Welcome, this program allows for a care attendant to be able to create, retrieve and update a dog record from the system.");
    }

    //PROMPT METHOD
    public static int displayPrompt(){
        //Local Variables
        int menuOption;

        System.out.println("\nSelect a menu option:");
        System.out.println("\t1) Create a dog record");
        System.out.println("\t2) Display dog record");
        System.out.println("\t3) Update dog record");
        System.out.println("\t4) Exit Program");
        
        System.out.print("Enter selection here --> ");
        //INPUT
        menuOption = input.nextInt();   //original: menuOption = Integer.parseInt(input.nextLine())

        return menuOption;
    }

    //CREATE METHOD (1) //*TESTED*
    /* input: dogID, dogName, dogWeight, dogAge
     * output: dogID, dogName, dogWeight, dogAge
     * replace with doc comment (5.15)
     * see 5.10- updating arrays in methods
     * return currentSize and assign to dogsArraySize in call
     * called like: dogArraysSize = createDog(dogArraysCapacity, dogArraysSize)
     */
    public static int createDog(int arraysCapacity, int currentSize){ 
        //declare local variables
        int newDogID;
        String newDogName;
        double newDogWeight;
        int newDogAge;

        // Check that array has space 
        if (currentSize == arraysCapacity) {
            System.out.println("Sorry, the maximum number of dogs has been reached. Cannot create new dog.");    
            return currentSize;  
        }

        // If array has space, add the element to the arrays and increment array(s) size
        System.out.println("You have selected to enter a new dog.");
        System.out.print("Enter dog ID #: ");
        newDogID = input.nextInt();
        System.out.print("Enter dog Name: ");
        newDogName = input.next();
        System.out.print("Enter dog weight: ");
        newDogWeight = input.nextDouble();
        System.out.print("Enter dog age: ");
        newDogAge = input.nextInt();

        dogIDArray[currentSize] = newDogID;
        dogNameArray[currentSize] = newDogName;
        dogWeightArray[currentSize] = newDogWeight;
        dogAgeArray[currentSize] = newDogAge;
        ++currentSize; 
        return currentSize;
    }


    //DISPLAY METHOD (2)
    /* input: dogID
     * output: printDogArrays();, new dogID, new dogName, new dogWeight, new dogAge
     * replace with doc comment (5.15)
     * void return
     */
    public static void displayDog() {
        int dogIDChoice = 0;
        int dogChoiceIndex;

        printDogArrays();
        System.out.print("Please enter ID # to from above to display record: ");
        dogIDChoice = input.nextInt();
        dogChoiceIndex = search(dogIDArray, dogIDChoice);   //call search

        if (dogChoiceIndex == -1) {
            System.out.println("Id # does not match dog id in system");
        }
        else {
            System.out.println("ID #: " + dogIDArray[dogChoiceIndex]);
            System.out.println("Name #: " + dogNameArray[dogChoiceIndex]);
            System.out.println("Weight #: " + dogWeightArray[dogChoiceIndex]);
            System.out.println("Age #: " + dogAgeArray[dogChoiceIndex]);
        }
    }

    //SEARCH METHOD
    public static int search(int dogArray[], int dogChoice) {
        int i;

        for (i = 0; i < dogArray.length; ++i) {
            if (dogArray[i] == dogChoice) { //can use "==" here?
                return i;
            }
        }
        return -1;
    }
    //UPDATE METHOD (3)
    /* input: dog ID, dogName, dogWeight, dogAge
     * output: printDogArrays();, new dogID, new dogName, new dogWeight, new dogAge
     * replace with doc comment (5.15)
     * void return
     */



    //PRINT current dogs (called in DISPLAY and UPDATE methods) *TESTED*
    public static void printDogArrays() {
        int i;  //local variable
        for (i = 0; i < dogArraysSize; i++){
            System.out.println("ID #: " + dogIDArray[i] + " for " + dogNameArray[i]);
            }
    }
    

}
