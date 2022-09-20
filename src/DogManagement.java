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

	
    [REPLACE MY INFORMATION WITH YOURS]
    Course: COMP 170, Fall 1 2022
    System: Visual Studio Code, Windows 10
    Author: C. Fulton
*/

import java.util.Scanner; //Importing Scanner Class
public class DogManagement {
    /*
     * Global Declaration for parallel arrays and Scanner Object
     */
    //DECLARING PARALEL ARRAYS OUTSIDE OF MAIN METHOD TO HOLD DOG DATA use the static keyword


    //DECLARING SCANNER OBJECT
    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        
        

    }

    //Welcome method that outputs introductory text explaining program
    public static void welcome(){
        System.out.println("Welcome, this program allows for a care attendant to be able to create, retrieve and update a dog record from the system.");
    }

    //Method to display prompt and return integer values
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
        menuOption = Integer.parseInt(scn.nextLine());

        return menuOption;
    }

  
    

}
