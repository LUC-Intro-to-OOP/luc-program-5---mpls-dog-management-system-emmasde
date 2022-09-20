# Program 5: MPLS Dog Management System
**Programs 5 and 6 will be similar in functionality.**

The MPLS Dog Boarding company would like for you to create an application that allows for a care attendant to be able 
to create, retrieve and update dog records from the system. MPLS Dog Boarding can only have 12 dogs in their care at a time. When you select the option to **create** a dog record.  You will 
enter the dog's id, dog's name, weight and dog's age.  Once information is entered for a dog, the program will display
entered information and reprompt the care attendent to select an option to exit, display, create or update dog record.  

When the **update** option is selected the care attendant will be presented with option to enter the dog's id number and reassign information
pertaining to dog.  

When the **retrieve** option is selected, the user will be able to enter the dog's id and be presented
with dog information.

**Hints**
- Consider the use of parallel arrays to store dog Data.  **Declare your arrays at the class level and not in the main method.**
- Consider commenting your code and writing the code in the main method before modularizing the program.

Your program should operate similarly to the program shown in the .gif below The .gif below show three iterations of running the program

![Alt text](https://instructorc.github.io/site/slides/java/images/methods/sample_output_prog5.gif "Program 5 Execution Example")

**SAMPLE OUTPUT BELOW**
```
Welcome, this program allows for a care attendant to be able to create, retrieve and update a 
dog record from the system.

Select a menu option:
        1) Create a dog record
        2) Display dog record 
        3) Update dog record  
        4) Exit Program       
Enter selection here --> 7    
Invalid menu option

Select a menu option:
        1) Create a dog record
        2) Display dog record 
        3) Update dog record  
        4) Exit Program       
Enter selection here --> 6    
Invalid menu option

Select a menu option:
        1) Create a dog record
        2) Display dog record 
        3) Update dog record  
        4) Exit Program       
Enter selection here --> 1    
You have selected to enter a new dog.
Enter dog ID #: 12
Enter dog Name: Mavis
Enter dog weight: 20
Enter dog age: 2

The following information has been entered:
        ID #: 12
        Name #: Mavis
        Weight #: 20
        Age #: 2

Select a menu option:
        1) Create a dog record
        2) Display dog record
        3) Update dog record
        4) Exit Program
Enter selection here --> 1
You have selected to enter a new dog.
Enter dog ID #: 3
Enter dog Name: Cujo
Enter dog weight: 53
Enter dog age: 3

The following information has been entered:
        ID #: 3
        Name #: Cujo
        Weight #: 53
        Age #: 3

Select a menu option:
        1) Create a dog record
        2) Display dog record
        3) Update dog record
        4) Exit Program
Enter selection here --> 2
 
ID #: 12 for Mavis
ID #: 3 for Cujo
Please enter ID # to from above to display record: 7
Id # does not match dog id in system

Select a menu option:
        1) Create a dog record
        2) Display dog record
        3) Update dog record
        4) Exit Program
Enter selection here --> 2
 
ID #: 12 for Mavis
ID #: 3 for Cujo
Please enter ID # to from above to display record: 3
        ID #: 3
        Name #: Cujo
        Weight #: 53
        Age #: 3

Select a menu option:
        1) Create a dog record
        2) Display dog record
        3) Update dog record
        4) Exit Program
Enter selection here --> 3
ID #: 12 for Mavis
ID #: 3 for Cujo
Please enter the dog ID # to update record
6
Id # does not match dog id in system

Select a menu option:
        1) Create a dog record
        2) Display dog record
        3) Update dog record
        4) Exit Program
Enter selection here --> 3
ID #: 12 for Mavis
ID #: 3 for Cujo
Please enter the dog ID # to update record
12
You have selected to update Mavis
Enter dog ID #: 1
Enter dog Name: Lucky
Enter dog weight: 10
Enter dog age: 4

The following information has been updated:
        ID #: 1
        Name #: Lucky
        Weight #: 10
        Age #: 4

Select a menu option:
        1) Create a dog record
        2) Display dog record
        3) Update dog record
        4) Exit Program
Enter selection here --> 2
 
ID #: 1 for Lucky
ID #: 3 for Cujo
Please enter ID # to from above to display record: 1
        ID #: 1
        Name #: Lucky
        Weight #: 10
        Age #: 4

Select a menu option:
        1) Create a dog record
        2) Display dog record
        3) Update dog record
        4) Exit Program
Enter selection here --> 4
Program has ended!
```

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
    1. A welcome method that describes the program.  *Already provided via starter code
    2. A method to display the selection prompt *Already provided via starter code
    3. A method that allows the care attendant to enter a record.  
    4. A method that allows the care attendant to update a record and 
    5. A method that allows the care attendant to retrieve an existent record.

## Requirement 4 (5 Points) 
Style - Proper use of comments, spacing, in program; use of descriptive variable names

## Requirement 5 (5 Points) 
Program is submitted by the due date listed and pushed to assigned GitHub Repository; Repository contains a minimum of three commits.

## Submission
Your project folder will need to be submitted to the assigned GitHub repository provided to you by the instructor. In Sakai, you will need to submit the link to your repository by the due date and time listed in the write-up. Make sure you receive confirmation from Sakai that your assignment has been submitted.
If you prefer, you can also submit the .java file to Sakai.
